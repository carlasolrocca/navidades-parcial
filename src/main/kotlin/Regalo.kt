abstract class Regalo(
    val marca : String = "",
    val precio : Double = 0.0,
){
    val codigo : Int = 1234

    //Template Method: determina si un regalo es valioso o no.
    //Cuando es precio>5000.0 y cuando se cumple la condicion particular propia de c/Regalo
    fun esValioso(): Boolean {
        return precio > 5000.0 &&  criterioEsValioso()
    }
    abstract fun criterioEsValioso() : Boolean
}

// *** Subclases de Regalo ***
class Ropa(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        TODO("Not yet implemented")
    }
}

class Juguete(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        TODO("Not yet implemented")
    }
}

class Perfume(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        TODO("Not yet implemented")
    }
}

class Experiencia(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        TODO("Not yet implemented")
    }
}

