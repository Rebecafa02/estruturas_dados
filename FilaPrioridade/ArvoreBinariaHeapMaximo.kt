class ArvoreBinariaHeapMaximo(tamanho: Int = 10) : Amontoavel{
    private var dados = IntArray(tamanho) { 0 }
    private var ponteiroFim = -1

    override fun imprimir(): String{
        var resultado = "["
        for (i in 0 .. ponteiroFim){
            resultado+= "${dados[i]}"
            if( i != ponteiroFim)
                resultado += ","
        }
        return "$resultado]"
    }

    override fun estaVazia(): Boolean{
        return (ponteiroFim == -1)
    }

    override fun estaCheia(): Boolean{
        return ponteiroFim == dados.size -1
    }

    override fun inserir(dado: Int){

    }

    override fun extrair(): Int{

    }

    override fun obter(): Int{
        var raiz = 0
        if (!estaVazia())
        raiz = dados[0]
        return raiz
    }

    override fun atualizar(dado: Int){

    }

    pivate fun troca (i: Int, j: Int){
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    private fun indicePai(indiceFilho: Int): Int{
        return (indiceFilho -1)/2
    }

    
}