class filaComPilhas (val tamanho: Int = 10) : Enfileiravel{
    private var pilha1: Empilhavel = PilhaEstatica(tamanho)
    private var pilha2: Empilhavel = PilhaEstatica(tamanho)

    override fun Enfileir(dado: Any){
        while(!pilha1.estaVazia()){
           pilha2.desempilhar(pilha1.empilhar())
        }

        val aux
    }

    override fun desenfileirar(): Any?{
        while(!pilha1.estaVazia()){
           pilha2.empilhar( pilha1.desempilhar())
        }
        val aux = pilha2.desempilhar()
        while(!pilha2.estaVazia()){
            pilha1.empilhar(pilha2.desempilhar())
        }
        return aux
    }

    override fun frente(): Any?{

    }

    override fun estaCheia(): Boolean{

    }

    override fun estaVazia(): Boolean{

    }

    override fun imprimir()
}