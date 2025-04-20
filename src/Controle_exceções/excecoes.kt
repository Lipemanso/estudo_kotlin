package Controle_exceções

import java.security.InvalidParameterException

fun main(){

    var x = 1
    //try/catch
    try{
        // código desejado a ser executado
        x = 1 / 0
        throw InvalidParameterException() // Podemos colocar uma exceção no bloco de try
    } catch(error: Exception) {
        // caso um exceção ao bloco try aconteça

        println(error.message)
    }catch(error: Exception){
        println("Erro Genérico")
    }
    // finally {
//        // ao final do try e do catch *opcional* e quando ele está presente no código, sempre será executado.
//    }


}