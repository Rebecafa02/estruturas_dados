fun main() {
    var fila: Enfileiravel = FilaDinamica(7)
    //antes dos : é o nome da variavel, após é o seu tipo
    do {
        exibirMenu()
        println("Escolha uma opção (0-5): ")
        val opcao = readLine()!!.toInt()

        when(opcao){
            0 -> {
                println("Saindo da fila. ")
                println("Até mais! ")
            }
            1 -> {
                print("Digite o valor: ")
                val valor = readLine()
                fila.inserir(valor)
            }
            2 -> {
                print("Deseja desenfileirar[s/n]?")
                val confirmacao = readLine() ?: "n"
                if(confirmacao == "s" || confirmacao == "S"){
                    fila.remover()
                    println("Valor removido com sucesso!")
                }
            }
            3 -> {
                println("Frente: ${fila.frente()}")
            }
            4 -> {
                print("Digite o novo valor: ")
                val valor = readLine()
                fila.atualizar(valor)
            }
            5 -> println(fila.imprimir())
            else -> {
                print("Opcao inválida. ")
                println("Tente novamente!")
            }
        }
    } while (opcao != 0)
}

fun exibirMenu(){
    println("=== FILA DINÂMICA ===")
    println("0 = Sair")
    println("1 = Enfileirar")
    println("2 = Desenfileirar")
    println("3 = Saber o que está na frente da fila")
    println("4 = Atualizar dado")
    println("5 = Imprimir")
}