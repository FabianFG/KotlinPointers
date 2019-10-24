package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the primitive type boolean from the given array
 * @author FunGames
 */
class BooleanPointer (private val data : BooleanArray) {

    /**
     * Creates a pointer for the primitive type boolean from a newly allocated array with the given size
     */
    constructor(size : Int) : this(BooleanArray(size))

    /**
     * Creates a pointer for the primitive type boolean from a newly allocated array with the given size and the given initialization
     */
    constructor(size: Int, init : (Int) -> Boolean) : this(BooleanArray(size, init))

    fun asArray() = data

    var pos = 0
        private set
    val size : Int = data.size

    operator fun inc() : BooleanPointer {
        pos++
        return this
    }

    operator fun dec() : BooleanPointer {
        pos--
        return this
    }

    operator fun get(i : Int) : Boolean {
        return data[pos + i]
    }

    operator fun set(i : Int, b : Boolean) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : BooleanPointer {
        val p = BooleanPointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : BooleanPointer {
        val p = BooleanPointer(this.data)
        p.pos = pos + increment
        return p
    }

}