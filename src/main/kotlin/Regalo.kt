class Regalo(
    val marca : String = "",
    val precio : Double = 0.0,
    val codigo : Int = 1234,
){
    //Template Method: determina si un regalo es valioso o no
    fun esValioso(): Boolean {
        return true         //Momentaneamente
    }
}