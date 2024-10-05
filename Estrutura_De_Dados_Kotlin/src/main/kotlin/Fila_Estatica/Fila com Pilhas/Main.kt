package Fila_Estatica.`Fila com Pilhas`

fun main() {
    var fila: Enfileiravel = FilaEstaticaComPilhas()

    println("Frente: ${fila.frente()}")
    fila.enfileirar("A");
    println("Frente: ${fila.frente()}")

    fila.enfileirar("B")
    fila.enfileirar("C")
    fila.enfileirar("D")
    fila.desenfileirar()
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("E")
    val conteudo = fila.desenfileirar()
    fila.enfileirar("F")
    println("Frente: ${fila.frente()}")
    println("Fila=${fila.imprimir()}")

    fila.enfileirar("G");
    fila.enfileirar(conteudo)
    fila.enfileirar("I")
    fila.enfileirar("J")
    fila.enfileirar("K")
    fila.enfileirar("L")
    println("Fila=${fila.imprimir()}")
    fila.enfileirar("M")
    println("Fila=${fila.imprimir()}")
}