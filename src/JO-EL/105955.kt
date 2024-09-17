import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticionesK que hara que el bucle se repita esa cantidad de veces
    var repeticionesK:Int = scan.nextInt()
    // Inicializamos las variables numero, suma y producto
    var numero:Int
    var suma:Int
    var producto:Int
    // Iniciamos el bucle que durara K veces
    repeat(repeticionesK) {
        // Preguntamos un numero al usuario
        numero = scan.nextInt()
        // Si el numero es natural
        if (numero >= 1) {
            suma = 0
            producto = 1
            // Se calcula la suma y el producto de todos los numeros naturales anteriores incluyendo el mismo
            for (i in 1..numero) {
                suma += +i
                producto = producto*i
            }
            println("SUMA: $suma PRODUCTE: $producto")
        // Si el numero no es natural
        } else {
            println("ELS NOMBRES NATURALS COMENCEN EN 1")
        }
    }
}