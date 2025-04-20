package Aula_3_detalhes_tipo_dados

fun main() {
    val age: Int = 37

    //adiciona meses no formato decimal ao inteiro a idade (converter idade em um tipo de ponto flutuante)

    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12

    println("ageDouble = $ageDouble  monthPercent = $monthPercent")

    //2 meses depois

    ageDouble = ageDouble + 2 * monthPercent
    println("ageDouble atualizado = $ageDouble")

    //transformando ageDouble em string
    val ageText: String = "A idade é " + ageDouble.toString().plus(" anos.")
    println(ageText)
}

