import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var pisMesPetit = scan.nextInt()
    var pisMesGran = scan.nextInt()
    var pisInicial = scan.nextInt()

    var canvisDePisCounter = 0
    var desplacamentsCounter = 0
    scan.nextLine()
    var input = scan.next()
    var error = false
    var pisAnar = 0

    while (input != "X") {
        pisAnar = input.toInt()
        if (pisAnar !in pisMesPetit..pisMesGran) {
            error = true
        } else {
            desplacamentsCounter += if (pisAnar > pisInicial) {
                pisAnar - pisInicial
            } else {
                pisInicial - pisAnar
            }
            if (pisAnar - pisInicial != 0)  {
                canvisDePisCounter++
            }
            pisInicial = pisAnar
        }
        scan.nextLine()
        input = scan.next()
    }
    println("$canvisDePisCounter $desplacamentsCounter $pisInicial" + if (error) " E" else "")
}