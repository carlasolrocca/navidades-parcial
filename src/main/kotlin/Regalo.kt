import java.time.DayOfWeek
import java.time.LocalDate

abstract class Regalo(
    val marca : String = "",
    val valor : Double = 0.0,
){
    val codigo : Int = 1234

    //Template Method: determina si un regalo es valioso o no.
    fun esValioso(): Boolean {
        return condicionGeneralValioso() && criterioEsValioso()
    }

    //Condicion general y particular. Se usan en el Template Method
    fun condicionGeneralValioso() : Boolean = valor > 5000.0
    abstract fun criterioEsValioso() : Boolean
}

// *** Subclases de Regalo ***

//Si la marca está en la lista, es valioso
class Ropa(marca : String, valor : Double) : Regalo(marca, valor) {
    override fun criterioEsValioso(): Boolean {
        val listaMarcasValiosas = mutableListOf("Jordache", "Lee", "Charro", "Motor Oil")
        return listaMarcasValiosas.contains(marca)
    }
}

//Si se lanzaron antes del año 2000
class Juguete(marca : String, valor: Double, val fechaLanzamiento : LocalDate) : Regalo(marca, valor) {
    override fun criterioEsValioso(): Boolean = fechaLanzamiento.isBefore(LocalDate.of(2000, 1, 1))
}

//Si es de origen extranjero
class Perfume(marca : String, valor: Double, val origen : OrigenRegalo) : Regalo(marca, valor) {

    override fun criterioEsValioso(): Boolean = origen == OrigenRegalo.EXTRANJERO
}

//Si la experiencia es un viernes
class Experiencia(marca : String, valor: Double, val diaExperiencia : LocalDate) : Regalo(marca, valor) {
    override fun criterioEsValioso(): Boolean = diaExperiencia.dayOfWeek == DayOfWeek.FRIDAY
}

//Cambie "precio" por "valor" porque el Voucher tmb es un Regalo y no me servia tener un precio
//Los Vouchers NO son valiosos, tienen seteada la marca en "Pappap" y el valor en 2000.0
class Voucher(marca : String = "Pappap", valor: Double = 2000.0) : Regalo(marca, valor){
    override fun criterioEsValioso(): Boolean = false
}

enum class OrigenRegalo {
    NACIONAL,
    EXTRANJERO
}
