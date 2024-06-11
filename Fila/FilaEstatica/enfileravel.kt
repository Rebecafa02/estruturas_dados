interface enfileravel {

    fun enfileirar(dado: Any?) 
    fun desenfileirar(): Any?
    fun espiar(): Any?
    fun atualizar(dado: Any?)
    //atualiza sempre quem está no inicio da fila
    fun estaCheia(): Boolean
    fun estaVazio(): Boolean
    fun imprimir(): String
}