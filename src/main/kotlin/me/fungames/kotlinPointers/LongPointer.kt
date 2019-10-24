package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type long from the given array
 * @author FunGames
 */
class LongPointer (private val data : LongArray) {

    /**
     * Creates a pointer for the primitive type long from a newly allocated array with the given size
     */
    constructor(size : Int) : this(LongArray(size))

    /**
     * Creates a pointer for the primitive type long from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Long) : this(LongArray(size, init))

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

    operator fun inc() : LongPointer {
        pos++
        return this
    }

    operator fun dec() : LongPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Long {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Long) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : LongPointer {
        val p = LongPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : LongPointer {
        val p = LongPointer(this.data)
        p.pos = pos + increment
        return p
    }

}