fun main(args: Array<String>) {
    //Variable var
    var pais = "Perú"
    pais = "Colombia"
    //Constante val
    val nombre = "Luis"
    var edad : Int = 25
    var numeroDouble = 5.6
    val anioNacimiento = 1990
    val anioActual = 2021
    val esVerdadero = true
    var nuevoAnio = "1989"
    var anioConvertido = nuevoAnio.toDouble()
    //println("$nombre tiene ${anioActual-nuevoAnio.toInt()} años")
    //Gestión de valores Null - Operador Elvis
    var curso: String?
    curso = null
    //var longitud: Int? = curso?.length
    var longitud: Int = curso?.length ?: 0
    //println(longitud)
    val paises = ArrayList<String>()
    paises.add("Nicaragua")
    paises.add("Colombia")
    paises.add("Mexico")
    paises.add("Perú")
    //obtenerLongitudApellido("Salvatierra", "Salvatierra")
    //validarLongitudNombre("Priscila")
    imprimirMensaje(validarNumero(19))
}
fun validarLongitudNombre(nombre: String){
    when(nombre.length){
        0 -> print("Nombe vacio")
        in 1..4 -> print("Nombre pequeño")
        in 5..7 -> print("Nombre mediano")
        else -> print("Nombre extenso")
    }
}
fun validarNumero(numero: Int): String {
    return when (numero % 2) {
        0 -> "Número par"
        else -> "Número impar"
    }
}
fun imprimirMensaje(mensaje: String) {
    println(mensaje)
}




fun obtenerLongitudApellido(apellido1: String,
                            apellido2:String){
    var apellidoLargo = if(apellido1.length > apellido2.length){
        apellido1
    }else if(apellido2.length > apellido1.length){
        apellido2
    }else{
        "Ambos apellidos tienen la misma longitud"
    }
    print(apellidoLargo)
}




