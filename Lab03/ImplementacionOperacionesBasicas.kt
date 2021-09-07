class ImplementacionOperacionesBasicas(var num1:Int,var num2:Int):OperacionesBasicas {
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
}