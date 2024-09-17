import java.util.Scanner
fun main() {
    // Definimos la variable escaner
    val scan = Scanner(System.`in`)
    // Inicializamos las dos variables que identificaran las posciones x e y del enemigo
    var enemyX:Int = scan.nextInt()
    var enemyY:Int = scan.nextInt()
    // Calculamos e imprimimos el cuadrante en el que se encuentra el enemigo
    // Casos en los que no hay ningun input = 0
    if (enemyX != 0 && enemyY != 0){
        if (enemyX > 0 && enemyY > 0){
            println("1")
        } else if (enemyX < 0 && enemyY < 0){
            println("3")
        } else if (enemyX > 0 && enemyY < 0){
            println("4")
        } else if (enemyX < 0 && enemyY > 0){
            println("2")
        }
    // Casos en los que hay un input = 0
    } else if (enemyX == 0 && enemyY > 0){
        println("1,2")
    } else if (enemyX > 0 && enemyY == 0){
        println("1,4")
    } else if (enemyX == 0 && enemyY < 0){
        println("3,4")
    } else if (enemyX < 0 && enemyY == 0){
        println("2,3")
    // Caso en el que los dos inputs = 0
    } else {
        println("1,2,3,4")
    }
}