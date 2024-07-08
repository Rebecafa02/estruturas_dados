class ArvoreBinariaHeapMinimo(tamanho: Int = 10): Amontoavel{
    private var dados = IntArray(tamanho){0}
    private var ponteiroFim = -1

    override fun imprimir(): String{
        var resultado = "["
        for (i in 0..ponteiroFim){
            resultado += "${dados[i]}"
            if (i != ponteiroFim)
                resultado += ","
        }
        return "$resultado]"
    }

    override fun estaVazia(): Boolean{
        return ponteiroFim == -1
    }

    override fun estaCheia(): Boolean{
        return ponteiroFim == dados.size -1
    }

    override fun inserir(dado: Int){
        if(!estaCheia()){
            ponteiroFim++
            dados[ponteiroFim] = dado
            ajustarAcima(ponteiroFim)
        } else {
            print("Heap esta cheio!")
        }
    }
    override fun extrair(): Int{
        var raiz = 0
        if(!estaVazia()){
            //retorna o que esta na raiz
            raiz = dados[0]
            dados[0] = dados[ponteiroFim]
            ponteiroFim--
            ajustarAbaixo(0)
            //ultimo dado inserido vai para raiz
            //chama ajustarAbaixo
        } else {
            print ("Heap vazia")
        }
        return raiz
    }

    override fun obter(): Int{
        var raiz = 0
        if (!estaVazia()){
            raiz = dados[0]
        }
        return raiz
    }
    
    private fun troca(i: Int, j: Int){
        val temp = dados[i]
        dados[i] =  dados[j]
        dados[j] =  temp
    }

    private fun indicePai(indiceFilho: Int): Int{
        return (indiceFilho -1)/2
    }

    private fun indiceFilhoEsquerdo(indicePai: Int): Int{
        return indicePai * 2 + 1
    }

    private fun indiceFilhoDireito(indicePai: Int): Int{
        return indicePai *2 + 2
    }

    private fun ajustarAcima(indice:  Int){
        var indiceAux = indice
        while (indiceAux != 0){
            if (dados[indicePai(indiceAux)] > dados[indiceAux]){
            troca(indicePai(indiceAux), indiceAux)
            indiceAux = indicePai(indiceAux)
            } else {
                break
            }
        }
    }

    private fun ajustarAbaixo(indicePai: Int){
        var filhoEsquerdo = indiceFilhoEsquerdo(indicePai)
        var filhoDireito = indiceFilhoDireito(indicePai)
        var menor = indicePai

        if (filhoEsquerdo <= ponteiroFim){
            if (dados[menor] > dados[filhoEsquerdo]){
                menor = filhoEsquerdo
            }
        }

        if (filhoDireito <= ponteiroFim){
            if(dados[menor] > dados[filhoDireito]){
                menor = filhoDireito
            }
        }

        if (menor != indicePai){
            troca(menor, indicePai)
            ajustarAbaixo(menor)
        }

    }

    override fun atualizar(dado: Int){
        if(!estaVazia()){
            dados[0] =  dado
            ajustarAbaixo(0)
        } else {
            print ("Heap Vazia")
        }
    }

}
