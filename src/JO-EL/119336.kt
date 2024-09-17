import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine() // Consumimos la siguiente linea ya que acabamos de escanear un Int
    repeat(repeticiones) {
        val palabras = scan.nextLine().lowercase() // Escaneamos la linea de palabras en minusculas
        val capacidad = scan.nextInt() // Escaneamos la capacidad de la telaraña
        scan.nextLine() // Consumimos la siguiente linea ya que acabamos de escanear un Int
        var lalafelsCounter = 0 // Re/Iniciamos los contadores
        var telaranasCounter = 0
        var telaranasLlenas = 0
        for (palabra in palabras.split(", ")) // Contamos palabras
            when (palabra) {
                "lalafel"  ->   lalafelsCounter++
                "telaranya"->   telaranasCounter++
                "aranya"   -> { lalafelsCounter = 0
                                telaranasCounter = 0 }
            } // Si hay una araña se rompen las telarañas y huyen los lalafels habidos hasta el momento
        // Buscamos telarañas para los lalafels, si no hay telarañas o su capacidad es 0, no habrán.
        if (telaranasCounter <= 0 || capacidad <= 0) { telaranasLlenas = 0 } else {
            var telarana = 1
            for (lalafels in capacidad..lalafelsCounter step capacidad) {
                if (lalafels == capacidad*telarana) {
                    telaranasLlenas++
                    if (telarana < telaranasCounter) {
                        telarana++ // Telarana aumentara durante el for solo si hay una siguiente telaraña utilizable
                    }
                }
            }
        }
        println("Hay $telaranasLlenas telaranyas llenas.")
    }
}