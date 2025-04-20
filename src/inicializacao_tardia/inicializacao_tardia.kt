package inicializacao_tardia

import kotlin.properties.Delegates

fun main(){
    //lateinit

    lateinit var a: String

     a = "kotlin lateinit"
    println(a)
    // by lazy
    val b: String by lazy{
        "kotlin lazy"
    }
    println(b)

    // atrasar inicializacao de variáveis do tipo primitivo

    var c: Int by Delegates.notNull()
    var d: Boolean by Delegates.notNull()
    var e: Double by Delegates.notNull()

    c = 10
    d = true
    e = 2.5
    println(c)
    println(d)
    println(e)
}