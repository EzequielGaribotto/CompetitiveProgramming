import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()

    repeat(repeticiones) {
        var generaciones = scan.nextInt()
        print("Caga ")
        for (generacion in 3..generaciones step 2) {
            print("caga")
        }
        println("tio!")
    }
}