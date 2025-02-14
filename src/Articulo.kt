class Articulo(val nombre: String, val precio: Double) {

    var id = generarId()

    companion object{
        var totalArticulos = 0

    }
    fun generarId(): Int{
        return totalArticulos ++
    }

    fun promocionNavidad(){

    }
}