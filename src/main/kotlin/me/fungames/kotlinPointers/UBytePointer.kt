package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type ubyte from the given array
 * @author FunGames
 */
@ExperimentalUnsignedTypes
class UBytePointer (private val data : UByteArray) {

    /**
     * Creates a pointer for the primitive type ubyte from a newly allocated array with the given size
     */
    constructor(size : Int) : this(UByteArray(size))

    /**
     * Creates a pointer for the primitive type ubyte from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> UByte) : this(UByteArray(size, init))

    fun asArray() = data

    private var pos = 0
    val size : Int = data.size

    operator fun plusAssign(i : Int) {
        pos += i
    }

    operator fun minusAssign(i : Int) {
        pos -= i
    }

    operator fun inc() : UBytePointer {
        pos++
        return this
    }

    operator fun dec() : UBytePointer {
        pos--
        return this
    }

    operator fun get(i : Int) : UByte {
        return data[pos + i]
    }

    operator fun set(i : Int, b : UByte) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : UBytePointer {
        val p = UBytePointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : UBytePointer {
        val p = UBytePointer(this.data)
        p.pos = pos + increment
        return p
    }

}