package Fila_Estatica.Fila

interface Enfileiravel {
    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String

    // Metodos principais
    fun enfileirar(dado: Any?)  //C
    fun frente(): Any?          //R
    fun atualizar(dado: Any?)   //U
    fun desenfileirar(): Any?   //D
}