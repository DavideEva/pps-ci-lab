import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class DeluTest {

    @Test
    def mainTest(): Unit = {
        ScalaDelu.main(Array("Hello"))
        assertTrue(true)
    }
}