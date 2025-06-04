interface PreferenciaPorRegalos {
    fun aceptaRegalo(persona : Persona, regalo: Regalo): Boolean
}

class PersonaConformista : PreferenciaPorRegalos {
    override fun aceptaRegalo(persona: Persona, regalo: Regalo): Boolean {
        return true
    }
}

class PersonaInteresada : PreferenciaPorRegalos {
    override fun aceptaRegalo(persona: Persona, regalo: Regalo): Boolean {
        return true
    }
}
class PersonaExigente : PreferenciaPorRegalos {
    override fun aceptaRegalo(persona: Persona, regalo: Regalo): Boolean {
        return true
    }
}
class PersonaMarquera : PreferenciaPorRegalos {
    override fun aceptaRegalo(persona: Persona, regalo: Regalo): Boolean {
        return true
    }
}
class PreferenciaCombinada : PreferenciaPorRegalos {
    override fun aceptaRegalo(persona: Persona, regalo: Regalo): Boolean {
        return true
    }
}