// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// IGNORE_BACKEND: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u until 8u
    for (i in uintProgression step 7) {
        uintList += i
    }
    assertEquals(listOf(1u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL until 8uL
    for (i in ulongProgression step 7L) {
        ulongList += i
    }
    assertEquals(listOf(1uL), ulongList)

    return "OK"
}