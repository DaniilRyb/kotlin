// IGNORE_BACKEND: JVM_IR
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in (3u downTo 5u).reversed()) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>()) {
        return "Wrong elements for (3u downTo 5u).reversed(): $list1"
    }

    val list2 = ArrayList<UInt>()
    for (i in (3u.toUByte() downTo 5u.toUByte()).reversed()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<UInt>()) {
        return "Wrong elements for (3u.toUByte() downTo 5u.toUByte()).reversed(): $list2"
    }

    val list3 = ArrayList<UInt>()
    for (i in (3u.toUShort() downTo 5u.toUShort()).reversed()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>()) {
        return "Wrong elements for (3u.toUShort() downTo 5u.toUShort()).reversed(): $list3"
    }

    val list4 = ArrayList<ULong>()
    for (i in (3uL downTo 5uL).reversed()) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>()) {
        return "Wrong elements for (3uL downTo 5uL).reversed(): $list4"
    }

    return "OK"
}
