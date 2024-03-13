import java.math.BigInteger;

public class Cuenta {
    private String titular;
    private String cuentaBancaria;

    public Cuenta() {
        this.titular = "";
        this.cuentaBancaria = "";
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public boolean compruebaIban(String iban){

        BigInteger xx = sacarDigitosControl(iban.substring(4));
        String digitoControl = String.valueOf(xx);

        if (digitoControl.equalsIgnoreCase(iban.substring(2,4))) {
            return true;
        }else {
            return false;
        }
    }

    public String generarIban(String entidad, String oficina, String dc, String cuenta){
        String iban = "";
        if (entidad.length() == 4 && oficina.length() == 4 && dc.length() == 2 && cuenta.length() == 10) {
            iban = entidad.concat(oficina).concat(dc).concat(cuenta);
            for(char c : iban.toCharArray()){
                if ("AEIOU".indexOf(c) != -1) {
                    return null;
                }
            }
        }else{
            return null;
        }

        BigInteger xx = sacarDigitosControl(iban);
        String digitoControl = String.valueOf(xx);

        iban = "ES"+digitoControl.concat(iban);

        return iban;
    }

    public static BigInteger sacarDigitosControl(String iban){
        iban += "ES00";

        if (iban.contains("E") && iban.contains("S")) {
            iban = iban.replace("E","14");
            iban = iban.replace("S","28");
        }

        BigInteger longitud = new BigInteger(iban);
        BigInteger xx = BigInteger.valueOf(98).subtract(longitud.mod(BigInteger.valueOf(97)));

        return xx;
    }
}
