import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeEnviosTest {
    static GestorDeEnvios g;

    @BeforeAll
    static void setUp(){
        g = new GestorDeEnvios();
    }

    @Test
    @ParameterizedTest(name = "El pedido es de {0} y su coste seria {1}")
    @CsvSource({
            "10.0, 5.0", //pedido pequeño
            "20.0, 3.0", //limite de 20 euros
            "40.0, 3.0", //limite de 40 euros
            "49.0, 3.0", //limite de 49 euros
            "50.0, 0.0" //limite de 50 euros
    })
    void testingMasivo(double precio, double valorEsperado) {
        double res = g.calcular(precio);
        assertEquals(valorEsperado, res);
    }
}