import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val list: List<String> = getReadOnlyList()
        Assert.assertEquals(4, list.size)
    }
}