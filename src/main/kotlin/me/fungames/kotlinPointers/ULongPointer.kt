package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type ulong from the given array
 * @author FunGames
 */
@ExperimentalUnsignedTypes
class ULongPointer (private val data : ULongArray) {

    /**
     * Creates a pointer for the primitive type ulong from a newly allocated array with the given size
     */
    constructor(size : Int) : this(ULongArray(size))

    /**
     * Creates a pointer for the primitive type ulong from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> ULong) : this(ULongArray(size, init))

    fun asArray() = data

    var pos = 0
        private set
    val size : Int = data.size

    operator fun plusAssign(i : Int) {
        pos += i
    }

    operator fun minusAssign(i : Int) {
        pos -= i
    }

    operator fun inc() : ULongPointer {
        pos++
        return this
    }

    operator fun dec() : ULongPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : ULong {
        return data[pos + i]
    }

    operator fun set(i : Int, b : ULong) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : ULongPointer {
        val p = ULongPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : ULongPointer {
        val p = ULongPointer(this.data)
        p.pos = pos + increment
        return p
    }

}