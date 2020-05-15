// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM_IR
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MaxUI = UInt.MAX_VALUE
const val MaxUL = ULong.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    val range1 = MaxUI..MaxUI
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>(MaxUI)) {
        return "Wrong elements for MaxUI..MaxUI: $list1"
    }

    val list2 = ArrayList<ULong>()
    val range2 = MaxUL..MaxUL
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<ULong>(MaxUL)) {
        return "Wrong elements for MaxUL..MaxUL: $list2"
    }

    return "OK"
}
