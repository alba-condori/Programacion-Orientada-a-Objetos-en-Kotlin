class CuentaBancaria (val titular: String, var saldo: Double){
    var monto: Double = 0.0

    fun depositar (monto: Double): Double {
        saldo += monto.toDouble()
        return saldo
    }
    fun retirar (monto: Double): Boolean {
        
    }

}