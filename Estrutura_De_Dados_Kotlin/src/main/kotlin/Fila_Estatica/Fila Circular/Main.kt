package Fila_Estatica.`Fila Circular`

fun main() {
    var fila: Enfileiravel = FilaEstaticaCircular()

    fila.enfileirar("A")
    println("Frente: ${fila.frente()}")
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("B")
    fila.enfileirar("C")
    fila.enfileirar("D")
    fila.desenfileirar()
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("E")
    var conteudo = fila.desenfileirar()
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("F")
    println("Frente: ${fila.frente()}")
    fila.enfileirar("G")
    fila.enfileirar(conteudo)
    fila.enfileirar("I")
    fila.enfileirar("J")
    fila.enfileirar("K")
    fila.enfileirar("L")
    fila.enfileirar("M") // Nesse momento a fila está cheia pois contando todos os itens que foram enfileirados e subtraindo os desinfileirados é igual a 10, o tamanho máximo definido para esta fila
    println("Fila=${fila.imprimir()}")

    conteudo = fila.desenfileirar()
    fila.enfileirar(conteudo)
    println("Fila=${fila.imprimir()}")
}