// !WITH_NEW_INFERENCE
// NI_EXPECTED_FILE

class Cons<T : Number>(val head: T, val tail: Cons<T>?)
typealias C<T> = Cons<T>

val test1 = C(1, C(2, null))
val test2 = C(1, <!TYPE_MISMATCH{NI}, TYPE_MISMATCH{NI}, TYPE_MISMATCH{NI}!><!TYPE_INFERENCE_CONFLICTING_SUBSTITUTIONS{OI}!>C<!>(<!TYPE_MISMATCH{NI}, TYPE_MISMATCH{NI}!>""<!>, null)<!>)
