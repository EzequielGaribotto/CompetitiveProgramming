import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos la variable diaN
    var diaN:Int = scan.nextInt()
    // Asignamos un valor a la variable dia en funcion del numero N, para despues imprimir
    var dia:String = when (diaN) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "-1"
    }
    print(dia)
}