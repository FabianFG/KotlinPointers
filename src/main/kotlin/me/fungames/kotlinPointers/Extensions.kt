package me.fungames.kotlinPointers

/**
 * @return Pointer using the array
 */
fun BooleanArray.asPointer() = BooleanPointer(this)
/**
 * @return Pointer using the array
 */
fun ByteArray.asPointer() = BytePointer(this)
/**
 * @return Pointer using the array
 */
fun CharArray.asPointer() = CharPointer(this)
/**
 * @return Pointer using the array
 */
fun DoubleArray.asPointer() = DoublePointer(this)
/**
 * @return Pointer using the array
 */
fun FloatArray.asPointer() = FloatPointer(this)
/**
 * @return Pointer using the array
 */
fun IntArray.asPointer() = IntPointer(this)
/**
 * @return Pointer using the array
 */
fun LongArray.asPointer() = LongPointer(this)
/**
 * @return Pointer using the array
 */
fun <T> Array<T>.asPointer() = Pointer(this)
/**
 * @return Pointer using the array
 */
fun ShortArray.asPointer() = ShortPointer(this)
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UByteArray.asPointer() = UBytePointer(this)
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UIntArray.asPointer() = UIntPointer(this)
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun ULongArray.asPointer() = ULongPointer(this)
/**
 * @return Pointer using the array
 */
@ExperimentalUnsignedTypes
fun UShortArray.asPointer() = UShortPointer(this)