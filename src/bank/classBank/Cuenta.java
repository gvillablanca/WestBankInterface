package bank.classBank;

public class Cuenta {
    int numeroCuenta;
    String tipoCuenta;
    int saldo;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "NUMERO-CUENTA='" + numeroCuenta + '\'' +
                "TIPO-CUENTA='" + tipoCuenta + '\'' +
                ", SALDO='" + saldo + '\'' +
                '}';
    }    
}
