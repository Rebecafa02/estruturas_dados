class FilaDuplaTerminacao(var tamanho: Int = 10) : EnfileiravelDupla {
    var ponteiroInicio: NoDuplo? = null
    var ponteiroFim: NoDuplo? = null
    var quantidade = 0

    //metodos auxiliares

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimirFrenteParaTras(): String {
        var ponteiroAux = ponteiroInicio
        var resultado = "["
        for (i in 0 until quantidade){
            resultado += "${ponteiroAux?.dado}"
            if (i != quantidade -1)
                resultado += ", "
            ponteiroAux = ponteiroAux?.proximo
        }
        return "$resultado]"
    }

    override fun imprimirTrasParaFrente(): String {
        var ponteiroAux = ponteiroFim
        var resultado = "["
        for (i in 0 until quantidade){
            resultado += "${ponteiroAux?.dado}"
            if (i != quantidade -1)
                resultado += ", "
            ponteiroAux = ponteiroAux?.anterior
        }
        return "$resultado]"
    }

    override fun inserirFim(dado: Any?) {
        var noTemp = NoDuplo(dado)
        if (!estaCheia()){
            noTemp.anterior = ponteiroFim
            if(!estaVazia())
                ponteiroFim?.proximo = noTemp
            else
                ponteiroInicio = noTemp
            ponteiroFim = noTemp
            quantidade = quantidade.inc()
        } else
            println("A fila está cheia! ")
    }

    override fun inserirInicio(dado: Any?){
        var noTemp = NoDuplo(dado)
        if(!estaCheia()){
            noTemp.proximo = ponteiroInicio
            if (!estaVazia())
                ponteiroInicio?.anterior = noTemp
            else
                ponteiroFim = noTemp
            ponteiroInicio = noTemp
            quantidade = quantidade.inc()
        } else
            println("A fila está cheia!")
    }

    override fun removerInicio(): Any? {
        var dadoAux: Any? = null
        if(!estaVazia()){
            dadoAux = ponteiroInicio?.dado
            ponteiroInicio = ponteiroInicio?.proximo
            quantidade = quantidade.dec()
            if (!estaVazia())
                ponteiroInicio?.anterior = null
            else
                ponteiroFim = null

        } else
            println("A fila esta vazia!")
        return dadoAux
    }

    override fun removerFim(): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()){
            dadoAux = ponteiroFim?.dado
            ponteiroFim = ponteiroFim?.anterior
            quantidade = quantidade.dec()
            if(!estaVazia())
                ponteiroFim?.proximo = null
            else
                ponteiroInicio = null
        } else
            println("A fila esta vazia!")
        return dadoAux
    }

    override fun frente(): Any? {
        var dadoAux: Any? = null
        if(!estaVazia())
            dadoAux = ponteiroInicio?.dado
        else
            println("A fila esta vazia!")
        return dadoAux
    }

    override fun final(): Any? {
        var dadoAux: Any? = null
        if(!estaVazia())
            dadoAux = ponteiroFim?.dado
        else
            println("A fila esta vazia!")
        return dadoAux
    }

    override fun atualizarInicio(dado: Any?) {
        if(!estaVazia())
            ponteiroInicio?.dado = dado
        else
            println("A fila esta vazia!")
    }

    override fun atualizarFim(dado: Any?) {
        if(!estaVazia())
            ponteiroFim?.dado = dado
        else
            println("A fila esta vazia!")
    }
}