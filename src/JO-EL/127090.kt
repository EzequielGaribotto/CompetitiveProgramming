import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del Int
    scan.nextLine()
    repeat(repeticiones) {
        // Escaneamos un string y lo pasamos a letras minusculas
        val string = scan.nextLine().lowercase()
        
        // Imprimimos mensaje en funcion de si el string es patata o no
        if (string == "patata") println("Es Patata")
        else println("No es Patata")
    }
}