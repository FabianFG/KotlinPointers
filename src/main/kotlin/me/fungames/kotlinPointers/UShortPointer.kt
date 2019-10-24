package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type ushort from the given array
 * @author FunGames
 */
@ExperimentalUnsignedTypes
class UShortPointer (private val data : UShortArray) {

    /**
     * Creates a pointer for the primitive type ushort from a newly allocated array with the given size
     */
    constructor(size : Int) : this(UShortArray(size))

    /**
     * Creates a pointer for the primitive type ushort from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> UShort) : this(UShortArray(size, init))

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

    operator fun inc() : UShortPointer {
        pos++
        return this
    }

    operator fun dec() : UShortPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : UShort {
        return data[pos + i]
    }

    operator fun set(i : Int, b : UShort) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : UShortPointer {
        val p = UShortPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : UShortPointer {
        val p = UShortPointer(this.data)
        p.pos = pos + increment
        return p
    }

}