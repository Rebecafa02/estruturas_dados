class ListaDinamica(var tamanho: Int = 10) : Listavel {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    override fun anexar(dado: Any?){
        if(!estaCheia()) {
            var noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim
            if (!estaVazia())
                ponteiroFim?.proximo = noTemp
            else
                ponteiroInicio = noTemp

            ponteiroFim = noTemp
            quantidade = quantidade.inc()
        } else
            print("A lista já está cheia")
    }

    override fun selecionarTodos(): Array<Any?>{
        var dadoAux: Array<Any?> = arrayOfNulls(tamanho)
        if (!estaVazia()){
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade){
                dadoAux[i] = ponteiroAux?.dado
                ponteiroAux = ponteiroAux?.proximo
            }
        }
        return dadoAux
    }

    override fun selecionar(posicao: Int): Any?{
        var dadoAux: Any? = null
        if(!estaVazia()){
           if(posicao >= 0 && posicao < quantidade){
               var ponteiroAux = ponteiroInicio
               for (i in 0 until posicao)
                   ponteiroAux = ponteiroAux?.proximo
               dadoAux = ponteiroAux?.dado
           } else
               println ("Posição inválida")
        } else
            println("Lista vazia!")
        return dadoAux
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()){
            if(posicao >= 0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo
                ponteiroAux?.dado = dado
            } else
                println("Posição inválida")
        } else
            println("Lista vazia!")
    }

    fun limpar(){
        ponteiroInicio = null
        ponteiroFim = null
        quantidade = 0
    }

    fun apagarTodos(): Array<Any?>{
        var dadosAux: Array<Any?> = selecionarTodos()
        limpar()
        return dadosAux
    }

    override fun apagar(posicao: Int): Any?{
        var dadoAux: Any? = null
        if (!estaVazia()){
            if(posicao >= 0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for(i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo
                dadoAux = ponteiroAux?.dado

                val ponteiroAnterior = ponteiroAux?.anterior
                val ponteiroProximo = ponteiroAux?.proximo

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = ponteiroProximo
                else
                    ponteiroInicio = ponteiroInicio?.proximo

                if(ponteiroProximo != null)
                    ponteiroProximo.anterior = ponteiroAnterior
                else
                    ponteiroFim = ponteiroFim?.anterior

                quantidade = quantidade.dec()
            } else
                println("Posição inválida")
        } else
            println("Lista vazia!")

        return dadoAux
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if(!estaCheia()){
            if(posicao >= 0 && posicao < quantidade){
                val noTemp = NoDuplo(dado)
                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for(i in 0 until posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = noTemp
                else //inserção no inicio
                    ponteiroInicio = noTemp

                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = noTemp
                else
                    ponteiroFim = noTemp

                noTemp.proximo = ponteiroProximo
                noTemp.anterior = ponteiroAnterior

                quantidade = quantidade.inc()
            } else
                println("Indice invalido")
        } else
            println("Lista cheia!")
    }

    override fun estaCheia(): Boolean{
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean{
        return quantidade == 0
    }

    fun tamanho(): Int{
        return quantidade
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            resultado += ponteiroAux?.dado
            if (i != quantidade - 1)
                resultado += ", "
            ponteiroAux = ponteiroAux?.proximo
        }
        return "$resultado]"
    }
    fun ordenar(){
        if(quantidade > 1){
            for(i in 0 until quantidade-1){
                var atual: NoDuplo? = ponteiroInicio
                var proximo: NoDuplo? = atual.proximo
                for(j in 0 until (quantidade-1) + i){
                    if (atual?.dado > proximo?.dado){
                        var noTemp = atual?.dado
                        atual?.dado = proximo?.dado
                        proximo?.dado = noTemp
                    }
                    atual = atual?.proximo
                    proximo = atual?.proximo
                }
            }
        }
    }

}


