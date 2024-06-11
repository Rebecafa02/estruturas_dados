class FilaEstatica (val tamanho: Int=10) : enfileravel{
    //variaveis de instância
    private var ponteiroInicio = 0 //pode omitir o tipo porque ele entende quando atribuimos um valor
    private var ponteiroFim: Int = -1 //0L = inteiro tipo long
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    //this. - para chamar uma propriedde da classe
    //this() - referencia a propria classe
    
    //métodos auxiliares
    override fun estaCheia(): Boolean{
      return (ponteiroFim == dados.size -1)
    }

    override fun estaVazio(): Boolean{
        return (ponteiroFim +1 == ponteiroInicio)
    }

    override fun imprimir(): String{
        var resultado = "["
        for (i in ponteiroInicio .. ponteiroFim)
            if(i == ponteiroFim){
                resultado += "$dados[i]"
            } else {
                resultado += "${dados[i]} ,"
            }
            return "$resultado]"
    }
    //métodos principais
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
        ponteiroInicio ++
        }
        else {
            println("Queue is empty!")
        }
        return dado
    }
    override fun enfileirar(dado: Any?){
        if (!estaCheia()){
        ponteiroFim++
        dados[ponteiroFim] =  dado}
        else {
            println("Queue está cheia!")
        }
    }

    override fun atualizar ( novoDado: Any?){
        if (!estaVazio()){
            dados[ponteiroInicio] = novoDado
        }
        else 
        println("Can't update!")
    }
}