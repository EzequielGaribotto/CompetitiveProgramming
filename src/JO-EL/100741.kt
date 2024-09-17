import java.util.*
fun main() {
    // Definir escaner e inicializar variable dia
    val scan = Scanner(System.`in`)
    var dia:Int = scan.nextInt()
    // Tres casos en funcion del input
    var resultat:String = when (dia) {
        366 -> "Correcte per un any bixest!"
        in 1..365 -> "Correcte per un any no bixest!"
        else -> "Incorrecte!"
    }
    println(resultat)
}