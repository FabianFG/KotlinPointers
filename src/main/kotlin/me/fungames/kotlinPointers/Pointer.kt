package me.fungames.kotlinPointers

/**
 * @constructor Creates a pointer for the given type from the given array
 * @author FunGames
 */
class Pointer<T> (private val data : Array<T>) {

    fun asArray() = data

    var pos = 0
        private set
    val size : Int = data.size

    operator fun inc() : Pointer<T> {
        pos++
        return this
    }

    operator fun dec() : Pointer<T> {
        pos--
        return this
    }

    operator fun get(i : Int) : T {
        return data[pos + i]
    }

    operator fun set(i : Int, b : T) {
        data[pos + i] = b
    }

    operator fun minus(decrement : Int) : Pointer<T> {
        val p = Pointer(this.data)
        p.pos = pos - decrement
        return p
    }

    operator fun plus(increment : Int) : Pointer<T> {
        val p = Pointer(this.data)
        p.pos = pos + increment
        return p
    }

}