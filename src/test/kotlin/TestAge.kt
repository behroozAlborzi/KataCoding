import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestAge {

    @Test fun basic_tests(){
        println(ParseIntCharProblem().getAge("4 years old"))
        assertEquals(4,ParseIntCharProblem().getAge("4 years old"))
        assertEquals(5, ParseIntCharProblem().getAge("5 years old"));
        assertEquals(7, ParseIntCharProblem().getAge("7 years old"));
    }

}