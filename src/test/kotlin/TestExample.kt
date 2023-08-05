import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestExample {

    @Test
    fun multiply(){
        assertEquals(4,doubleInteger(2),"Nope!")
        assertEquals(6,doubleInteger(3),"Nope!")
        assertEquals(8,doubleInteger(4),"Nope!")
        assertEquals(10,doubleInteger(5),"Nope!")
    }

    @Test
    fun testFixed(){
        assertEquals("63",numberToString(63))
        assertEquals("208",numberToString(208))
        assertEquals("999",numberToString(999))
        assertEquals("1020",numberToString(1020))
    }

}