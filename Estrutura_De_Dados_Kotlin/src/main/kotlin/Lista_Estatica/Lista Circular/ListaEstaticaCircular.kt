package Lista_Estatica.`Lista Circular`

class ListaEstaticaCircular(val tamanho: Int = 5) : Listavel {
 
	private var dados: Array<Any?> = arrayOfNulls(tamanho)
	private var quantidade = 0
	private var ponteiroInicio = 0
	private var ponteiroFim = -1

	// Idêntico ao enfileirar de FilaEstaticaCircular
	override fun anexar(dado: Any?) {
		if (!estaCheia()) {
			//patch pra fila funcionar de forma circular
			ponteiroFim = (ponteiroFim + 1) % dados.size
			quantidade++
			//fim do patch
			dados[ponteiroFim] = dado
		} else {
			println("Lista cheia!")
		}
	}

	override fun inserir(posicao: Int, dado: Any?) {
		if (!estaCheia()) {
			if (posicao >= 0 && posicao <= quantidade) { // Indice/posição é válida?
				//Mapeamento de endereçamento lógico (informado pelo usuário) PARA endereçamento físico (onde o dado está no array)
				val posicaoFisica = (ponteiroInicio + posicao) % dados.size
				var ponteiroAux = (ponteiroFim + 1) % dados.size

				for (i in quantidade downTo posicao + 1) {
					val anterior = (ponteiroAux - 1 + dados.size) % dados.size
					dados[ponteiroAux] = dados[anterior]
					ponteiroAux = anterior
				}

				dados[posicaoFisica] = dado
				ponteiroFim = (ponteiroFim + 1) % dados.size
				quantidade++
			} else {
				println("Indice Inválido")
			}
		} else {
			println("Lista Cheia!")
		}
	}

	override fun selecionar (posicao: Int): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade) { // Indice/posição lógica é válida?
				//Mapeamento de endereçamento lógico (informado pelo usuário) PARA endereçamento físico (onde o dado está no array)
				var posicaoFisica = (ponteiroInicio + posicao) % dados.size
				dadoAux = dados[posicaoFisica]
			} else {
				println("Indice Inválido!")	
			}
		} else {
			println("Lista Vazia!")		
		}
		return dadoAux
	}

	override fun selecionarTodos(): Array<Any?> {
		var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
		if (!estaVazia()) {
			for (i in 0 until quantidade)
				dadosAux[i] = dados[(ponteiroInicio+i)%dados.size]
		}
		return dadosAux
	}

	override fun atualizar (posicao: Int, dado: Any?) {
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade) {  // Indice/posição lógica é válida?
				//Mapeamento de endereçamento lógico (informado pelo usuário) PARA endereçamento físico (onde o dado está no array)
				var posicaoFisica = (ponteiroInicio + posicao) % dados.size
				dados[posicaoFisica] = dado
			} else {
				println("Indice Inválido!")	
			}
		} else {
			println("Lista Vazia!")		
		}
	}

	override fun apagar(posicao: Int): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade) { //índice/posição lógica é válida?
				//Mapeamento de endereçamento lógico (informado pelo usuário) PARA endereçamento físico (onde o dado está no array)
				val posicaoFisica = (ponteiroInicio + posicao) % dados.size
				dadoAux = dados[posicaoFisica]

				var ponteiroAux = posicaoFisica
				for (i in posicao until (quantidade-1)) {
					val proximo = (ponteiroAux+1)%dados.size
					dados[ponteiroAux] = dados[proximo]
					ponteiroAux = proximo
				}
				dados[ponteiroFim] = null
				ponteiroFim = (ponteiroFim - 1 + dados.size) % dados.size
				quantidade--
			} else {
				println("Indice Inválido!")
			}
		} else {
			println("Lista Vazia!")
		}
		return dadoAux
	}

	override fun estaCheia(): Boolean {
		return quantidade == dados.size
	}
	
	override fun estaVazia(): Boolean {
		return quantidade == 0
	}
	
	override fun imprimir(): String {
		var resultado = "["
		var ponteiroAux = ponteiroInicio
		for (i in 0 until quantidade) {
			resultado += if (i == ponteiroFim)
				"${dados[(ponteiroAux+i) % dados.size]}"
			else
				"${dados[(ponteiroAux+i) % dados.size]}, "			
		}
		return "$resultado]"
	}
}