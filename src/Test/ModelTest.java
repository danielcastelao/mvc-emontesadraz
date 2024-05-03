import cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @BeforeEach
    void setUp() {
        Model.parking.clear();
    }

    @Test
    void creatingCarAddsItToParking() {
        Model.crearCoche("123ABC", "Model S", 100);
        assertNotNull(Model.getCoche("123ABC"));
    }

    @Test
    void getCarReturnsNullWhenCarDoesNotExist() {
        assertNull(Model.getCoche("123ABC"));
    }

    @Test
    void changingSpeedOfExistingCarUpdatesSpeed() {
        Model.crearCoche("123ABC", "Model S", 100);
        Model.cambiarVelocidad("123ABC", 200);
        assertEquals(200, Model.getVelocidad("123ABC"));
    }

    @Test
    void changingSpeedOfNonExistingCarDoesNotThrow() {
        assertDoesNotThrow(() -> Model.cambiarVelocidad("123ABC", 200));
    }

    @Test
    void getSpeedReturnsMinusOneWhenCarDoesNotExist() {
        assertEquals(-1, Model.getVelocidad("123ABC"));
    }

    @Test
    void getSpeedReturnsCorrectSpeedWhenCarExists() {
        Model.crearCoche("123ABC", "Model S", 100);
        assertEquals(100, Model.getVelocidad("123ABC"));
    }
}