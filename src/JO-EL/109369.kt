import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    var mitadLetras:Float
    var palabraMasCorta:String
    repeat(repeticiones) {
        // Asignamos valores por cada iteracion
        var miPalabra:String = scan.next()
        var webPalabra:String = scan.next()
        var letrasBien = 0
        if (miPalabra.length >= webPalabra.length) {
            palabraMasCorta = webPalabra // Calculamos la palabra mas corta
            mitadLetras = miPalabra.length/2F // Y la mitad de letras, tomando como referencia la palabra que no es la mas corta
        } else {
            palabraMasCorta = miPalabra
            mitadLetras = webPalabra.length/2F
        }
        // Por cada letra en la palabra mas corta
        for (letra in 0 until palabraMasCorta.length) {
            if (miPalabra[letra] == webPalabra[letra]) { // Si las letras son iguales
                letrasBien++ // Sumamos a la variable de letras correctas
            }
        }
        // Imprimimos mensaje en funcion de si la mitad de letras o más son correctas
        if (letrasBien >= mitadLetras) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}