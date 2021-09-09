import kotlin.math.*

open class ImplementacionOperacionesAvanzadas():OperacionesAvanzadas,OperacionesBasicas {

    override fun Suma(num1:Int,num2:Int) {
        println("$num1 + $num2 = ${num1 + num2}")
    }
    override fun Resta(num1:Int,num2:Int) {
        println("$num1 - $num2 = ${num1 - num2}")
    }
    override fun Multiplicación(num1:Int,num2:Int) {
        println("$num1 * $num2 = ${num1 * num2}")
    }
    override fun División(num1:Int,num2:Int) {
        var resul = num1 / num2
        if (resul > 0){
            println("$num1 / $num2 = $resul")
        }else{
            println("La division no es posible")
        }
    }
    override fun Potencia(num1:Int,num2:Int) {
        println("$num1 ^ $num2 = ${num1.toDouble().pow(num2.toDouble())}")
    }
    override fun Raíz(num1:Int,num2:Int) {
        println("$num1 ^ 1/$num2 = ${num1.toDouble().pow(1/num2.toDouble())}")
    }
    override fun Factorial(num1:Int) {
        var i = 1
        var factorial: Long = 1
        while (i <= num1) {
            factorial *= i.toLong()
            i++
        }
        println("Factorial de $num1 = $factorial")
    }
    override fun Sumatoria(num1:Int) {
        var sumatoria = 0
        for (i in 0..num1){
            sumatoria = sumatoria + i
        }
        println("La sumatoria de $num1 es $sumatoria")
    }
}

