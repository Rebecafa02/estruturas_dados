interface EnfileiravelDupla {
    //metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimirFrenteParaTras(): String
    fun imprimirTrasParaFrente(): String
    //metodos principais
    fun inserirInicio(dado: Any?)
    fun inserirFim(dado: Any?)
    fun removerInicio(): Any?
    fun removerFim(): Any?
    fun frente(): Any?
    fun final(): Any?
    fun atualizarInicio(dado: Any?)
    fun atualizarFim(dado: Any?)

}