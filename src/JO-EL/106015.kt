import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos las felicidades de los dias
    var felicidadDia1:Int = scan.nextInt()
    var felicidadDia2:Int = scan.nextInt()
    var felicidadDia3:Int = scan.nextInt()
    // Si la felicidad del ultimo o penultimo dia restada por la del primer dia da numero negativo significa que la felicidad es descendiente
    if ((felicidadDia3 - felicidadDia1) < 0 || (felicidadDia2 - felicidadDia1) < 0){
        println("NO")
    // Si no es descendiente es ascendiente
    } else {
        println("SI")
    }
}