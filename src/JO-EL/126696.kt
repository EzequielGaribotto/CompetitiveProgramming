import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // El bucle se repetirá tantas veces como indique el usuario
    repeat(repeticiones) {
        
        // Escaneamos la variable que definira la cantdad de alumnos
        val cantidadAlumnos = scan.nextInt()
        
        // Definimos el array donde almacenaremos las alturas de los alumnos
        val alturaAlumnosArray = arrayOfNulls<Int>(cantidadAlumnos)
        
        // Asignamos una altura a cada alumno
        for (alumno in 0 until cantidadAlumnos) {
            alturaAlumnosArray[alumno] = scan.nextInt()
        }
        
        // Ordenamos la lista de alturas de alumnos de manera ascendente
        alturaAlumnosArray.sort()
        
        // Dada la lista ascendente, la altura mas baja estará en el índice 0,
        val alturaMasBaja = alturaAlumnosArray[0]
        
        // Y la altura más alta estará en el último índice
        val alturaMasAlta = alturaAlumnosArray[cantidadAlumnos-1]
        
        // Calculamos la diferencia del mejor shippeo
        val diferenciaMejorShippeo = alturaMasAlta!! - alturaMasBaja!!
        
        // Y la imprimimos por pantalla
        println(diferenciaMejorShippeo)
    }
}