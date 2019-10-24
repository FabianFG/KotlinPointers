package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type int from the given array
 * @author FunGames
 */
class IntPointer (private val data : IntArray) {

    /**
     * Creates a pointer for the primitive type int from a newly allocated array with the given size
     */
    constructor(size : Int) : this(IntArray(size))

    /**
     * Creates a pointer for the primitive type int from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Int) : this(IntArray(size, init))

    fun asArray() = data

    var pos = 0
        private set
    val size : Int = data.size

    operator fun inc() : IntPointer {
        pos++
        return this
    }

    operator fun dec() : IntPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Int {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Int) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : IntPointer {
        val p = IntPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : IntPointer {
        val p = IntPointer(this.data)
        p.pos = pos + increment
        return p
    }

}