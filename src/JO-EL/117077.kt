import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    // Leemos el string
    var muchoTexto:String = scan.next()
    // Inicializamos las variables booleanas de las vocales que inicialmente serán false
    var vocalA:Boolean = false
    var vocalE:Boolean = false
    var vocalI:Boolean = false
    var vocalO:Boolean = false
    var vocalU:Boolean = false
    // Por cada caracter en muchoTexto
    for (caracter in 0 until muchoTexto.length) {
        // Si el caracter es una vocal minúscula
        when (muchoTexto[caracter]) {
            'a' -> vocalA = true // La variable booleana de la vocal se vuelve true
            'e' -> vocalE = true
            'i' -> vocalI = true
            'o' -> vocalO = true
            'u' -> vocalU = true
        }
    }
    // Mostramos si al final del bucle for todas las vocales == true, 
    if (vocalA && vocalE && vocalI && vocalO && vocalU) {
        println("TOTES") 
    } else {
        println("FALTEN")
    }
}