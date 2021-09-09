open class ImplementacionOperacionesBasicas():OperacionesBasicas {
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
}