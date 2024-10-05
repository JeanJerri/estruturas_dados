package Pilha_Estatica.Pilha_Com_Filas

class FilaEstaticaCircular(val tamanho: Int = 10) : Enfileiravel {
 
	private var ponteiroInicio = 0
	private var ponteiroFim = -1 
	private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade: Int = 0

	override fun atualizar(dado: Any?) {
		if (!estaVazia()) {
			dados[ponteiroInicio] = dado
		} else {
			println("Queue is empty!")
		}
	}


	override fun enfileirar(dado: Any?) {
		if (!estaCheia()) {
			//patch pra fila funcionar de forma circular
			ponteiroFim = (ponteiroFim + 1) % dados.size
			quantidade++
			//fim do patch
			dados[ponteiroFim] = dado
		} else {
			println("Queue is full!")
		}
	}
	
	override fun desenfileirar(): Any? {
		var dadoInicio: Any? = null
		if (!estaVazia()) {
			dadoInicio = dados[ponteiroInicio]
			//patch pra fila funcionar de forma circular
			ponteiroInicio = (ponteiroInicio + 1) % dados.size
			quantidade--
			//fim do patch	
		} else {
			println("Queue is empty!")
		}
		return dadoInicio
	}
	
	override fun frente(): Any? {
		return if (!estaVazia()) {
			dados[ponteiroInicio]
		} else {
			println("Queue is empty!")
			null
		}
	}
	
	override fun estaCheia(): Boolean {
		return quantidade == dados.size
	}
	
	override fun estaVazia(): Boolean {
		return quantidade == 0
	}
	
	override fun imprimir(): String {
		if (estaVazia()) {
			return "[]"
		}

		var resultado = "["
		var ponteiroAux = ponteiroInicio
		for (i in 0 until quantidade) {
			resultado += if (i == quantidade - 1) {
				"${dados[ponteiroAux]}"
			} else {
				"${dados[ponteiroAux]}, "
			}
			ponteiroAux = (ponteiroAux + 1) % dados.size
		}
		return "$resultado]"
	}
}