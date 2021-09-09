fun main(args: Array<String>) {

    fun pedirNumero():Int {
        print("Ingresa un numero: ")
        var num = readLine().toString().toInt()
        return num
    }

    println("Bienvenida \n" +
            "---------------------------------\n" +
            " Eliga \n" +
            " 1-> Suma\n" +
            " 2-> Resta \n" +
            " 3-> Multiplicacion\n" +
            " 4-> Division\n" +
            " 5-> Potencia\n" +
            " 6-> Raíz \n" +
            " 7-> Factorial\n" +
            " 8-> Sumatoria\n" +
            "---------------------------------\n")
    var ope = pedirNumero()
    print("---------------------------------\n")

    if (ope == 1){
        ImplementacionOperacionesAvanzadas().Suma(pedirNumero(),pedirNumero())
    }else if (ope == 2){
        ImplementacionOperacionesAvanzadas().Resta(pedirNumero(),pedirNumero())
    }else if (ope == 3) {
        ImplementacionOperacionesAvanzadas().Multiplicación(pedirNumero(),pedirNumero())
    }else if (ope == 4){
        ImplementacionOperacionesAvanzadas().División(pedirNumero(),pedirNumero())
    }else if (ope == 5){
        ImplementacionOperacionesAvanzadas().Potencia(pedirNumero(),pedirNumero())
    }else if (ope == 6) {
        ImplementacionOperacionesAvanzadas().Raíz(pedirNumero(),pedirNumero())
    }else if (ope == 7){
        ImplementacionOperacionesAvanzadas().Factorial(pedirNumero())
    }else if (ope == 8){
        ImplementacionOperacionesAvanzadas().Sumatoria(pedirNumero())
    }
}

