class FilaDinamica(private val tamanho: Int = 10): Enfileiravel{
    var ponteiroInicio: NoDuplo? = null
    var ponteiroFim: NoDuplo? = null
    var quantidade: Int = 0

    //metodos auxiliares
    override fun estaCheia(): Boolean{
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean{
        return quantidade == 0
    }

    override fun imprimir(): String{
        var resultado = "["
        var dadoAux = ponteiroInicio
        for (i in 0 until quantidade){
            resultado += "${dadoAux?.dado}"
            if (i != quantidade - 1)
                resultado += ", "
            dadoAux = dadoAux?.proximo
        }
        return "$resultado]"
    }

    override fun frente(): Any?{
        var dadoAux: Any? = null
        if(!estaVazia())
            dadoAux = ponteiroInicio?.dado
        else
            println("A fila está vazia")
        return dadoAux
    }

    override fun atualizar(dado: Any?){
        if (!estaVazia())
            ponteiroInicio?.dado = dado
        else
            println("A fila esta vazia")
    }

    override fun inserir(dado: Any?){
        val noTemp = NoDuplo(dado)
        if (!estaCheia()){
            noTemp.anterior = ponteiroFim
            if(!estaVazia())
                ponteiroFim?.proximo = noTemp
            else
                ponteiroInicio =  noTemp
            ponteiroFim =  noTemp
            quantidade = quantidade.inc()
        } else
            println("A fila esta vazia")
    }

    override fun remover(): Any?{
        var dadoAux: Any? = null
        if(!estaVazia()) {
            dadoAux = ponteiroInicio?.dado
            ponteiroInicio = ponteiroInicio?.proximo
            quantidade = quantidade.dec()
            if (!estaVazia())
                ponteiroInicio?.anterior = null
            else
                ponteiroFim = null
        } else
            println("A fila esta vazia")
        return dadoAux
    }
}