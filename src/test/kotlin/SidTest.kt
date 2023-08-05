import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class SidTest {


    @Test
    fun testEven() {
        assertEquals(9, simpleMultiplication(1))
        assertEquals(27, simpleMultiplication(3))
    }

    @Test fun testOdd() {
        assertEquals(16, simpleMultiplication(2))
        assertEquals(32, simpleMultiplication(4))
    }

    @Test fun testRandom() {
        for (i in 1..100) {
            val randomOdd = Random().nextInt(10000) * 2 + 1
            val randomEven = Random().nextInt(10000) * 2

            assertEquals(simpleMultiplication(randomOdd), randomOdd * 9)
            assertEquals(simpleMultiplication(randomEven), randomEven * 8)
        }
    }


}