import java.time.DayOfWeek
import java.time.LocalDate

abstract class Regalo(
    val marca : String = "",
    val precio : Double = 0.0,
){
    val codigo : Int = 1234

    //Template Method: determina si un regalo es valioso o no.
    //Lo es cuando precio>5000.0 y se cumple la condicion particular propia de c/Regalo
    fun esValioso(): Boolean {
        return precio > 5000.0 &&  criterioEsValioso()
    }
    abstract fun criterioEsValioso() : Boolean
}

// *** Subclases de Regalo ***
class Ropa(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        val listaMarcasValiosas = mutableListOf("Jordache", "Lee", "Charro", "Motor Oil")
        return listaMarcasValiosas.contains(marca)  //Si la marca está en la lista, es valioso
    }
}

class Juguete(marca : String, precio : Double, val fechaLanzamiento : LocalDate) : Regalo(marca, precio) {
    //Si se lanzaron antes del año 2000
    override fun criterioEsValioso(): Boolean = fechaLanzamiento.isBefore(LocalDate.of(2000, 1, 1))
}

class Perfume(marca : String, precio : Double, val origen : OrigenRegalo) : Regalo(marca, precio) {
    //Si es de origen extranjero
    override fun criterioEsValioso(): Boolean = origen == OrigenRegalo.EXTRANJERO
}

class Experiencia(marca : String, precio : Double, val diaExperiencia : LocalDate) : Regalo(marca, precio) {
    //Si la experiencia es un viernes
    override fun criterioEsValioso(): Boolean = diaExperiencia.dayOfWeek == DayOfWeek.FRIDAY
}

enum class OrigenRegalo {
    NACIONAL,
    EXTRANJERO
}
