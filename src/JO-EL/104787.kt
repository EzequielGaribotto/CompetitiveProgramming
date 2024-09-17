import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos la variable contador que será la cantidad de numeros a escanear
    val contador:Int = scan.nextInt()
    // Inicializamos la variable numero del que se buscaran los divisores
    var numero:Int
    // Iniciamos el bucle que se repetira tantas veces como decida el usuario
    repeat(contador){
        numero = scan.nextInt()
        // Si el modulo de numero para n (divisor) es igual a 0, significa que es divisible por n
        for (n in 1..numero){
            if (numero%n == 0){
                print("$n ")
            }
        }
    }
}