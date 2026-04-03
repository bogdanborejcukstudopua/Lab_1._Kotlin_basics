import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val list = createMutableList()
        Assert.assertEquals(listOf(1, 2, 3), list)
    }
}