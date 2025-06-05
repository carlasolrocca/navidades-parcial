/*
* 1. el admin deberia buscar el PRIMER regalo compatible con su preferencia en base al STOCK
            1a. hay un stock de regalos. es una lista? Si
  2. si ningun regalo es apto, se le genera COMO REGALO un voucher de $2000 (marca="Papapp")
            2a. deberia haber un metodo que mande voucher disparado cuando no consigue un regalo


  3. se debe registrar el regalo ENTREGADO a la persona (ASOCIACION). ¿Como? Eso dispara una serie de OBSERVERS
            3a. no me sirve un atributo "entregado" en Regalo porque ese EVENTO me dispara Observers
            Corresponde armar una lista de regalos entregados y un metodo que los registre. Ese metodo
            dentro del administrador tiene que disparar los observers.

            3abis. que mande mail a la persona. "tu regalo fue entregado!" --> Mail Sender
            3b. informa a empresa fletes "el reno loco": recibe el regalo, la direccion del cliente,
            nombre del cliente, DNI, codigo del regalo (c/u tiene el suyo)
            3c. si algun regalo supera los $10000, se pide que modifique el criterio de la persona interesada
            por un monto de $5000. NO TIENE SENTIDO!!!! NO ES LO QUE HACE ESE STRATEGY. No se si resolverlo...
*/
class Administrador {
    val regalosEnStock: MutableList<Regalo> = mutableListOf()
    val regalosEntregados: MutableMap<Regalo, Persona> = mutableMapOf()
    val regalosObservers: MutableList<RegaloObserver> = mutableListOf()
    //Busca el Primer regalo compatible y lo devuelve
    fun primerRegaloCompatible(persona : Persona) :Regalo? = regalosEnStock.find{ persona.regaloAceptable(it) }

    //Busca si existe ese regalo: si existe, lo devuelve para entregarRegalo(); si no, crea un voucher
    fun buscarRegalo(persona : Persona) : Regalo = primerRegaloCompatible(persona) ?: Voucher()

    //Aca se se manda el OBSERVER
    fun entregarRegalo(persona : Persona){
        if(buscarRegalo(persona) != null){
            val regalo = buscarRegalo(persona)
            regalosEntregados.put(regalo, persona)
            //Disparo el observer de envio de mail
            regalosObservers.forEach { it.execute()}
        }
    }

}