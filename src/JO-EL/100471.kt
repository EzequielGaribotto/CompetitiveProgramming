import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos la variable n
    var n:Int = scan.nextInt()
    // Asignamos un valor a la variable dia en funcion del numero n, para despues imprimir
    var dia:String = when (n) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "mu mal"
    }
    print(dia)
}