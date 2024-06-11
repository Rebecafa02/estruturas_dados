class FilaEstaticaCircular (val tamanho: Int = 10): enfileravel{
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?>
 = arrayOfNulls(tamanho)
 private var quantidade = 0

    override fun estaCheia(): Boolean{
     return (quantidade == dados.size)
     }
     override fun estaVazio(): Boolean {
        return (quantidade == 0)
     }

     override fun espiar(): Any?{
        var dado: Any? = null
        if(!estaVazio()){
        dado = dados[ponteiroInicio]
    }
        else {
        println("Está vazia")}
        return dado
    }

    override fun desenfileirar(): Any?{
        var dado: Any? = null
        if(!estaVazio()){
        dado = dados[ponteiroInicio]
        ponteiroInicio++
        if(ponteiroInicio == dados.size)
            ponteiroInicio = 0
        quantidade--
    }
        else {
         println("Está vazia")}
        return dado
    }

    override fun enfileirar(dado:Any?){
        if(!estaCheia()){
            ponteiroFim++
            if (ponteiroFim == dados.size){
                ponteiroFim = 0
                dados[ponteiroFim] = dados
                quantidade++
            }
        }
        else {
            println("Fila Cheia!")
        }
    }

    override fun imprimir(): String{
        var resultado = "["
        var aux = ponteiroInicio
        for(i in 0 .. quantidade){
            if (i == quantidade)
            resultado += "${dados[aux]}"
            else 
            "${dados[aux]},"
            aux++
            if (aux == dados.size)
                aux = 0
        }
        return "$resultado]"
    }
    
    override fun atualizar ( novoDado: Any?){
        if (!estaVazio()){
            dados[ponteiroInicio] = novoDado
        }
        else 
        println("Can't update!")
    }
}