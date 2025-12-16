import static org.junit.jupiter.api.Assertions.*;

class ValidadorClaveTestTest {

    @org.junit.jupiter.api.Test
    void esValida() {
    }
    // Creamos el objeto que vamos a probar
    ValidadorClave validador = new ValidadorClave();

    @Test
    void claveValida_DeberiaRetornarTrue() {
        // CASO CORRECTO: Cumple todas las reglas (no null, >8 chars, tiene números)
        boolean resultado = validador.esValida("ClaveSegura123");
        assertTrue(resultado, "Una clave válida debería devolver true");
    }

    @Test
    void claveCorta_DeberiaRetornarFalse() {
        // FALLO REGLA 2: Tiene números, pero es muy corta
        boolean resultado = validador.esValida("Test1");
        assertFalse(resultado, "Una clave de menos de 8 caracteres debe fallar");
    }

    @Test
    void claveNull_DeberiaRetornarFalse() {
        // FALLO REGLA 1: Es null
        boolean resultado = validador.esValida(null);
        assertFalse(resultado, "Una clave null debe devolver false sin dar error");
    }
}