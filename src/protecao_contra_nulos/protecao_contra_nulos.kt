package protecao_contra_nulos

fun main(){
    // "?" a interrogaçao na frente do tipo, habilita que essa variável possa receber um valor nulo
    var a: String? = null
    //a = "Kotlin"

    val result: String = a ?: "Kotlin" // Utilizamos o elvis operator para fazer a validação se caso a variável seja nula, ele atribui um valor setado para a variável
    println(result)

    // "?." operador de chamada segura, é utilizado quando existe a possibilidade da variavel atribuida ser nula.
    var b: Int = -1
    b = a?.toInt() ?: 0
    println(b)

    // Quando temos certeza que o dado atribuído à uma variável não é nula, colocamos ao lado dela o sinal "!!". Uma forma segura de implementar essa validação
    // é coloca-la dendo de uma condição if onde o dado recebido pela variável seja diferente de nulo.

    if (a != null) {
        println(a!!.toInt())
    }

    // (as?)safe cast, retorna um nulo quando ocorre um erro na tentativa de fazer um cast(conversão) entre tipos diferentes

    val c = a as? Int // tenta converter a variável a(string) em um tipo int.


 } // fim da função principal