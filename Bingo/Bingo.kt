

import kotlin.arrayOfNulls

data class Bingo (val tamanho: Int = 10){

    private var cartelas:  Lista<Cartela> = Lista()
    private var numerosSorteados: Lista<Int> = Lista()
    private var cartelasJogo: Array<Cartela?> = arrayOfNulls(tamanho)
  
    //Recebe uma cartela e verifica se ela é igual a alguma outra cartela do array, caso seja diferente, insere a cartela no final do array e retorna true, caso contrario retorna false
    fun incluirCartela(cartela: Cartela): Boolean{
        var resultado = false
        for (i in 0 until cartelasJogo.size-1){
            if(cartelasJogo[i]?.getJogador().equals(cartela.getJogador(), ignoreCase = true) || cartelasJogo[i]?.getNumeros()?.equals(cartela.getNumeros()) == true){
                resultado = false
            } else {
                cartelas.add(cartela)
                resultado = true
            }
        }
        return resultado
    }

    //Recebe o nome do jogador, localiza sua cartela e muda seu nome. Caso o processo seja executado com sucesso retorna true, caso contrario retorna false
    //cartelasJogo equivale a "dados" nas listas desenvolvidas em sala
    fun alterarJogador (jogadorAntigo: String, jogadorNovo: String){
        for (i in 0 until cartelasJogo.size-1 ){
            if(cartelasJogo[i]?.nome.equals(jogadorAntigo, ignoreCase = true)){
                cartelasJogo[i]?.nome = jogadorNovo
                println("Nome alterado com sucesso!")
            } else 
                println("Nao foi possivel localizar esse jogador :/")
        } 
       
    }

    //Recebe o nome do jogador e localiza sua cartela, caso consiga localizar a cartela, ela é excluida.
    fun excluirCartela (jogador: String ){
        for ( i in 0 until cartelasJogo.size-1){
            if(cartelasJogo[i]?.getJogador().equals(jogador, ignoreCase = true)){
                cartelas.apagar(i)
                println("Cartela excluida")
            } else 
                println("Cartela não encontrada :/")
        }
    }

    //Cria um array de String com os nomes dos jogadores que possuem o numero sorteado na cartela
    fun verificarJogadoresSorteio (numeroSorteado: Int): Array<String?>{
        var jogadoresComNumerosSorteados: Array<String?> = arrayOfNulls(cartelasJogo.size)
        for (i in 0 until cartelasJogo.size-1 ){
            if (cartelasJogo[i]?.contemNumero(numeroSorteado) == true){
                jogadoresComNumerosSorteados += (cartelasJogo[i]?.nome + "/n")
            }
        }
        return jogadoresComNumerosSorteados
    }

    /*fun verificarVencedores (): Array<String?> {
        var tam: Int = 0
        var vencedores : Array<String?> = arrayOfNulls(tam)
        for(i in 0 until cartelasJogo.size-1){
            if (cartelasJogo[i]?.getNumeros()?.equals(numerosSorteados) == true)
                vencedores += cartelasJogo[i]?.nome + ", "

        }
        return vencedores
    }*/

    //retorna o array com nome dos jogadores e suas cartelas na ordem em que foram inseridos
    fun consultarJogadores(cartelas: Array<Cartela?>): Array <String?>{
        var jogadoresCartelas: Array<String?> = arrayOfNulls(cartelasJogo.size)
        if (cartelas.isEmpty() == true)
            println("Nao ha cartelas cadastradas")
        else {
            for (i in 0 until cartelasJogo.size-1)
            jogadoresCartelas[i] = ("jogador " + (i + 1) + " = " + cartelasJogo[i]?.nome + cartelasJogo[i]?.imprimir() + "/n")
        }
        return jogadoresCartelas
    }

    //numeros na ordem que foram sorteados
    fun consultarNumSorteados(){  //igual getNumerosSorteados
       println ( "Numeros sorteados ate o momento: " + numerosSorteados.imprimir())
    }

    //numeros em ordem crescente
    fun consultarNumOrdemCrescente(){
        println ("Numeros sorteados em ordem crescente: " + numerosSorteados.ordenar())
    }

    //ordena as cartelas em quantidade de numeros sorteados em ordem decrescente e retorna o nome do jogador e a quantidade de numeros sorteados dele
    fun consultarQtdNumSorteados(cartelas: Lista<Cartela> ): Array <String>{
        for (c in 0 until cartelasJogo.size){
            var sorteados = numerosSorteados.selecionarTodos()
            var numerosCartela = cartelasJogo[c]?.getNumeros()

            for (i in 0 until numerosCartela!!.size){
                for(j in 0 until sorteados.size){
                    if(numerosCartela[i] == sorteados[i])
                        cartelasJogo[c]?.pontos = cartelasJogo[c]!!.pontos.inc()
                }
            }
        } 
    }


    //retorna os numeros nao sorteados da cartela de cada jogador
    fun consultarNumNaoSorteados (cartela: Cartela): Array<Int>{

    }
}

