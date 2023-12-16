fun someCondtion() = false

fun main() {
    var a: String = "initial" // 1- declaração de variável mutável;
    println(a)
    a = "final"
    println(a)

    val b: Int = 1 // 2- declaração de variável que não será modificada ao decorrer do código;
    val c = 3 // 3- declaração por inferência, a de cima é declaração por tipagem
    println("$b\n$c")

    // b = 8 <-- se caso tenta modificar um val o terminal retorna um erro 'Val cannot be
    // reassigned'

    /*
    var e : Int
       println(e) <-- para fazer o uso de uma variável é obrigatório que seja declaro um valor pré-definido para ela
      */

    val d: Int

    if (someCondtion()) {
        d = 1
    } else {
        d = 2
    }

    println("value d: $d")
}
