package Lista_Estatica.`Lista Circular`

interface Listavel {
    // Metodos principais
    fun anexar(dado: Any?)                  //C  Adiciona um elemento no final da lista.
    fun inserir(posicao: Int, dado: Any?)   //C  Insere um elemento em uma posição específica.
    fun selecionar(posicao: Int): Any?      //R  Seleciona um elemento em uma posição específica.
    fun selecionarTodos(): Array<Any?>      //R  Retorna todos os elementos.
    fun atualizar(posicao: Int, dado: Any?) //U  Atualiza o valor de um elemento em uma posição específica.
    fun apagar(posicao: Int): Any?          //D  Remove o elemento de uma posição e retorna seu valor.

    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}