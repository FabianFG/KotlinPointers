package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type double from the given array
 * @author FunGames
 */
class DoublePointer (private val data : DoubleArray) {

    /**
     * Creates a pointer for the primitive type double from a newly allocated array with the given size
     */
    constructor(size : Int) : this(DoubleArray(size))

    /**
     * Creates a pointer for the primitive type double from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Double) : this(DoubleArray(size, init))

    fun asArray() = data

    private var pos = 0
    val size : Int = data.size

    operator fun plusAssign(i : Int) {
        pos += i
    }

    operator fun minusAssign(i : Int) {
        pos -= i
    }

    operator fun inc() : DoublePointer {
        pos++
        return this
    }

    operator fun dec() : DoublePointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Double {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Double) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : DoublePointer {
        val p = DoublePointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : DoublePointer {
        val p = DoublePointer(this.data)
        p.pos = pos + increment
        return p
    }

}