package Pilha_Estatica.Pilha

fun main(args: Array<String>) {
    println("Pilha Estatica")
    var pilha: Empilhavel = PilhaEstatica(7)

    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")

    println("Topo: ${pilha.espiar()}")

    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    pilha.empilhar("e")

    println("Topo: ${pilha.espiar()}")

    val conteudo = pilha.desempilhar()

    pilha.desempilhar()

    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("bahia")
    pilha.atualizar("Bahia")

    pilha.empilhar(pilha.desempilhar()) //Removeu o dado e colocou no lugar novamente
    pilha.empilhar(conteudo)

    println("Pilha=${pilha.imprimir()}")
}

// Stack = Pilha
// val = Imutável
// var = Mutável
// Variáveis devem usar camelCase
// Em Kotlin da para escrever numeros grandes como esse: 1000000, dessa forma: 1_000_000
// Para declarar variaveis usamos var/val e para funções usamos fun
// Logo depois definimos o nome e declaramos o tipo após dois pontos(:) que fica ao lado do nome
