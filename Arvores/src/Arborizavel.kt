interface Arborizavel {
    fun getRaiz(): NoTriplo
    fun inserir(dado:Any?)
    fun apagar (dado:Any?): Boolean
    fun existe (dado:Any?):Boolean
    fun limpar()
    fun imprimirPreOrdem(raiz: ): String //imprime primeiro a raiz, RAIZ [E] [D]
    // depois toda a sub arvore direita e depois toda a subarvore direira
    fun imprimirOrdem(): String // imprime primeiro a subarvores esquerda, a raiz
    //depois a subarvore direita [E] RAIZ [D]
    fun imprimirPosOrdem(): String //[E] [D] RAIZ
    //primeiro toda a subarvore esquerda, depois a subarvore direita e por ultimo a raiz

}