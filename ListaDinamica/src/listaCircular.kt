class listaCircular(val tamanho: Int = 10): Listavel{

    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    private var posicaoFisica: Int = 0

    override fun anexar(dado: Any?) {
        if (!estaCheia()){
            ponteiroFim++
            if(ponteiroFim == dados.size)
                ponteiroFim = 0
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("List is full")
        }
    }
    //anexa no final da fila
    override fun inserir(posicao: Int, dado: Any?){
        if (!estaCheia){
            if(posicao>= && posicao<=quantidade){
                posicaoFisica = (posicao + ponteiroInicio) % dados.size
            }
        }

    }
    //insere em determinada posição
    override fun selecionar (posicao: Int): Any?{
        var dadoAux: Any? = null
        if(posicao >= 0 && 
                    posicao < quantidade){
            posicaoFisica = (ponteiroInicio + posicao) % dados.size
            dadoAux = dados[posicaoFisica]
        } else {
            println("Invalid index")
        }
        return dadoAux
    }
    override fun selecionarTodos(): Array<Any?>{
        var dadosAux: Array<Any?> =  arrayOfNulls(quantidade)
        for (i in 0 .. quantidade){
            dadosAux[i] = dados[(ponteiroInicio + i)%dados.size]
        }
        return dadosAux
    }
    //posição fisica (posição no array) -  para o programador
    //posição logica (posição na lista) - para o usuario

    override fun atualizar(posicao:Int, dado: Any?){
        if(posicao >= 0 && posicao < quantidade){
           var posicaoFisica = (ponteiroInicio + posicao) % dados.size
           //quando o numero é menor que o divisor o resto é o proprio numero dividendo
           dados[posicaoFisica] = dado
        } else {
            println("Invalid index")
        }
    }
    override fun apagar (posicao: Int): Any?{
        dadoAux: Any? = null
        if(!estaVazia){
            if (posicao >=0 && posicao < quantidade){
                posicaoFisica = (posicao + ponteiroInicio) % dados.size
                dadoAux = dados[posicaoFisica]
                atual = posicaoFisica
                for(i in 0 .. quantidade-posicao-1){
                    proxima = (atual + 1) % dados.size
                    dados[atual] = dados[proxima]
                    atual = (atual + 1) % dados.size
                }
                ponteiroFim--
                if (ponteiroFim == -1)
                ponteiroFim = dados.size -1
            }
        }
    }
    //metodos auxiliares
    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
        //size retorna a quantidade total de posições, em uma array de 0 a 9 tem 10 posições
    }
    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String{
        var resultado = "["
        var aux = ponteiroInicio
        for(i in 0 until quantidade){
            if (i == quantidade)
                resultado += "${dados[(ponteiroInicio +i)$dados.size]}"
            else 
            resultado += "${dados[(ponteiroInicio +i)$dados.size]},"
            
            aux++
            if (aux == dados.size)
                aux = 0
        }
        return "$resultado]"
    }


}