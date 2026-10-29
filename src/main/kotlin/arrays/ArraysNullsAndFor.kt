package neoemo.mods.arrays

fun ArraysNullsAndFor() {
    /*
    * Задание:
    * Предоставляются три необязательные метки. Для каждой метки выведите её версию в верхнем регистре, а затем её
    * длину, в отдельных строках. Используйте безопасные вызовы для обеих операций, чтобы при отсутствии метки дважды
    * выводилось null. Пустые строки должны оставаться пустыми строками.
    * Выведите ровно требуемый результат, добавляя один перевод строки после каждой строки вывода.
    * Не выводите приглашения для ввода.
    * Начальный код содержит код чтения входных данных. Сохраните его и дополните часть ниже.
    * */

    // Дано
    val first: String? = "map"
    val second: String? = null
    val third: String? = ""

    // НАЧАЛО
    val entities = arrayOf(first, second, third) // создание массива "сущностей" (констант)

    for (entity in entities) {
        val upperVal: String? = entity?.uppercase()
        val lengthVal: Int? = entity?.length
        println(upperVal)
        println(lengthVal)
    }
    // КОНЕЦ
}

fun main() {
    ArraysNullsAndFor()
}