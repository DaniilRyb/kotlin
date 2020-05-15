// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM_IR
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in 9u downTo 3u step 2) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>(9u, 7u, 5u, 3u)) {
        return "Wrong elements for 9u downTo 3u step 2: $list1"
    }

    val list2 = ArrayList<UInt>()
    for (i in 9u.toUByte() downTo 3u.toUByte() step 2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<UInt>(9u, 7u, 5u, 3u)) {
        return "Wrong elements for 9u.toUByte() downTo 3u.toUByte() step 2: $list2"
    }

    val list3 = ArrayList<UInt>()
    for (i in 9u.toUShort() downTo 3u.toUShort() step 2) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>(9u, 7u, 5u, 3u)) {
        return "Wrong elements for 9u.toUShort() downTo 3u.toUShort() step 2: $list3"
    }

    val list4 = ArrayList<ULong>()
    for (i in 9uL downTo 3uL step 2L) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>(9u, 7u, 5u, 3u)) {
        return "Wrong elements for 9uL downTo 3uL step 2L: $list4"
    }

    return "OK"
}
