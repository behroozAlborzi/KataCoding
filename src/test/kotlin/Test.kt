import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun exampleTests() {
        val sif = SmallestIntegerFinder()
        assertEquals(10, sif.findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
    }

    @Test
    fun testing(){
        val convert = ConvertLongDecimalsToShortDecimal()
        assertEquals(12.22,convert.convertDecimal(12.2245545455))
    }
}