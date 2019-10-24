package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type short from the given array
 * @author FunGames
 */
class ShortPointer (private val data : ShortArray) {

    /**
     * Creates a pointer for the primitive type short from a newly allocated array with the given size
     */
    constructor(size : Int) : this(ShortArray(size))

    /**
     * Creates a pointer for the primitive type short from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Short) : this(ShortArray(size, init))

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

    operator fun inc() : ShortPointer {
        pos++
        return this
    }

    operator fun dec() : ShortPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Short {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Short) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : ShortPointer {
        val p = ShortPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : ShortPointer {
        val p = ShortPointer(this.data)
        p.pos = pos + increment
        return p
    }

}