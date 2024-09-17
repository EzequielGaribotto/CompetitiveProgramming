import java.util.*

fun main() {
    // Definimos el scanner e inicializamos la variable diaAnio
    val scan = Scanner(System.`in`)
    var diaAnio = scan.nextInt()
    val ENERO:Int = 31
    val FEBRERO:Int = ENERO+28
    val MARZO:Int = FEBRERO+31
    val ABRIL:Int = MARZO+30
    val MAYO:Int = ABRIL+31
    val JUNIO:Int = MAYO+30
    val JULIO:Int = JUNIO+31
    val AGOSTO:Int = JULIO+30
    val SEPTIEMBRE:Int = AGOSTO+30
    val OCTUBRE:Int = SEPTIEMBRE+31
    val NOVIEMBRE:Int = OCTUBRE+31
    val DICIEMBRE:Int = NOVIEMBRE+31
    //En funcion del input del usuario imprimiremos un mes o -1 si no esta entre 1 y 365
    var mes = when (diaAnio) {
        in 1..ENERO -> 1
        in ENERO+1..FEBRERO -> 2
        in FEBRERO+1..MARZO -> 3
        in MARZO+1..ABRIL -> 4
        in ABRIL+1..MAYO -> 5
        in MAYO+1..JUNIO -> 6
        in JUNIO+1..JULIO -> 7 
        in JULIO+1..AGOSTO -> 8
        in AGOSTO+1..SEPTIEMBRE -> 9
        in SEPTIEMBRE+1..OCTUBRE -> 10
        in OCTUBRE+1..NOVIEMBRE -> 11
        in NOVIEMBRE+1..DICIEMBRE -> 12
        else -> -1 // No esta entre 1-365
    }
    println(mes)
}