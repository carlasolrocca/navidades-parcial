import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec

class PersonaSpec : DescribeSpec({
    describe("Dada una persona con preferencias de regalos..."){
        var persona = Persona()
        var regalo = Regalo("Regalo Test", "Pendorchito", 8000.0)
        it("Persona conformista acepta lo que sea") {
            persona.apply{
                preferenciaRegalos = PersonaConformista()
            }

            persona.regaloAceptable(regalo) shouldBe true
        }
        it(""){}
        it(""){}
        it(""){}
        it(""){}
        it(""){}
    }
})