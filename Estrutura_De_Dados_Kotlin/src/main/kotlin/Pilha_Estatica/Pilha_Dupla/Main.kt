package Pilha_Estatica.Pilha_Dupla

fun main(args: Array<String>) {
    println("Pilha Estatica Dupla")
    var pilha: EmpilhavelDupla = PilhaEstaticaDupla(7)

    pilha.empilhar1("Instituto")
    pilha.empilhar1("Federal")
    println("Espiar:${pilha.espiar1()}")

    pilha.empilhar2("Universidade")
    pilha.empilhar2("Estadual")
    println("Espiar:${pilha.espiar2()}")

    pilha.empilhar1("de")
    pilha.empilhar1("Educação")
    pilha.empilhar1("Ciência")
    pilha.empilhar1("e")

    pilha.empilhar2("do")
    pilha.empilhar2("rio")
    pilha.atualizar2("Rio")
    pilha.empilhar2("Grande")

    println("Espiar:${pilha.espiar1()}")

    val conteudo1 = pilha.desempilhar1()
    pilha.desempilhar1()

    pilha.empilhar2("do")

    pilha.empilhar1("Tecnologia")
    pilha.empilhar1("da")

    println("Espiar:${pilha.espiar2()}")

    val conteudo2 = pilha.desempilhar2()

    pilha.empilhar1("bahia")
    pilha.atualizar1("Bahia")
    pilha.empilhar1(pilha.desempilhar1())

    pilha.desempilhar2();

    pilha.empilhar2("Sul")

    pilha.empilhar1(conteudo1)

    pilha.empilhar2(pilha.desempilhar2())
    pilha.empilhar2(conteudo2)

    println("Pilha1=${pilha.imprimir1()}")
    println("Pilha2=${pilha.imprimir2()}")
}