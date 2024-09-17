import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        val generaciones = scan.nextInt()
        var cagadas = ""
        // A partir de la tercera generacion, cada 2 generaciones habrá una cagada más
        for (generacion in 3..generaciones step 2)
            cagadas+="caga"
        println("Caga "+cagadas+"tio!")
    }
}