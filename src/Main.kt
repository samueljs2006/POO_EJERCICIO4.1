class Rectangulo ( val base : Double , val altura : Double){

    init {
        require(base > 0) {"La base tiene que se mayor que 0,"}
        require(altura > 0) {"La altura tiene que se mayor que 0,"}
    }

    fun calcularArea()= base * altura


    fun calcularPerimetro() =  2 * (base + altura)


    override fun toString(): String {
        return "Rectángulo(base=$base, altura=$altura)"
    }
}

fun main() {

    val rectangulo1 = Rectangulo(5.0, 3.0)
    val rectangulo2 = Rectangulo(7.5, 2.0)
    val rectangulo3 = Rectangulo(10.0, 4.5)

    val rectangulos = listOf(rectangulo1, rectangulo2, rectangulo3)

    rectangulos.forEach { rectangulo ->
        println(rectangulo)
        println("Área: ${rectangulo.calcularArea()}")
        println("Perímetro: ${rectangulo.calcularPerimetro()}\n")
    }
}