import kotlin.math.*

class ImplementacionOperacionesAvanzadas(var num1:Int,var num2:Int):OperacionesAvanzadas,OperacionesBasicas {

    override fun Suma() {
        println("$num1 + $num2 = ${num1 + num2}")
    }
    override fun Resta() {
        println("$num1 - $num2 = ${num1 - num2}")
    }
    override fun Multiplicación() {
        println("$num1 * $num2 = ${num1 * num2}")
    }
    override fun División() {
        var resul = num1 / num2
        if (resul > 0){
            println("$num1 / $num2 = $resul")
        }else{
            println("La division no es posible")
        }
    }
    override fun Potencia() {
        println("$num1 ^ $num2 = ${num1.toDouble().pow(num2.toDouble())}")
    }
    override fun Raíz() {
        println("$num1 ^ 1/$num2 = ${num1.toDouble().pow(1/num2.toDouble())}")
    }
    override fun Factorial() {
        var i = 1
        var factorial: Long = 1
        while (i <= num1) {
            factorial *= i.toLong()
            i++
        }
        println("Factorial de $num1 = $factorial")
    }
    override fun Sumatoria() {
        var sumatoria = 0
        for (i in 0..num1){
            sumatoria = sumatoria + i
        }
        println("La sumatoria de $num1 es $sumatoria")
    }
}

