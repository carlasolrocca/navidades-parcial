// *** OBSERVER REGALO ENTREGADO ***
/*Los observers/interesados son todos polimorficos por implementar una interfaz comun.
  (o) Responden a un MISMO EVENTO --> Cuando se entrega el regalo
  (o) Tienen que tener un metodo que sea coherente para todos
  Hay varios Observers:
  1. NotificacionPersona: envia un mail a la persona notificando que su regalo fue entregado
  2. NotificacionFletes: recibe una notificacion con los siguientes datos
         2.1 recibe el regalo
         2.2 la direccion del cliente          (el 1 y 2 envian notificaciones DIFERENTES!!!!!!!!)
         2.3 nombre del cliente
         2.4 DNI
         2.5 codigo del regalo (c/u tiene el suyo)
  3. NotificacionRegaloCaro: si el regalo vale >$10000, se pide que le modifique el criterio de persona A INTERESADA
                             por un monto $5000. No es lo que hace el strategy de PersonaInteresada, nunca se explicito un tope.
*/

interface RegaloObserver {
    fun NotificacionRegalo(regalo : Regalo, persona: Persona)
}

class NotificacionPersona : RegaloObserver{
    override fun NotificacionRegalo(regalo: Regalo, persona: Persona) {
        //to do
    }
}

class NotificacionFlete : RegaloObserver {
    override fun NotificacionRegalo(regalo: Regalo, persona: Persona) {
        //to do
    }
}

class NotificacionRegaloCaro : RegaloObserver {
    override fun NotificacionRegalo(regalo: Regalo, persona: Persona) {
        //to do
    }
}


/*Los observers van a necesitar:
    un MailSender y una data class Mail que represente el formato del Mail para la Persona
    un InfoEnvioFlete y una data class DatosNotificacionFlete que envie los datos a la Empresa de Fletes
*/

interface MailSender {
    fun sendMail(mail: Mail)
}

interface InfoEnvioFlete {
    fun sendNotificacionFlete(notificacion : DatosNotificacionFlete)
}

data class Mail(val from : String, val to : String, val subject : String, val content : String)
data class DatosNotificacionFlete(val regalo : Regalo, val codigoRegalo : Int, val cliente : Persona, val DNI : Int, val direccion : String)
