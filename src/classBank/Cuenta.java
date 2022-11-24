package classBank;

public class Cuenta {
    int numeroCuenta;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "NUMERO-CUENTA='" + numeroCuenta + '\'' +
                ", SALDO='" + saldo + '\'' +
                '}';
    }    
}
