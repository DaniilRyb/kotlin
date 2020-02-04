// !JVM_DEFAULT_MODE: all-compatibility
// JVM_TARGET: 1.8
// WITH_RUNTIME
// FILE: 1.kt
interface Test {
    val prop: String
        get() =  "OK"
}

// FILE: 2.kt
class TestClass : Test {
    override val prop: String
        get() = super.prop
}

fun box(): String {
    return TestClass().prop
}
