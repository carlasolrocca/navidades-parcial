// Interface comun que define el metodo aceptaRegalo para
// las demás implementaciones concretas
interface PreferenciaPorRegalos {
    fun aceptaRegalo(regalo: Regalo): Boolean
}

//Cualquier regalo le viene bien
class PersonaConformista : PreferenciaPorRegalos {
    override fun aceptaRegalo(regalo: Regalo): Boolean {return true}
}

//Quieren que el regalo cueste más de una cierta cantidad de $$$
//Nunca se habia mencionado un MONTO TOPE!!!!!
class PersonaInteresada(val montoTope : Double) : PreferenciaPorRegalos {
    override fun aceptaRegalo(regalo: Regalo): Boolean {
        val precioBase = 5000.0
        return regalo.valor >= precioBase && regalo.valor <= montoTope  //Modificado en base a Punto 3 de la consigna: define una base dentro y luego un tope por constructor.
    }
}

//Quiere que el regalo sea valioso. La logica de eso está en Regalo.kt
class PersonaExigente : PreferenciaPorRegalos {
    override fun aceptaRegalo(regalo: Regalo): Boolean {
        return regalo.esValioso()
    }
}

//Quiere que el regalo sea de una marca específica
class PersonaMarquera(val marcaPreferida : String) : PreferenciaPorRegalos {
    override fun aceptaRegalo(regalo: Regalo): Boolean {
        return regalo.marca == marcaPreferida
    }
}

//Preferencia combinada, acepta un regalo si al menos una (.any) de las preferencias lo acepta
class PreferenciaCombinada(var preferencias : MutableSet<PreferenciaPorRegalos> = mutableSetOf()) : PreferenciaPorRegalos {
    override fun aceptaRegalo(regalo: Regalo): Boolean {
        return preferencias.any { it.aceptaRegalo(regalo) }
    }
}

//en el combinado deberia tener las preferencias adentro como atributo + un metodo de agregar criterios
//si lo paso x constructor la persona deberia conocer todos los criterios. si agrego el metodo de agregar deberia ser una Lista!!