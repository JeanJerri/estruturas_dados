package Pilha_Estatica.Pilha

//https://www.javainuse.com/java2kot
//https://play.kotlinlang.org/

interface Empilhavel {

    // Metódos principais
    fun empilhar(dado: Any?)    //C
    fun espiar(): Any?          //R
    fun atualizar(dado: Any?)   //U
    fun desempilhar(): Any?     //D

    // Metódos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}