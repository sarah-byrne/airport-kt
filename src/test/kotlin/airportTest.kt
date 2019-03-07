import junit.framework.Assert.assertEquals
//import org.hamcrest.CoreMatchers.equalTo
//import org.hamcrest.CoreMatchers.not
//import org.hamcrest.MatcherAssert.assertThat

import org.junit.Test

public class airportTest {
    @Test
    fun ` should say it is an airport `() {
        val a = Airport()
        assertEquals("i am an airport", a.hello())
    }
}