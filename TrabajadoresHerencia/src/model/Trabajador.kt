package src.model

class Trabajador (nombre: String, apellido: String, dni : String, var salarios: Int, var nPagas: Int)
    : Persona(nombre,apellido,dni) {

        var seguro : Boolean = false

    constructor(nombre: String,apellido: String,dni: String,salarios: Int,nPagas: Int, seguro: Boolean,telefono: Int, correo: String)
            :this(nombre, apellido, dni, salarios, nPagas){
                this.seguro = seguro
                this.telefono = telefono
                this.nPagas = nPagas
            }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("Salario: $salarios")
        println("Numero pagas: $nPagas")
        println("Seguro: $seguro")
    }
    }