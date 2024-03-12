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



        return false;
    }

    public String generarIban(String entidad, String oficina, String dc, String cuenta){
        BigInteger longitud = new BigInteger("0");
        BigInteger xx = new BigInteger("0");
        String iban = "";
        if (entidad.length() == 4 && oficina.length() == 4 && dc.length() == 2 && cuenta.length() == 10) {
            iban = entidad.concat(oficina).concat(dc).concat(cuenta) + "ES00";
        }

        if (iban.contains("E") && iban.contains("S")) {
                iban.replace("E","14");
                iban.replace("S","28");

                //sacarDigitosControl();
            }

        return iban;
        }

        /*public static int sacarDigitosControl(){
            long ibanLong = Integer.parseInt(iban);

            longitud = BigInteger.valueOf(ibanLong);
            xx = longitud.divide(BigInteger.valueOf(97));
        }*/

}
