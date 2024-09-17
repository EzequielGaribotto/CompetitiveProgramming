import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    scan.nextLine()
    var muchoTexto:String
    var aCounter:Int
    var eCounter:Int
    var iCounter:Int
    var oCounter:Int
    var uCounter:Int
    repeat(repeticiones) {
        muchoTexto = scan.nextLine()
        aCounter = 0
        eCounter = 0
        iCounter = 0
        oCounter = 0
        uCounter = 0
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
        println("A: $aCounter E: $eCounter I: $iCounter O: $oCounter U: $uCounter")

    }
}