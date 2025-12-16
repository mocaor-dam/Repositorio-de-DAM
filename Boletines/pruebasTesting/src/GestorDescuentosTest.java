import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorDescuentosTest {

    static GestorDescuentos g;

    @BeforeAll
    static void setUp() {
        g = new GestorDescuentos();
    }

    @Test
    void adulto_SinDescuento() {


        //ACT
        double res = g.calcular(500, 45, 1);

        //Assert
        assertEquals(500, res);
    }

    @Test
    void senior65_Descuento50() {
        //Act
        double res = g.calcular(100, 65, 1);

        assertEquals(50, res);
    }

    @Test
    void cantidad5_SinBonusExtra() {
        double res = g.calcular(10.0, 30, 5);
        assertEquals(50, res);
    }

}