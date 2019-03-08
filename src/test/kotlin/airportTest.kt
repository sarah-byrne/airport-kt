import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

public class airportTest {
//    @Before
//    val a = Airport()

    @Test
    fun ` should say it is an airport `() {
        val a = Airport()
        assertEquals("i am an airport", a.hello())
    }

    @Test
    fun ` can receive a landing plane `() {
        val a = Airport()
        a.land("plane1")
        assertTrue(a.planes.contains("plane1"))
    }
}