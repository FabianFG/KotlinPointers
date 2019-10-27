package me.fungames.kotlinPointers

/**
 * @return Pointer using the array
 */
fun BooleanArray.asPointer() = BooleanPointer(this)
fun Pointer<Boolean>.toBooleanPointer() : BooleanPointer {
    var p = BooleanPointer(this.asArray().toBooleanArray())
    p += this.pos
    return p
}
fun BooleanPointer.toTypedPointer() : Pointer<Boolean> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun ByteArray.asPointer() = BytePointer(this)
fun Pointer<Byte>.toBytePointer() : BytePointer {
    var p = BytePointer(this.asArray().toByteArray())
    p += this.pos
    return p
}
fun BytePointer.toTypedPointer() : Pointer<Byte> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun CharArray.asPointer() = CharPointer(this)
fun Pointer<Char>.toCharPointer() : CharPointer {
    var p = CharPointer(this.asArray().toCharArray())
    p += this.pos
    return p
}
fun CharPointer.toTypedPointer() : Pointer<Char> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun DoubleArray.asPointer() = DoublePointer(this)
fun Pointer<Double>.toDoublePointer() : DoublePointer {
    var p = DoublePointer(this.asArray().toDoubleArray())
    p += this.pos
    return p
}
fun DoublePointer.toTypedPointer() : Pointer<Double> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun FloatArray.asPointer() = FloatPointer(this)
fun Pointer<Float>.toFloatPointer() : FloatPointer {
    var p = FloatPointer(this.asArray().toFloatArray())
    p += this.pos
    return p
}
fun FloatPointer.toTypedPointer() : Pointer<Float> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun IntArray.asPointer() = IntPointer(this)
fun Pointer<Int>.toIntPointer() : IntPointer {
    var p = IntPointer(this.asArray().toIntArray())
    p += this.pos
    return p
}
fun IntPointer.toTypedPointer() : Pointer<Int> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun LongArray.asPointer() = LongPointer(this)
fun Pointer<Long>.toLongPointer() : LongPointer {
    var p = LongPointer(this.asArray().toLongArray())
    p += this.pos
    return p
}
fun LongPointer.toTypedPointer() : Pointer<Long> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
fun <T> Array<T>.asPointer() = Pointer(this)
/**
 * @return Pointer using the array
 */
fun ShortArray.asPointer() = ShortPointer(this)
fun Pointer<Short>.toShortPointer() : ShortPointer {
    var p = ShortPointer(this.asArray().toShortArray())
    p += this.pos
    return p
}
fun ShortPointer.toTypedPointer() : Pointer<Short> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UByteArray.asPointer() = UBytePointer(this)
@ExperimentalUnsignedTypes
fun Pointer<UByte>.toUBytePointer() : UBytePointer {
    var p = UBytePointer(this.asArray().toUByteArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UBytePointer.toTypedPointer() : Pointer<UByte> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun BytePointer.toUBytePointer() : UBytePointer {
    var p = UBytePointer(this.asArray().toUByteArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UBytePointer.toBytePointer() : BytePointer {
    var p = BytePointer(this.asArray().toByteArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UIntArray.asPointer() = UIntPointer(this)
@ExperimentalUnsignedTypes
fun Pointer<UInt>.toUIntPointer() : UIntPointer {
    var p = UIntPointer(this.asArray().toUIntArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UIntPointer.toTypedPointer() : Pointer<UInt> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun IntPointer.toUIntPointer() : UIntPointer {
    var p = UIntPointer(this.asArray().toUIntArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UIntPointer.toIntPointer() : IntPointer {
    var p = IntPointer(this.asArray().toIntArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun ULongArray.asPointer() = ULongPointer(this)
@ExperimentalUnsignedTypes
fun Pointer<ULong>.toULongPointer() : ULongPointer {
    var p = ULongPointer(this.asArray().toULongArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun ULongPointer.toTypedPointer() : Pointer<ULong> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun LongPointer.toULongPointer() : ULongPointer {
    var p = ULongPointer(this.asArray().toULongArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun ULongPointer.toLongPointer() : LongPointer {
    var p = LongPointer(this.asArray().toLongArray())
    p += this.pos
    return p
}
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UShortArray.asPointer() = UShortPointer(this)
@ExperimentalUnsignedTypes
fun Pointer<UShort>.toUShortPointer() : UShortPointer {
    var p = UShortPointer(this.asArray().toUShortArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UShortPointer.toTypedPointer() : Pointer<UShort> {
    var p = Pointer(this.asArray().toTypedArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun ShortPointer.toUShortPointer() : UShortPointer {
    var p = UShortPointer(this.asArray().toUShortArray())
    p += this.pos
    return p
}
@ExperimentalUnsignedTypes
fun UShortPointer.toShortPointer() : ShortPointer {
    var p = ShortPointer(this.asArray().toShortArray())
    p += this.pos
    return p
}