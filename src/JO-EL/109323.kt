import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones:Int = scan.nextInt()
    repeat(repeticiones) {
        // Asignamos valores
        val miPalabra:String = scan.next()
        val webPalabra:String = scan.next()
        var letrasBien:Int = 0
        val mitadLetras:Float
        // Para cada caracter en miPalabra
        for (letra in 0 until miPalabra.length) {
            // Si webPalabra tiene letras suficientes y las letras por posicion son iguales
            if ((webPalabra.length > letra) && (miPalabra[letra] == webPalabra[letra])) {
                letrasBien++ // Sumamos una letra correcta
            }
        }
        // Definimos si la mitad de las letras son correctas
        if (webPalabra.length > miPalabra.length) {
            letrasBien += (miPalabra.length - webPalabra.length)
            mitadLetras = (webPalabra.length/2F) // Tomando como referencia la palabra mas larga
        } else {
            mitadLetras = (miPalabra.length/2F)
        }
        if (letrasBien >= mitadLetras) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}