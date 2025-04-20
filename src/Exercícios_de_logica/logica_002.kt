package Exercícios_de_logica

fun main(){
    // Desenvolva uma função que aceite três números e calcule a média aritmética entre eles.
    println("Entre com o 3 notas e descubra a média aritmética delas")
    println("-------------------------------------------------------")
    println("Digite a primeira nota: ")
    val nota1 = readln().toFloat()

    println("Digite a segunda nota: ")
    val nota2 = readln().toFloat()

    println("Digite a terceira nota: ")
    val nota3 = readln().toFloat()

    fun media_aritmetica(a:Float, b:Float, c:Float){
        val media = (a+b+c)/3
        return println("A média das notas $a, $b, $c é $media")
    }
media_aritmetica(nota1, nota2, nota3)
}