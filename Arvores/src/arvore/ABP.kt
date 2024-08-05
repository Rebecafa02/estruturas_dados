package arvore

class ABP<T>: Arborizavel<T> {
    private var raiz: NoTriplo<T>? = null

    override fun getRaiz(): NoTriplo<T>? {
        return raiz
    }

    override fun limpar() {
        raiz = null
    }

    override fun inserir(dado: T?) {
        val novoNo = NoTriplo<T>(dado)
        if(raiz == null){
            raiz = novoNo
        } else {
            var noAuxiliar = raiz
            while(noAuxiliar != null) {
                if((noAuxiliar.dado as Int) > (dado as Int)){
                    //preciso ir para a esquerda
                    if(noAuxiliar.esquerda != null){
                        noAuxiliar = noAuxiliar.esquerda
                        //se a esquerda ta nula, então insere o dado
                    } else{
                        noAuxiliar.esquerda = novoNo
                        novoNo.genitor = noAuxiliar
                        break
                    }
                } else {
                    //precisa ir para a direita
                    if(noAuxiliar.direita != null){
                        noAuxiliar = noAuxiliar.direita
                    } else {
                        noAuxiliar.direita = novoNo
                        novoNo.genitor = noAuxiliar
                        break
                    }
                }
            }
        }
    }

    override fun apagar(dado: T?): Boolean {
        val noAuxiliar: NoTriplo<T>? = buscar(dado)
        var apagar = false
        if(noAuxiliar == null){
            apagar = false
        } else {
            //no sem filhos
            if(noAuxiliar.esquerda == null && noAuxiliar.direita == null){
                apagarNoFolha(noAuxiliar)
                apagar = true
                //com um filho
            } else if(noAuxiliar.esquerda == null || noAuxiliar.direita == null){
                apagarComUmFilho(noAuxiliar)
                apagar = true
            } else{
                apagarComDoisFilhos(noAuxiliar)
                apagar = true
            }
        }
        return apagar
    }

    override fun buscar(dado: T?): NoTriplo<T>? {
        var noAuxiliar = raiz
        while (noAuxiliar != null){
            if(noAuxiliar.dado == dado){
                return noAuxiliar
            } else {
                if((noAuxiliar.dado as Int) > (dado as Int)){
                    noAuxiliar = noAuxiliar.esquerda
                    //se a esquerda ta nula, então insere o dado
                } else{
                    noAuxiliar = noAuxiliar.direita
                }
            }
        }
        return noAuxiliar
    }

    fun apagarNoFolha(noAuxiliar: NoTriplo<T>){
        var pai = noAuxiliar.genitor
        if(pai == null){
            raiz = null
        } else {
            if(noAuxiliar == pai.esquerda){
                pai.esquerda = null
            } else
                pai.direita = null

            noAuxiliar.genitor = null
        }
    }

    fun apagarComUmFilho(noAuxiliar: NoTriplo<T>){
        var avo: NoTriplo<T> = noAuxiliar.genitor
        var neto: NoTriplo<T> = (noAuxiliar.esquerda != null ?: noAuxiliar.direita)
        if(avo == null){
            raiz = neto
            neto.
        }
    }
    override fun imprimirPreOrdem(): String {
        return formatarSaida(imprimirPreOrdemRec(raiz))
    }

    override fun imprimirEmOrdem(): String {
        return formatarSaida(imprimirEmOrdemRec(raiz))
    }

    override fun imprimirPosOrdem(): String {
        return formatarSaida(imprimirPosOrdemRec(raiz))
    }

    private fun imprimirPreOrdemRec(raiz: NoTriplo<T>?): String{
        var resultado = " "
        if(raiz != null){
            resultado =  "${raiz.dado} ${imprimirPreOrdemRec(raiz.esquerda)} ${imprimirPreOrdemRec(raiz.direita)}"
        }
        return resultado
    }

    private fun imprimirEmOrdemRec(raiz: NoTriplo<T>?): String{
        var resultado = " "
        if(raiz != null){
            resultado = "${imprimirEmOrdemRec(raiz.esquerda)}  ${raiz.dado} ${imprimirEmOrdemRec(raiz.direita)}"
        }
        return resultado
    }

    private fun imprimirPosOrdemRec(raiz: NoTriplo<T>?): String{
        var resultado = " "
        if(raiz != null){
            resultado = "${imprimirPosOrdemRec(raiz.esquerda)} ${imprimirPosOrdemRec(raiz.direita)} ${raiz.dado} "
        }
        return resultado
    }

    private fun formatarSaida(msg: String): String{
        var resultado: String
        var mensagem = msg
        do{
            resultado = mensagem
            mensagem = mensagem.replace("  "," ")// remove excesso de espaços

        } while (mensagem != resultado)
        mensagem = mensagem.trim() //remove espaços em branco do inicio e fim
        mensagem = mensagem.replace(" ", ", ")
        return "[$mensagem]"
    }
}