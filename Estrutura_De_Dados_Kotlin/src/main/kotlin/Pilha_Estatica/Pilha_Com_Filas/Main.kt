package Pilha_Estatica.Pilha_Com_Filas

fun main(){
	println("Pilha Estatica com Filas")
	var pilha: Empilhavel = PilhaEstaticaComFilas(7)

	pilha.empilhar("A")
	pilha.empilhar("B")
	println("Espiar:" + pilha.espiar())

	pilha.empilhar("C")
	pilha.empilhar("D")
	pilha.empilhar("E")
	pilha.empilhar("F")
	println("Espiar:" + pilha.espiar())
	println("Pilha="+pilha.imprimir())

	val conteudo = pilha.desempilhar()
	pilha.desempilhar()
	pilha.empilhar("G")
	pilha.empilhar("H")
	pilha.empilhar("I")
	println("Pilha="+pilha.imprimir())

	pilha.empilhar(pilha.desempilhar())
	pilha.empilhar("J")
	pilha.atualizar(conteudo)
	println("Pilha="+pilha.imprimir())
}