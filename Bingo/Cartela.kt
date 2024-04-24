import kotlin.random.Random

data class Cartela(var nome: String, var pontos: Int = 0) {

    private var numerosDaCartela = arrayOfNulls<Int>(25)

    public fun gerarNumerosDaCartela(): Array<Int?> {
        for (indice in 0..24){
            do {
                var rnd = Random.nextInt(1, 100)
                numerosDaCartela[indice] = rnd
            }while (!repetido(rnd))
        }
        return this.numerosDaCartela
    }

    public fun getJogador(): String{
        return nome
    } 
    
    public fun getNumeros(): Array<Int?>{
        return numerosDaCartela
    }

    public fun contemNumero(numero: Int): Boolean{
        for(i in 0..24){
            if(numero == numerosDaCartela[i]){
                return true
            }
        }
        return false
    }

    public fun imprimir(): String {
        var cart: String = "Cartela: "
        for (i in 0..24){

            cart += numerosDaCartela[i]

            if (i != 0 && ((i+1)%5) == 0){
                cart += " | "
            }

            if (i != 24 && ((i+1)%5) != 0){
                cart += ", "
            }
        }
        println(cart)
        return cart
    }

    private fun repetido(numero: Int): Boolean {
        val todosNumerosSorteados = this.numerosDaCartela
        for (i in 0 until todosNumerosSorteados.size) {
            if (todosNumerosSorteados[i] == numero) {
                return true
            }
        }
        return false
    }
}
