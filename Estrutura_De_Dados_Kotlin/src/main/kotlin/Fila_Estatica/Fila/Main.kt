package Fila_Estatica.Fila

fun main() {
    var fila: Enfileiravel = FilaEstatica()

    fila.enfileirar("A")
    println("Frente: ${fila.frente()}")
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("B")
    fila.enfileirar("C")
    fila.enfileirar("D")
    fila.desenfileirar() //Remove o item que chegou primeiro, nesse caso foi o A.
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("E")
    val conteudo = fila.desenfileirar()
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("F")
    println("Frente: ${fila.frente()}")
    fila.enfileirar("G")

    fila.enfileirar(conteudo)

    fila.enfileirar("I")
    fila.enfileirar("J")
    fila.enfileirar("K") // Nesse momento a fila está cheia pois contando todos os itens que foram enfileirados é igual a 10, o tamanho máximo definido para esta fila

    println("Fila=${fila.imprimir()}")
}