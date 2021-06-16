class Profesor(nombre: String) : IProfesor, Persona(nombre) {

    override fun responsabilidad() {
        print("Esta persona está enseñando")
    }

    override fun dictaClase() {

    }

    override fun registrarAsistencia(nomAlumno: String, asistencia: Boolean) {

    }

    override fun registrarNota(nomAlumno: String, nota: Int) {

    }

}