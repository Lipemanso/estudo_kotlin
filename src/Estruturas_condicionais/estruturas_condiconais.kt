package Estruturas_condicionais

fun main(){
    //if / else if/ else

    val x = 100
    val y = 120

    if(x > y){
        println("Resultado da variável X: $x" )
    }else{
        println("Resultado da variável Y:  $y")
    }

//  val result =  if(x > y){
//        "x > y"
//    }else if(x < y){
//        "x < y"
//    }else if(x == y){
//        "x == y"
//    }else{
//        "else"
//    }
//    println(result)

    // When

    val result2 = when (x){
        in 1..99 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }
println(result2)

val numero = 0
    if(numero > 0){
        println("O número é positivo!")
    }else if(numero < 0){
        println("O número é negativo")
    }else{
        println("O numero é zero")
    }
}