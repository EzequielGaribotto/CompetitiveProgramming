import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    var mitadLetras:Float
    repeat(repeticiones) {
        var miPalabra:String = scan.next()
        var webPalabra:String = scan.next()
        if (miPalabra.length > webPalabra.length) {
            mitadLetras = (miPalabra.length/2F)
        } else {
            mitadLetras = (webPalabra.length/2F)
        }
        var letrasBien:Int = 0
        var graciasWebCasteller:Boolean = false
        for (caracter in 0 until miPalabra.length) {
            if (webPalabra.length >= caracter+1) {
                if (miPalabra[caracter] == webPalabra[caracter]) {
                    letrasBien++
                }
            }
        }
        if (webPalabra.length > miPalabra.length) {
            letrasBien = letrasBien + (miPalabra.length - webPalabra.length)
        } //else {
        //    letrasBien = letrasBien + (webPalabra.length - miPalabra.length)
        //}
        if (letrasBien >= mitadLetras){
            graciasWebCasteller = true
        }
        if (graciasWebCasteller == true) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }

}