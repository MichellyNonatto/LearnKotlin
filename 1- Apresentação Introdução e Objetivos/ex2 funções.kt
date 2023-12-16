fun printMessage(
        message: String
): Unit { // 1. Unit é uma declação para mostrar que a função respectivamente é voi (não retorna
    // nada)
    println(message)
}

fun printMessageWithPrefix(
        message: String,
        prefix: String = "Info"
) { // 2. Caso não especifique o valor de prefix o texto 'Info' é declarado como valor padrão
    println(
            "[$prefix] $message"
    ) // 3. Não é ecessário concatenar o código, essa técnica é interpolação do código, deixando-a
    // mais elegante e entendivel
}

fun sum(x: Int, y: Int): Int { // 4. Retorna um inteiro
    return x + y
}

fun multply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multply(2, 4))
}
