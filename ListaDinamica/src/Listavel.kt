interface Listavel{
    //metodos principais
    fun anexar(dado: Any?) 
    //anexa no final da fila
    fun inserir(posicao: Int, dado: Any?)
    //insere em determinada posição
    fun selecionar (posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun atualizar(posicao:Int, dado: Any?)
    fun apagar (posicao: Int): Any?
    //metodos auiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String

}