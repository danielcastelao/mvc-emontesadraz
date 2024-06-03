import com.cod.mvc.Model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @BeforeEach
    void setUp() {
        Model.parking.clear();
    }

    @Test
    void creatingCarWithNegativeSpeedThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Model.crearCoche("123ABC", "Model S", -1));
    }

    @Test
    void increasingSpeedOfExistingCarUpdatesSpeed() {
        Model.crearCoche("123ABC", "Model S", 100);
        Model.subirVelocidad("123ABC", 50);
        assertEquals(50, Model.getVelocidad("123ABC"));
    }

   @Test
void decreasingSpeedOfExistingCarUpdatesSpeed() {
    Model.crearCoche("123ABC", "Model S", 100);
    Model.bajarVelocidad("123ABC", 0);
    assertEquals(0, Model.getVelocidad("123ABC"));
}

    @Test
    void decreasingSpeedBelowZeroThrowsException() {
        Model.crearCoche("123ABC", "Model S", 100);
        assertThrows(IllegalArgumentException.class, () -> Model.bajarVelocidad("123ABC", 200));
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
    void getSpeedReturnsMinusOneWhenCarDoesNotExist() {
        assertEquals(-1, Model.getVelocidad("123ABC"));
    }

}