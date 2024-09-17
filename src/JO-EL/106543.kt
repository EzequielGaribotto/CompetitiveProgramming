import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable personas que hara que el primer bucle se repita esa cantidad de veces
    var personas:Int = scan.nextInt()
    // Inicializamos las variables energias, energia y energiaCategoria
    var energias:Int = 5 // Valentina necesita 5 mediciones de energia de cada persona
    var energia:Int // Instancia de energia de una persona
    var energiaCategoria:String = "" // Categoria (M, B o H) de una persona
    // El primer input "repeticiones" definira las veces que se repite el primer bucle
    repeat(personas) {
        // El input del usuario sera las veces que se repetira el bucle
        repeat(energias) {
            // Preguntamos por una instancia de energia
            energia = scan.nextInt()
            // Si existe una energia igual o superior a 10000, la energia es de categoria M
            if (energia >= 10000) {
                energiaCategoria = "M"
                // Si solo existe una energia mayor a 1000, la energia es de categoria B
            } else if (energia >= 1000 && energiaCategoria != "M") {
                energiaCategoria = "B"
                // Si no existe una energia mayor a 1000, la energia es de categoria H
            } else if (energiaCategoria != "M" && energiaCategoria != "B") {
                energiaCategoria = "H"
            }
        }
        // Mostramos la categoria de energia por pantalla
        println(energiaCategoria)
        // Reiniciamos la categoria de energia para la siguiente repeticion
        energiaCategoria = ""
    }
}