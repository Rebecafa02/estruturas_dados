class Arvore : Arborizavel {
    private var ponteiroGenitor: NoTriplo? = null
    private var ponteiroEsquerda: NoTriplo? = null
    private var ponteiroDireita: NoTriplo? = null
    private var raiz: NoTriplo? = null

    override fun getRaiz(): NoTriplo {
        return raiz
    }

    override fun limpar() {
        raiz = null
    }
    override fun inserir(dado: Any?){
        var novoNo = NoTriplo(dado)
        if(raiz != null){
            var noAux = raiz
            while (noAux != null){
                if (dado < noAux.dado){
                    // preciso ir pra esquerda
                    if (noAux.esquerda != null){
                        noAux = noAux.esquerda
                    } else {
                        //se está vazio então insiro o dado
                        noAux.esquerda = novoNo
                        novoNo.genitor = noAux
                        break
                    }
                } else {
                    // precisa ir pra direita
                    if (noAux.direita != null)
                        noAux = noAux.direita
                    else {
                        noAux.direita = novoNo
                        novoNo.genitor = noAux
                    }
                }
            }
        } else
            raiz = novoNo
    }

    override fun imprimirPreOrdem(): String {
        return imprimirPreOrdemRec(raiz) //aqui ta chamando a raiz global
    }

    fun imprimirPreOrdemRec(raiz: NoTriplo?): String {
        //aqui tem a raiz global e a do método, para chamar a global utiliza o this
        var resultado = "["
        if (raiz != null){
            resultado += raiz.dado
            resultado += " "
            imprimirPreOrdem(raiz.esquerda)
            resultado += " "
            imprimirPreOrdem(raiz.direita)
        }
        return "$resultado]"
    }
}