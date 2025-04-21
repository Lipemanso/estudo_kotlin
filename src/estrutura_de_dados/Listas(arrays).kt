package estrutura_de_dados
fun main(){

    // As lista podem ser tipadas(mais indicado pelo contexto da linguagem) ou não, pois o kotlin reconhece o tipo automaticamente.

    val listaDeInteiros: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val listaDeDouble: MutableList<Double> = mutableListOf(1.4,2.3,3.1,4.7,5.9)
    val listaDeString: MutableList<String> = mutableListOf("cama","sofá","mesa","televisão")
    val listaDeBoleanos: MutableList<Boolean> = mutableListOf(false,true,true,false)


   println(listaDeInteiros)
   println(listaDeDouble)
   println(listaDeString)
   println(listaDeBoleanos)

}