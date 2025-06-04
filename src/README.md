# Algo Que Pedir – TP Regalos

## Punto 1: Qué te haría feliz

Cada persona define qué tipos de regalo le gustan:

- **Conformistas**: cualquier regalo les cae bien.
- **Interesadas**: quieren que el regalo cueste más de una cierta cantidad de plata.
- **Exigentes**: quieren que el regalo sea valioso (ver la definición en el punto 2).
- **Marqueras**: quieren que el regalo sea de una marca determinada (configurable, ej: `"Nike Feraldy"` o `"Kodak"`).
- **Combinetas**: combinan un conjunto de los anteriores criterios. Les cae bien un regalo si **alguno** de los criterios lo acepta.

> ⚠️ *Revisar el párrafo “Qué se pide” ya que no es obligatorio implementar todos los criterios.*

---

## Punto 2: Regalos

Además de la información mencionada, los regalos **valiosos** son aquellos cuyo precio es mayor a $5.000 **y además**:

- **Ropa**: si es de la marca `"Jordache"`, `"Lee"`, `"Charro"` o `"Motor Oil"`.
- **Juguetes**: si su fecha de lanzamiento es anterior al año 2000.
- **Perfumes**: si su origen es extranjero.
- **Experiencias**: si están programadas para un **día viernes** (por ejemplo: un desayuno de Pani para el `08/07/2022`, donde la marca sería `"Pani"`).

> 💡 Se busca que la condición de “valor” pueda ser **configurable** sin modificar muchos lugares.  
> *(Ej: agregar que además la marca tenga más de 5 letras)*

---

## Punto 3: El proceso

Para cada persona:

1. Se debe buscar el **primer regalo adecuado** de la lista de stock.  
   Cada persona define sus preferencias, así que esto es una búsqueda sencilla.

2. Si **ningún regalo es adecuado**, se debe generar un **voucher de $2.000** de la app **Papapp**.
    - En este caso, la marca es `"Papapp"`.
    - Este regalo **no se considera valioso**.

3. Se debe **registrar el regalo entregado** a la persona. Esto debe ser **configurable**. Actualmente se pide:

    - Enviar un **mail** a la persona.
    - Informar a la empresa de fletes **"El reno loco"**, con:
        - Dirección del cliente
        - Nombre de la persona
        - DNI
        - Código del regalo

4. Si el regalo **supera los $10.000**, se debe:
    - Modificar el criterio de la persona a **interesada** con un monto de $5.000.
    - Esto representa un mensaje de “no todo se puede en la vida”.

> ⚙️ *Nuevas acciones pueden agregarse en el futuro, por lo que deben poder agregarse o quitarse fácilmente.*

---

## Qué se pide

- Resolver los **3 puntos**, marcando explícitamente los métodos donde comienza cada uno.
- Para el **punto 1**, implementar los criterios:
    - `marquera`
    - `combineta`
    - **y uno** de los 3 restantes (conformista, interesada o exigente).
- Realizar un **diagrama de clases** de la solución general.
- Explicar brevemente:
    - Qué ideas de diseño surgieron
    - Qué alternativas se consideraron
    - Por qué se eligió la solución final

---
