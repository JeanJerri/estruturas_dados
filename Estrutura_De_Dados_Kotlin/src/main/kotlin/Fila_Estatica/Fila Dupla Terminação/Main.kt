package Fila_Estatica.`Fila Dupla Terminação`

fun main() {
	var fila: EnfileiravelDupla = FilaEstaticaDuplaTerminacao()

	fila.enfileirarFim("A")
	fila.enfileirarFim("B")
	println(fila.frente())
	println(fila.tras())
	println(fila.imprimirFrentePraTras())
	println(fila.imprimirTrasPraFrente())

	fila.desenfileirarFim()
    fila.enfileirarFim("c")
	fila.atualizarFim("C")
	println(fila.imprimirFrentePraTras())

	fila.desenfileirarInicio()
	fila.enfileirarInicio("D") 
	println(fila.imprimirFrentePraTras())
	fila.frente() // Não tem saída no console
	fila.tras() // Não tem saída no console

	fila.desenfileirarFim()
	fila.enfileirarInicio("e")
	println(fila.imprimirFrentePraTras())
	fila.atualizarInicio("E")
	println(fila.imprimirFrentePraTras()) //[E,D]

	fila.enfileirarFim("F")
	fila.desenfileirarInicio()
	fila.enfileirarFim("G")
	println(fila.tras()) //G

	fila.enfileirarInicio("H")
	fila.desenfileirarFim()
	fila.enfileirarFim("I")
	println(fila.imprimirFrentePraTras()) //[H,D,F,I]

	fila.enfileirarInicio("J")
	fila.enfileirarFim("K")
	fila.enfileirarFim("L")
	println(fila.frente()) //J

	fila.desenfileirarInicio()
	println(fila.imprimirFrentePraTras()) //[H,D,F,I,K,L]


	fila.enfileirarFim("A")
	fila.enfileirarFim("B")
	fila.enfileirarFim("C")
	fila.enfileirarFim("D")
	fila.enfileirarFim("E")
	fila.enfileirarInicio("E")
	println(fila.imprimirFrentePraTras())
}
