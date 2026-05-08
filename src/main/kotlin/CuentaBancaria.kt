class CuentaBancaria (val titular: String, var saldo: Double){

    fun depositar (monto: Double): Double {
        if (monto > 0) {
            saldo += monto.toDouble()
        }
        return saldo
    }
    fun retirar (monto: Double): Boolean {
        if (monto <= saldo) {
            saldo -= monto
            return true
        } else {
            return false
        }
    }

}