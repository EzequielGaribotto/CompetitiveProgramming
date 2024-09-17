import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable nota al usuario
    var nota:Int = scan.nextInt()
    // Inicializamos las variables que almacenaran cantidades que serán impresas
    var notaValida:Int = 0
    var mediana:Float
    var sumaNotas:Int = 0
    var excelente:Int = 0
    var notable:Int = 0
    var bien:Int = 0
    var suficiente:Int = 0
    var insuficiente:Int = 0
    var deficiente:Int = 0
    
    // Iniciamos el bucle, que no parara hasta que el usuario ponga "-1"
    while (nota != -1) {
        // Si la  nota es válida sumamos para luego hacer la media
        if (nota in 0..10) {
            ++notaValida
            sumaNotas += nota
            // Dependiendo de la nota se sumara una unidad a una variable u otra
            when (nota) {
                in 9..10 -> ++excelente
                in 7..8 -> ++notable
                6 -> ++bien
                5 -> ++suficiente
                4 -> ++insuficiente
                in 0..3 -> ++deficiente
            }
        }
        // Preguntamos la siguiente nota
        nota = scan.nextInt()
    }
    // Si existe por lo menos una nota valida, calculamos la mediana e imprimimos el mensaje
    if (notaValida > 0){
        mediana = sumaNotas.toFloat() / notaValida
        print("NOTES: $notaValida MITJANA: $mediana E: $excelente N: $notable B: $bien S: $suficiente I: $insuficiente MD: $deficiente")
    }

}