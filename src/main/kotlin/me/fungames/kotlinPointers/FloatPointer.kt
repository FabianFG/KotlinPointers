package me.fungames.kotlinPointers


/**
 * @constructor Creates a pointer for the primitive type float from the given array
 * @author FunGames
 */
class FloatPointer (private val data : FloatArray) {

    /**
     * Creates a pointer for the primitive type float from a newly allocated array with the given size
     */
    constructor(size : Int) : this(FloatArray(size))

    /**
     * Creates a pointer for the primitive type float from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Float) : this(FloatArray(size, init))

    fun asArray() = data

    private var pos = 0
    val size : Int = data.size

    operator fun plusAssign(i : Int) {
        pos += i
    }

    operator fun minusAssign(i : Int) {
        pos -= i
    }

    operator fun inc() : FloatPointer {
        pos++
        return this
    }

    operator fun dec() : FloatPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Float {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Float) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : FloatPointer {
        val p = FloatPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : FloatPointer {
        val p = FloatPointer(this.data)
        p.pos = pos + increment
        return p
    }

}