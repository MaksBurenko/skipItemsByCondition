import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SkipItemsByConditionTest {

    private SkipItemsByCondition skipItemsByCondition;

    @Before
    public void setUp() throws Exception {
        skipItemsByCondition = new SkipItemsByCondition();
    }

    @Test
    public void testFilter() {
        Map<Integer, String> map = new HashMap<>();{{
            map.put(1, "penguin");
            map.put(2, "table");
            map.put(3, "bubble");
        }}
        Map<Integer, String> result = skipItemsByCondition.filter(map, key -> key % 2 ==1);

        assertThat(result.size(), is(1));
        assertThat(result.get(2), is("table"));
    }
}