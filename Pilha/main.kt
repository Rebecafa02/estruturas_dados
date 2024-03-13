fun main (){
    var pilha = pilhaInvertida(10)
    pilha.empilhar ("Instituto")
    pilha.empilhar("Federal")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("De")
    pilha.empilhar("Educação")
    pilha.empilhar ("Ciência")
    val dadoQualquer = pilha.desempilhar()
    pilha.empilhar("e")
    pilha.empilhar("Tecnologia")
    pilha.empilhar(dadoQualquer)
    println("Dados: ${pilha.imprimir()}")
}