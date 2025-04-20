package Exercício_aleatorio

fun main(){
    val num: Int = 10
    val num2: Int = 2
    val result = num % num2
    println(result)
    if(result == 0){
        println("O resto da divisão de num por num2 é: $result")
    }else{
        println("O resto da divisão de num por num2 é: $result")
    }

    val testeLogico = num != num2
    println(testeLogico)

    val testeLogico2 = num >= num2
    println(testeLogico2)

    var testeLogico3 = 70
    testeLogico3 -= num2
    println(testeLogico3)

    testeLogico3 *= num
    println(testeLogico3)


    fun verificarParImpar(num3: Int): String {
        return when {
            num3 % 2 == 0 -> "É par"
            else -> "É ímpar!"
        }
    }
    println(verificarParImpar(10))
// Modificando strings

var a = 1
val s1 = "a is $a"
val frase = "Todo programador precisar estudar muito"
a = 2
val s2 = "${s1.replace("is","was")}, but now is $a"
println(s2.uppercase())
    println(s2.lowercase())
println(frase.split(" "))
}

