package bank.classBank;

public class Cliente {
    String rut;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String domicilio;
    String comuna;
    String telefono;
    Cuenta cuenta;

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public String getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public String getComuna() {
            return comuna;
        }

        public void setComuna(String comuna) {
            this.comuna = comuna;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public Cuenta getCuenta() {
            return cuenta;
        }

        public void setCuenta(Cuenta cuenta) {
            this.cuenta = cuenta;
        }



        @Override
        public String toString() {
            return "Cliente{" +
                    "RUT='" + rut + '\'' +
                    ", NOMBRE='" + nombre + '\'' +
                    ", APELLIDO-PATERNO='" + apellidoPaterno + '\'' +
                    ", APELLIDO-MATERNO='" + apellidoMaterno + '\'' +
                    ", DOMICILIO='" + domicilio + '\'' +
                    ", COMUNA='" + comuna + '\'' +
                    ", TELEFONO='" + telefono + '\'' +
                    ", CUENTA='" + cuenta.numeroCuenta + '\'' +
                    ", SALDO='" + cuenta.saldo + '\'' +
                    '}';
        }
}
