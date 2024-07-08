fun main() {
	var heap: Amontoavel = ArvoreBinariaHeapMinimo(10)
	heap.inserir(0)//Maria
  	heap.inserir(1)//Jose
  	heap.inserir(2)//João
	heap.inserir(1)//Manoel	
	println(heap.imprimir())
	println(heap.extrair())	//0
	println(heap.obter())	//1
	println(heap.imprimir()) 
    println(heap.extrair())	//1
    println(heap.obter())	//1
	println(heap.imprimir())
    println(heap.extrair())	//1
    println(heap.imprimir())
}