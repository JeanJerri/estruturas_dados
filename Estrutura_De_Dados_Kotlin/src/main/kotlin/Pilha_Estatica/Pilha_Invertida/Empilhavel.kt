interface Empilhavel {

    // Metodos principais
    fun empilhar(dado: Any?)    //C
    fun espiar(): Any?          //R
    fun atualizar(dado: Any?)   //U
    fun desempilhar(): Any?     //D

    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}