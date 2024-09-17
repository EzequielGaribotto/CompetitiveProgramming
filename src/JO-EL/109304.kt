import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    repeat(repeticiones) {
        var miPalabra:String = scan.next()
        var webPalabra:String = scan.next()
        var letrasBien:Int = 0
        var mitadLetras:Float
        for (caracter in 0 until miPalabra.length) {
            if ((webPalabra.length >= caracter+1) && (miPalabra[caracter] == webPalabra[caracter])) {
                letrasBien++
            }
        }
        if (webPalabra.length > miPalabra.length) {
            mitadLetras = (webPalabra.length/2F)
            letrasBien += (miPalabra.length - webPalabra.length)
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