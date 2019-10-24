package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type char from the given array
 * @author FunGames
 */
class CharPointer (private val data : CharArray) {

    /**
     * Creates a pointer for the primitive type char from a newly allocated array with the given size
     */
    constructor(size : Int) : this(CharArray(size))

    /**
     * Creates a pointer for the primitive type char from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Char) : this(CharArray(size, init))

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

    operator fun inc() : CharPointer {
        pos++
        return this
    }

    operator fun dec() : CharPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Char {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Char) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : CharPointer {
        val p = CharPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : CharPointer {
        val p = CharPointer(this.data)
        p.pos = pos + increment
        return p
    }

}