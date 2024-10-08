package Pilha_Estatica.Pilha_Com_Filas

interface Empilhavel {
    // Metodos principais
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun atualizar(dado: Any?)   
    fun espiar(): Any?
    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}