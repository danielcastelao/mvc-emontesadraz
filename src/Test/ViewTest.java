import cod.mvc.View;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ViewTest {
    View view;
    PrintStream originalOut;
    ByteArrayOutputStream bos;

    @BeforeEach
    void setUp() {
        view = new View();
        originalOut = System.out;
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
    }

    @Test
    void muestraVelocidadDisplaysCorrectMessage() {
        view.muestraVelocidad("123ABC", 100);
        assertTrue(bos.toString().contains("La velocidad del coche 123ABC es de: 100 Km/h"));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}