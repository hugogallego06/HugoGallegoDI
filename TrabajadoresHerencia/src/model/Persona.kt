package src.model

abstract class Persona (var nombre: String, var apellido: String, var dni: String){


    var telefono: Int? = null;
    var correoE: String? = null;


    constructor(nombre: String,apellido: String,dni: String,telefono: Int, correoE: String):
            this(nombre, apellido, dni){
                this.telefono = telefono
                this.correoE = correoE
    }
    open fun mostrarDatos(){
        println("El nombre es $nombre")
        println("El apelliod es $apellido")
        println("El dni es $dni")
        println("El telefono es ${telefono?:"No se ha especificado "}")
        println("El correo electronico es ${correoE?: "No se he especificado"}")
    }
}