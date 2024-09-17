import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    var mitadLetras:Float 
    var palabraMasCorta:String
    repeat(repeticiones) {
        var miPalabra:String = scan.next()
        var webPalabra:String = scan.next()
        var letrasBien = 0
        if (miPalabra.length >= webPalabra.length) {
            palabraMasCorta = webPalabra
            mitadLetras = miPalabra.length/2F
        } else {
            palabraMasCorta = miPalabra
            mitadLetras = webPalabra.length/2F
        }
        for (caracter in 0 until palabraMasCorta.length) {
            if (miPalabra[caracter] == webPalabra[caracter]) {
                letrasBien++
            }
        }
        if (letrasBien >= mitadLetras) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}