interface empilhavel {
    //função/métodos/procedure
    //métodos pricipais
    fun empilhar (dado: Any?)
    fun desempilhar (): Any? 
    //após o parentesis é o retorno
    fun topo (): Any?
    //metodos auxiliares
    fun imprimir(): String
    fun estaCheio(): Boolean
    fun estaVazia(): Boolean
}

interface enfileirar{
    //métodos principais
    fun enfileirar(dado: Any)
    fun espiar (): Any?
    fun desenfileirar (): Any?
     //metodos auxiliares
     fun imprimir(): String
     fun estaCheio(): Boolean
     fun estaVazia(): Boolean
}

interface listar{
    //métodos principais
    fun inserir (posicao: Int, dado: Any): Boolean
    fun anexar (dado: Any)
    fun selecionar (posicao: Int): Any?
    fun selecionarAll(): Array<Any?>
    fun atualizar(posicao: Int, dado: Any): Boolean
    fun delete (): Any?
    fun limpar()
     //metodos auxiliares
     fun imprimir(): String
     fun estaCheio(): Boolean
     fun estaVazia(): Boolean
}