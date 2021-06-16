interface IProfesor {
    fun dictaClase()
    fun registrarAsistencia(nomAlumno: String, asistencia: Boolean)
    fun registrarNota(nomAlumno:String, nota: Int)
}