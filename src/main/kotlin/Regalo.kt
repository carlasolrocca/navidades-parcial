import java.time.DayOfWeek
import java.time.LocalDate

abstract class Regalo(
    val marca : String = "",
    val precio : Double = 0.0,
){
    val codigo : Int = 1234

    //Template Method: determina si un regalo es valioso o no.
    fun esValioso(): Boolean {
        return condicionGeneralValioso() && criterioEsValioso()
    }

    //Condicion general y particular. Se usan en el Template Method
    fun condicionGeneralValioso() : Boolean = precio > 5000.0
    abstract fun criterioEsValioso() : Boolean
}

// *** Subclases de Regalo ***

//Si la marca está en la lista, es valioso
class Ropa(marca : String, precio : Double) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean {
        val listaMarcasValiosas = mutableListOf("Jordache", "Lee", "Charro", "Motor Oil")
        return listaMarcasValiosas.contains(marca)
    }
}

//Si se lanzaron antes del año 2000
class Juguete(marca : String, precio : Double, val fechaLanzamiento : LocalDate) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean = fechaLanzamiento.isBefore(LocalDate.of(2000, 1, 1))
}

//Si es de origen extranjero
class Perfume(marca : String, precio : Double, val origen : OrigenRegalo) : Regalo(marca, precio) {

    override fun criterioEsValioso(): Boolean = origen == OrigenRegalo.EXTRANJERO
}

//Si la experiencia es un viernes
class Experiencia(marca : String, precio : Double, val diaExperiencia : LocalDate) : Regalo(marca, precio) {
    override fun criterioEsValioso(): Boolean = diaExperiencia.dayOfWeek == DayOfWeek.FRIDAY
}


enum class OrigenRegalo {
    NACIONAL,
    EXTRANJERO
}
