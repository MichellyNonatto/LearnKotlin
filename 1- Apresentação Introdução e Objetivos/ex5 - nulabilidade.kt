/*
 Segurança nula / null safety nulidade
 Deixar de forma explicita se a variável poderá receber um valor vazio sim ou não
*/

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null // 1- Apenas por atribuir um valor padrão o Kotlin entende que essa variável
    // não pode ser nula

    var nullable: String? = "You can keep a null here"
    nullable = null // 2- Com o sinal de interrogação informa que a variável pode receber uma
    // atribuição nula

    var inferrenNonNull = "The compiler assumes non-null"
    // inferrenNonNull = null // 3- Por inferencia o Kotlin entende que a variável não pode ser nula

    fun strLength(noNull: String): Int {
        return noNull.length
    }

    println(strLength(neverNull))
    // println(strLength(nullable)) // 4- Retorna um erro pois a função não aceita variáveis nulas

    fun strLengthIfNull(str: String?): Int {
        return str?.length ?: 0 // 5- Força a entrada caso se a variável for nula
    }

    println(strLengthIfNull(nullable))

    println(describeString(nullable))
    println(describeString(inferrenNonNull))
}
