import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Definimos la variable nombre que sera lo que introducira el usuario
    var nombre:String = scan.next()
    // La respuesta indicara si el nombre es válido o no
    var resposta:String = ""
    // Por cada caracter hasta el final del nombre
    for (caracter in 1 until nombre.length) {
        // Si la respuesta no es SI todavía
        if (resposta != "SI") {
            // Se compara con el anterior
            if (nombre[caracter] == nombre[caracter-1]) {
                resposta = "NO" //Si es igual, la respuesta será NO
            } else {
                resposta = "SI" //Si es diferente, la respuesta será SI
            }
        }
    }
    // En el caso de una sola letra no se puede comparar con otro caracter pero la respuesta será NO
    if (nombre.length == 1) {
        resposta = "NO"
    }
    print(resposta)
}