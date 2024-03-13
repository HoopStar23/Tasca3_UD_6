import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaTest {

    @Test
    void testComprobarIban1(){
        Cuenta cuenta = new Cuenta();

        assertEquals(true, cuenta.compruebaIban("ES6621000418401234567891"));
    }

    @Test
    void testGeneraIban1(){
        Cuenta cuenta = new Cuenta();

        assertEquals("ES7100302053091234567895", cuenta.generarIban("0030","2053","09","1234567895"));
    }

    @Test
    void testGeneraIban2(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("2085","2066","62","3456AE9011"));
    }
}
