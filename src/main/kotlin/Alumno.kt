class Alumno(nombre: String) : Persona(nombre) {

    override fun responsabilidad() {
        println("Esta persona está estudiando")
    }
}