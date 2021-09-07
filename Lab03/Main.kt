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
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).Suma()
    }else if (ope == 2){
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).Resta()
    }else if (ope == 3) {
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).Multiplicación()
    }else if (ope == 4){
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).División()
    }else if (ope == 5){
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).Potencia()
    }else if (ope == 6) {
        ImplementacionOperacionesAvanzadas(pedirNumero(),pedirNumero()).Raíz()
    }else if (ope == 7){
        ImplementacionOperacionesAvanzadas(pedirNumero(),1).Factorial()
    }else if (ope == 8){
        ImplementacionOperacionesAvanzadas(pedirNumero(),1).Sumatoria()
    }
}

