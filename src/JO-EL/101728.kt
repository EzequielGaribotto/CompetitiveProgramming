import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)
    // El input tendra que ser float o double para darle precision al resultado
    var entrada:Double = scan.nextDouble()
    // La dimension inversa de un numero se calcula bajandole el exponente
    print(1/entrada)
}