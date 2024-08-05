package arvore

import NoTriplo

interface Arborizavel<T> {
    fun getRaiz(): arvore.NoTriplo<T>?
    fun inserir(dado: T?)
    fun apagar(dado: T?): Boolean
    fun existe(dado: T?): Boolean
    fun buscar(dado: T?): arvore.NoTriplo<T>?
    fun limpar()
    fun imprimirPreOrdem(): String
    fun imprimirEmOrdem(): String
    fun imprimirPosOrdem(): String
}