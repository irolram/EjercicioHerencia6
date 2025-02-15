
fun main() {

    val articulo1 = Articulo("Leche premium", 25.0)
    val articulo2 = Articulo("Cacahuetes", 45.0)

    val ordenador1 = Ordenador("Mac", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Lenovo", 300.0)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    println(articulos)

}