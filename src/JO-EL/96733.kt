import java.util.*
fun main() {
    //Definir el escaner
    val scan = Scanner(System.`in`)
    //Escanear numero de caramelos
    var caramelos:Int = scan.nextInt()
    //Escanear numero de niños
    var ninios:Int = scan.nextInt()
    //Mostrar los caramelos que me como por pantalla
    if (caramelos < ninios) {
        println(caramelos)
    }else{ 
        println(caramelos%ninios)
    }
}