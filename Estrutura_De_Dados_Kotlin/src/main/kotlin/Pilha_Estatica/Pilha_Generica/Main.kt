package Pilha_Estatica.Pilha_Generica

fun main(args: Array<String>) {
    println("Pilha Estatica Genérica")
    var pilha: Empilhavel<String> = PilhaEstaticaGenerica(7)

    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")

    println("Topo: ${pilha.topo()}")

    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    pilha.empilhar("e")

    println("Topo: ${pilha.topo()}")

    val conteudo = pilha.desempilhar()

    pilha.desempilhar()

    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("bahia")
    //pilha.atualizar("Bahia")

    pilha.empilhar(pilha.desempilhar()) //Removeu o dado e colocou no lugar novamente
    pilha.empilhar(conteudo)

    println("Pilha=${pilha.imprimir()}")
}