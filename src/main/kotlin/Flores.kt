class Flores {

    val autor = "Luis Angel"

    class claseAnidada {
        fun saludoClaseAnidada(nombre: String): String{
            return "Hola $nombre, soy una clase anidada"
        }
    }

    inner class claseInterna {
        fun saludoClaseInterna(nombre: String): String{
            return "Hola $nombre, son una clase interna, creado por $autor"
        }
    }


}