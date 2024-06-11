interface Enfileiravel {
    //metodos principais
    fun inserir(dado: Any?)
    fun remover (): Any?
    fun atualizar(dado: Any?)
    fun frente(): Any?

    //metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}