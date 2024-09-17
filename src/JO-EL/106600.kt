import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que hara que el primer bucle se repita esa cantidad de veces
    var repeticiones:Int = scan.nextInt()
    // Inicializamos variables
    var monsterHealthPoints:Int // Vida del enemigos
    var rammusDamage:Int // Daño de Rammus
    var twitchPoison:Int // Daño de Twitch
    var roundCounter:Int // Contador de numero de rondas
    var killer:String // Identificador del asesino del enemigo
    // Iniciamos el bucle
    repeat(repeticiones) {
        killer = "" // No existe asesino por defecto
        roundCounter = 0 // Iniciamos el valor de rondas para cada rep
        // Preguntamos al usuario los valores de vida y daño de los elementos del juego
        monsterHealthPoints = scan.nextInt()
        rammusDamage = scan.nextInt()
        twitchPoison = scan.nextInt()
        // Iniciamos el bucle que parara cuando la vida del enemigo sea 0 o inferior
        while(monsterHealthPoints > 0) {
            ++roundCounter // Contamos rondas
            monsterHealthPoints -= rammusDamage // El primer golpe será de Rammus siempre
            // Determinamos si ha sido Rammus o Twitch el que ha asesinado al enemigo
            if (monsterHealthPoints <= 0) {
                killer = "RAMMUS"
            }
            monsterHealthPoints -= twitchPoison
            if (monsterHealthPoints <= 0 && killer != "RAMMUS") {
                killer = "TWITCH"
            }
        }
        // Imprimimos el asesino y la ronda por pantalla
        println("$killer $roundCounter")
    }
}