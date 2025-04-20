package Aula_0_meu_primeiro_projeto

fun main(){
    var teste = 4
    val num1 = 15
    val num2 = 25
    var dia = 5

    val diaSemana = when(dia){
        1 -> println("Domingo")
        2 -> println("Segunda-Feira")
        3 -> println("Terça-Feira")
        4 -> println("Quarta-Feira")
        5 -> println("Quinta-Feira")
        6 -> println("Sexta-Feira")
        7-> println("Sábado")
        else -> println("Dia inválido")
    }

    println(diaSemana)

    if(teste == null){
        val validation = teste?: "Variável nula"
        println(validation)
    } else{
        println("Não é nula")
    }
}