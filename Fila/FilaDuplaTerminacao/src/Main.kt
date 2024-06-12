fun main() {
    var fila: EnfileiravelDupla = FilaDuplaTerminacao(7)
    do {
        exibirMenu()
        println("Escolha uma opção (0-6)")
        var opcao = readLine()!!.toInt()

        when (opcao){
            0 ->{
                println("Saindo da fila, até mais!")
            }
            1 -> {
                println("Digite o valor a ser inserido")
                var valor = readLine()
                println("Deseja inserir o inicio ou no final (i/f)")
                var confirmacao = readLine()
                if(confirmacao == "i" || confirmacao == "I") {
                    fila.inserirInicio(valor)
                } else
                    fila.inserirFim(valor)
            }
            2 -> {
                println("Deseja remover do inicio ou do fim da fila? (i/f)")
                var confirmacao = readLine()
                if(confirmacao == "i" || confirmacao == "I")
                    println(fila.removerInicio())
                else
                    println(fila.removerFim())
            }
            3 -> {
                println(fila.frente())
            }
            4 -> {
                println(fila.final())
            }
            5 -> {
                println("Insira o novo valor: ")
                var valor = readLine()
                println("Deseja atualizar o valor do inicio ou do fim da fila? (i/f)")
                var confirmacao = readLine()
                if(confirmacao == "f" || confirmacao == "F")
                    fila.atualizarFim(valor)
                else
                    fila.atualizarInicio(valor)
            }
            6 -> {
                println("Deseja imprimir começando pelo inicio ou pelo fim? (i/f)")
                var confirmacao = readLine()
                if(confirmacao == "f" || confirmacao == "F")
                    println(fila.imprimirTrasParaFrente())
                else
                    println(fila.imprimirFrenteParaTras())
            }
        }
    } while (opcao != 0)
}
fun exibirMenu(){
    println("0 - Sair")
    println("1 - Inserir valor na fila")
    println("2 - Remover da fila")
    println("3 - Ver a frente da fila")
    println("4 - Ver o final da fila")
    println("5 - Atualizar dado ")
    println("6 - Imprimir fila")
}