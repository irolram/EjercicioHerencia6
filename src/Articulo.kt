open class Articulo(val nombre: String, val precio: Double) {

    var id = generarId()

    companion object{
        var totalArticulos = 1

    }
    fun generarId(): Int{
        return totalArticulos ++
    }

    open fun promocionNavidad(): Double? {

        val rebaja: Double = 0.0
        val calculoRebaja = precio * (rebaja / 100)
        val totalRebaja = precio - calculoRebaja

        return totalRebaja
    }

    override fun toString(): String {
        return "{$nombre} - {${String.format("%.2f", precio)}}€ (ID: {$id})"
    }
}