package Lista_Estatica.`Lista Circular`

fun main() {
    var lista: Listavel = ListaEstaticaCircular()

    lista.anexar("A")  
    lista.anexar("C")
    println(lista.imprimir())

    lista.inserir(1,"B")
    println(lista.imprimir())

    lista.anexar("D")   
    lista.apagar(1)
    println(lista.imprimir())

    lista.inserir(1,"B")
    println(lista.imprimir())

    lista.inserir(0,"E")   
    lista.inserir(2,"F");
    println(lista.imprimir())

    println("${lista.selecionar(1)}")

    lista.atualizar(1,"G")
    println("${lista.selecionarTodos()}")
    lista.anexar(lista.selecionarTodos())
    println(lista.imprimir())
}