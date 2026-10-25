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

fun types() {
//    String str = "a" Java
    val str: String = "String" // kotlin
    println(str)
    val number: Int = 1234 // Почему с большой? примитив же
    val isEven = number % 2 == 0
    println(isEven)

    // Типы и их присваивание, может быть есть ещё какие-то уникальные для kotlin, я взял все те, что точно есть в Java
    val city: String = "San Francisco"
    val someNum: Int = 12345
    val doubleNum: Double = 12.34
    val longNum: Long = 12345L
    val shortNum: Short = 12345
    val byteNum: Byte = 1
    val ch: Char = 'c'
    val floatNum: Float = 12345f
    val someBoolean: Boolean = true
    // удобный вывод в print\println, вместо println("city: " + city + "\n") и так далее
    println("city: $city\n someNum: $someNum\n doubleNum: $doubleNum\n longNum: $longNum\n " +
            "shortNum: $shortNum\n byteNum: $byteNum\n ch: $ch\n floatNum: $floatNum\n someBoolean: $someBoolean")
}