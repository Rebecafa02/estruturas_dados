interface Empilhavel {
    //função/métodos/procedure
    //métodos pricipais
    fun empilhar (dado: Any?)
    fun desempilhar (): Any?
    //após o parentesis é o retorno
    fun espiar (): Any?
    fun atualizar(dado: Any?)
    //metodos auxiliares
    fun imprimir(): String
    fun estaCheio(): Boolean
    fun estaVazia(): Boolean
}
