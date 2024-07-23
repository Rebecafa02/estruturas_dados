class ListaDinamica(private val tamanho: Int = 10): Listavel {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    override fun anexar(dado: Any?){
        if(!estaCheia()){
            var noTemp = NoDuplo(dado)
            noTemp?.anterior = ponteiroFim
            if(!estaVazia())
                ponteiroFim?.proximo = noTemp
            else
                ponteiroInicio = noTemp

            ponteiroFim = noTemp
            quantidade = quantidade.inc()
        } else
            println("A lista está cheia")
    }

    override fun selecionar(posicao: Int): Any?{
        var dadoAux: Any? = null
        if(!estaVazia()){
            if(posicao > 0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo
                dadoAux = ponteiroAux?.dado
            } else
                println("Indice invalido!")
        } else
            println("Lista vazia!")
        return dadoAux
    }

    override fun selecionarTodos(): Array<Any?>{
        var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
        if(!estaVazia()){
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade){
                dadosAux[i] = ponteiroAux?.dado
                ponteiroAux = ponteiroAux?.proximo
            }
        } else
            println("Lista Vazia!")
        return dadosAux
    }

    override fun inserir(posicao: Int, dado: Any?){
        if(!estaCheia()){
            if(posicao > 0 && posicao < quantidade){
                val noTemp = NoDuplo(dado)

                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for(i in 0 until posicao)
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo

                //inserção no inicio caso esteja vazia
                if(ponteiroAnterior != null)
                    ponteiroAnterior.proximo = noTemp
                else
                    ponteiroInicio = noTemp

                //exceto fim
                if(ponteiroProximo != null)
                    ponteiroProximo.anterior = noTemp
                else
                    ponteiroFim = noTemp

                noTemp.anterior = ponteiroAnterior
                noTemp.proximo = ponteiroProximo

                quantidade = quantidade.inc()
            } else
                println("Indice invalido!")
        } else
            println("Lista Cheia!")
    }

    override fun atualizar(posicao: Int, dado: Any?){
        if(!estaVazia()){
            if(posicao > 0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for(i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo
                ponteiroAux?.dado = dado
            } else
                println("Indice invalido!")
        } else
            println("Lista Vazia!")
    }

    override fun apagar(posicao: Int): Any?{
        var dadoAux: Any? = null

        if(!estaVazia()){
            if(posicao > 0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for(i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo
                dadoAux = ponteiroAux?.dado

                val ponteiroAnterior = ponteiroAux?.anterior
                val ponteiroProximo =  ponteiroAnterior?.proximo

                if(ponteiroAnterior != null)
                    ponteiroAnterior.proximo = ponteiroProximo
                //remocao do inicio, joga o ponteiro de inicio para o proximo nodo.
                else
                    ponteiroInicio = ponteiroInicio?.proximo

                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = ponteiroAnterior
                //remoção do fim
                else
                    ponteiroFim = ponteiroFim?.anterior

                quantidade = quantidade.dec()
            } else
                println("Posição inválida!")
        } else
            println("Lista vazia")
        return dadoAux
    }

    override fun apagarTodos(): Array<Any?>{
        var dadoAux: Array<Any?> = selecionarTodos()
        limpar()
        return dadoAux
    }

    override fun limpar(){
        ponteiroInicio = null
        ponteiroFim = null
        quantidade = 0
    }

    override fun tamanho(): Int{
        return quantidade
    }
    override fun estaCheia(): Boolean{
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean{
        return quantidade == 0
    }
    override fun imprimir(): String{
        var ponteiroAux = ponteiroInicio
        var resultado = "["
        for (i in 0 until quantidade){
            resultado += ponteiroAux?.dado
            if( i != quantidade - 1)
                resultado += ", "
            ponteiroAux = ponteiroAux?.proximo
        }
        return "$resultado]"
    }

}