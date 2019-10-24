package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type uint from the given array
 * @author FunGames
 */
@ExperimentalUnsignedTypes
class UIntPointer (private val data : UIntArray) {

    /**
     * Creates a pointer for the primitive type uint from a newly allocated array with the given size
     */
    constructor(size : Int) : this(UIntArray(size))

    /**
     * Creates a pointer for the primitive type uint from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> UInt) : this(UIntArray(size, init))

    fun asArray() = data

    var pos = 0
        private set
    val size : Int = data.size

    operator fun inc() : UIntPointer {
        pos++
        return this
    }

    operator fun dec() : UIntPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : UInt {
        return data[pos + i]
    }

    operator fun set(i : Int, b : UInt) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : UIntPointer {
        val p = UIntPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : UIntPointer {
        val p = UIntPointer(this.data)
        p.pos = pos + increment
        return p
    }

}