class Persona(
    val nombre : String,
    val DNI : Int = 12345678,
    val email : String = "persona@gmail.com",
    val direccion : String = "Calle Falsa 123",
){
    //Lo vuelvo atributo porque en constructor no me suma
    //Tengo que hacer .applys{} para testear asi que da igual
    var preferenciaRegalos : PreferenciaPorRegalos = PersonaConformista()

    //Metodo que llama al metodo del Strategy de preferencia
    fun regaloAceptable(regalo : Regalo): Boolean {
        return preferenciaRegalos.aceptaRegalo(regalo)
    }
}