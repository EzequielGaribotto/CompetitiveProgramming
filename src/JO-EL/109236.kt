import java.util.*

fun main() {
    // Definimos el escaner, las repeticiones y el string de texto
    val scan = Scanner(System.`in`)
    val repeticiones:Int = scan.nextInt()
    scan.nextLine()
    var muchoTexto:String
    // Inicializamos las variables que contaran las vocales del texto
    var aCounter:Int
    var eCounter:Int
    var iCounter:Int
    var oCounter:Int
    var uCounter:Int
    repeat(repeticiones) {
        // Escaneamos el string 
        muchoTexto = scan.nextLine()
        aCounter = 0 // Asignamos valor 0 para cada repeticion
        eCounter = 0
        iCounter = 0
        oCounter = 0
        uCounter = 0
        // Por cada carcater en muchoTexto, miramos si contiene vocales en  minuscula o mayuscula
        for (caracter in 0 until muchoTexto.length) {
            if (muchoTexto[caracter] == 'a' || muchoTexto[caracter] == 'A')
                aCounter++
            if (muchoTexto[caracter] == 'e' || muchoTexto[caracter] == 'E')
                eCounter++
            if (muchoTexto[caracter] == 'i' || muchoTexto[caracter] == 'I')
                iCounter++
            if (muchoTexto[caracter] == 'o' || muchoTexto[caracter] == 'O')
                oCounter++
            if (muchoTexto[caracter] == 'u' || muchoTexto[caracter] == 'U')
                uCounter++
        }
        // Imprimimos las letras por pantalla
        println("A: $aCounter E: $eCounter I: $iCounter O: $oCounter U: $uCounter")

    }
}