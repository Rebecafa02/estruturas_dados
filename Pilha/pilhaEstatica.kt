class pilhaEstatica : empilhavel{
    //Variaveis globais (de instância)PS C:\Users\rebec\OneDrive\Área de Trabalho\3Sem\Est. de dados\teste.kt> cd "c:\Users\rebec\OneDrive\Área de Trabalho\3Sem\Est. de dados\teste.kt\" ; if ($?) { kotlinc pilhaEstatica.kt, pilhaInvertida.kt, empilhavel.kt, main.kt -include-runtime -d main.jar } ; if ($?) { java -jar main.jar }
    //sinalizar apenas quando for privado ou protected, não precisa sinalizar o public, é o padrão
    private var ponteiroTopo: Int 
    private var dados: Array<Any?>
    //construtores
    constructor(): this(10) //quando chama o this como uma função ela referencia a propria classe, nesse caso o construtor

    constructor (tamanho: Int){ 
        ponteiroTopo = -1
        dados = arrayOfNulls(tamanho)
    }

    //métodos auxiliares
 
    override fun estaCheio(): Boolean{
        return (ponteiroTopo == dados.size -1)
    /*    if (ponteiroTopo == dados.size -1)
            return true
        else 
             return false*/
    }
    override fun estaVazia(): Boolean{
        return (ponteiroTopo == -1)
    }
    override fun imprimir(): String{
        var resultado: String = "["
        //iterar a pilha
        for(i in ponteiroTopo downTo 0){//step 2 = para pular de 2 em 2; in é uma variavel de controle da linguagem
           if (i == 0)
           resultado += "$dados[i]"
           else
            resultado += "${dados[i]},"
        } 
        return "$resultado]" //$ indica que é uma variavel ou um trecho a ser processado: ${processo}
        // "[A, Z,G,F]"
    } //override obrigatorio

    //métodos principais
    // interrogação indica que o dado aceita valores nulos
    override fun empilhar (dado: Any?){ 
        if (!estaCheio()){
            ponteiroTopo++
            dados[ponteiroTopo] = dado 
        } else {
            println("Stack is full!")
        }
    }
    override fun desempilhar (): Any? { //após o parentesis é o retorno
        var retorno: Any? = null 
        if (!estaVazia()){
            retorno = dados[ponteiroTopo]
            ponteiroTopo--
        } else {
            println("Stack is empty!")}
        return retorno
        
    }
    override fun topo (): Any?{
        var retorno: Any? = null 
        if (!estaVazia())
            retorno = dados[ponteiroTopo] //apenas diz para a máquina que aquela região está livre e pode ser sobrescrita
        else {
                println("Stack is empty!")}
        return retorno
        
       /* if (!estaVazia())
          return dados [ponteiroTopo]
        else
          return null*/
    }
}