import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestKata {

    @Test
    fun basesTests(){

        assertEquals(8, move(0, 4))
        assertEquals(15, move(3, 6))
        assertEquals(12, move(2, 5))

    }

}