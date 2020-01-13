import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ContestTest {
    int input;
    String output;

    public ContestTest(int input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,"1"},
                {2,"2"},
                {3,"fizz"},
                {5,"buzz"},
                {15,"fizzbuzz"}
        });
    }

    @Test
    public void test() {
        assertEquals(output, Contest.judge(input));
    }

}