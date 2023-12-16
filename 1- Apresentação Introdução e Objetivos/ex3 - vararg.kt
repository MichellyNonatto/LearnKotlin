fun main() {
    fun printAll(
            vararg messages: String
    ) { // 1. vararg é uma especime de array, na qual podemos declarar a quantidade de parâmetros
        // que quiser
        for (m in messages) println(m)
    }
    printAll("Hello", "Halo", "Salut", "Hola", "Olá")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Halo", "Salut", "Hola", "Olá", prefix = "Greeting:")

    fun log(vararg entries: String) {
        printAll(
                *entries
        ) // 2. Com o * o Kotlin entende que o array ou só um elemento passado na função é um
        // vararg, e não um objeto array
        // printAll(entries) <-- desse modo, ele compreenderá que se trata de um array, e não de um
        // vararg, conforme requerido pela função específica, onde é necessário fornecer o valor de
        // entrada
    }
    log("Learn", "Kotlin")
}
