class Ordenador(nombre: String, precio:Double, val tipo: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {


    override fun promocionNavidad(): Double? {
        if (precio > 500){
            promocionNavidad()
        }else{
            println("No llega al coste necesario para el descuento")
        }
        return null
    }


}


