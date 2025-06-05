class Persona(
    val nombre : String,
    val DNI : Int = 12345678,
    val email : String = "persona@gmail.com",
    val direccion : String = "Calle Falsa 123",
    val preferenciaRegalos : PreferenciaPorRegalos,
){
    //Metodo que llama al metodo del Strategy de preferencia
    fun regaloAceptable(regalo : Regalo): Boolean {
        return preferenciaRegalos.aceptaRegalo(regalo)
    }
}