/*
* 1. el admin deberia buscar el primer regalo compatible con su preferencia en base al STOCK
            1a. hay un stock de regalos. es una lista?
  2. si ningun regalo es apto, se le genera COMO REGALO un voucher de $2000 (marca="Papapp")
            2a. deberia haber un metodo que mande voucher disparado cuando no consigue un regalo
  3. se debe registrar el regalo ENTREGADO a la persona. ¿Como? Eso dispara una serie de OBSERVERS
            3a. no me sirve un atributo "entregado" en Regalo porque ese EVENTO me dispara Observers
            Corresponde armar una lista de regalos entregados y un metodo que los registre. Ese metodo
            dentro del administrador tiene que disparar los observers.

            3abis. que mande mail a la persona. "tu regalo fue entregado!"
            3b. informa a empresa fletes "el reno loco": recibe el regalo, la direccion del cliente,
            nombre del cliente, DNI, codigo del regalo (c/u tiene el suyo)
            3c. si algun regalo supera los $10000, se pide que modifique el criterio de la persona interesada
            por un monto de $5000. NO TIENE SENTIDO!!!! NO ES LO QUE HACE ESE STRATEGY. No se si resolverlo...
*/

class Administrador {

}