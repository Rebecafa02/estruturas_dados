interface duplamenteEnfileiravel{
    fun enfileirarInicio(dado: Any?)
    fun efileirarFim(dado: Any?) 
    //já tem
    fun desenfileirarInicio(): Any? 
    //ja tem
    fun desenfileirarFim(): Any?
    fun espiarInicio(): Any?
    //ja tem
    fun espiarFim(): Any?
    fun atualizarInicio(novoDado: Any?)
    //ja tem
    fun atualizarFim(novoDado: Any?)
    fun estaCheia(): Boolean 
    //ja tem
    fun estaVazia(): Boolean
    //ja tem
    fun imprimir(): String 
    //ja tem 

}