package neoemo.mods

fun main() {
    breakVal()
    kotlinIsJavaScript()
}

fun breakVal() {
    val i = 5
    var iIntruder = i
    iIntruder += 1
    println(iIntruder)
}

fun kotlinIsJavaScript() {
    val str = "2"
    val number = 2
    println(str + number)
}