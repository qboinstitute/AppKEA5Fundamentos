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
    //imprimirMensaje(validarNumero(19))
    //busquedaOrdenamiento()
    //imprimirMensaje(calcularNumero.toString())
    /*val objAlumno = Alumno("Karen")
    objAlumno.responsabilidad()
    val objProfesor = Profesor("Julio")
    objProfesor.responsabilidad()*/
    //claseAnidadaInterna()
    objetosDataClass()
}
fun objetosDataClass(){
    val objAuto1 = Auto("Toyota",
        "Sedan", 2019, "HSYE232432D")
    val objAuto2 = objAuto1.copy(marca = "Kia")
    //imprimirMensaje(objAuto2.toString())
    if(objAuto1 == objAuto2){
        imprimirMensaje("Si son iguales")
    }else{
        imprimirMensaje("No son iguales")
    }
}




fun claseAnidadaInterna(){
    val objFloresAnidada = Flores.claseAnidada()
    //imprimirMensaje(objFloresAnidada.saludoClaseAnidada("Luis"))
    val objFloresInterna = Flores().claseInterna()
    imprimirMensaje(objFloresInterna.saludoClaseInterna("Maicol"))
}

val calcularNumero = {num: Int -> num * 3}

fun busquedaOrdenamiento(){
    for(i in 1..4){
        for(j in 1..4){
            if(i == 2 && j == 2){
                imprimirMensaje("Ambas variables son IGUALES")
                break
            }else{
                imprimirMensaje("valor i= $i - j= $j")
            }
        }
    }
}

fun bucleWhile(){
    var contador = 10
    /*while (contador > 0){
        imprimirMensaje("Número $contador")
        contador--
    }*/
    do {
        imprimirMensaje("Número $contador")
        contador--
    }while (contador > 0)
}

fun bucleFor(){
    val edades = intArrayOf(24, 26,34,39,45)
    /*for(edad:Int in edades){
        imprimirMensaje(edad.toString())
    }
    for((indice, valor) in edades.withIndex()){
        imprimirMensaje("Edad $indice - $valor")
    }*/
    for(i in 5..15) imprimirMensaje("Número $i")
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




