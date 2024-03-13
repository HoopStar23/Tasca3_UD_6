import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaTest {

    @Test
    void testComprobarIban1(){
        Cuenta cuenta = new Cuenta();

        assertEquals(true, cuenta.compruebaIban("ES6621000418401234567891"));
    }

    @Test
    void testComprobarIban2(){
        Cuenta cuenta = new Cuenta();

        assertEquals(true, cuenta.compruebaIban("ES6621000418401234567891"));
    }

    @Test
    void testComprobarIban3(){
        Cuenta cuenta = new Cuenta();

        assertEquals(true, cuenta.compruebaIban("ES9420805801101234567891"));
    }

    @Test
    void testComprobarIban4(){
        Cuenta cuenta = new Cuenta();

        assertEquals(false, cuenta.compruebaIban("ES7600246912501234567891"));
    }

    @Test
    void testComprobarIban5(){
        Cuenta cuenta = new Cuenta();

        assertEquals(false, cuenta.compruebaIban("ES4721000418401234567891"));
    }

    @Test
    void testComprobarIban6(){
        Cuenta cuenta = new Cuenta();

        assertEquals(false, cuenta.compruebaIban("ES8200491500051234567892"));
    }

    @Test
    void testGeneraIban1(){
        Cuenta cuenta = new Cuenta();

        assertEquals("ES7100302053091234567895", cuenta.generarIban("0030","2053","09","1234567895"));
    }

    @Test
    void testGeneraIban2(){
        Cuenta cuenta = new Cuenta();

        assertEquals("ES1000492352082414205416", cuenta.generarIban("0049","2352","08","2414205416"));
    }

    @Test
    void testGeneraIban3(){
        Cuenta cuenta = new Cuenta();

        assertEquals("ES1720852066623456789011", cuenta.generarIban("2085","2066","62","3456789011"));
    }

    @Test
    void testGeneraIban4(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("2085","2066","62","3456AE9011"));
    }

    @Test
    void testGeneraIban5(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("208","2066","62","3456789011"));
    }

    @Test
    void testGeneraIban6(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("2080","20A6","62","3456789011"));
    }

    @Test
    void testGeneraIban7(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("2080","2086","6","3456789011"));
    }

    @Test
    void testGeneraIban8(){
        Cuenta cuenta = new Cuenta();

        assertEquals(null, cuenta.generarIban("2080","2086","63","345678911"));
    }
}
