//só é possivel controlar a prioridade atravez de referencias numericos, o numero pode referenciar um dado

public interface Amontoavel{
    fun imprimir(): String
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean

    fun inserir(dado: Int)
    fun extrair(): Int
    fun obter(): Int
    fun atualizar(dado: Int)

    //fun pai (filho: Int): Int
    //fun filho (pai: Int): Int
}