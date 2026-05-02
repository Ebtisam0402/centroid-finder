import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DfsBinaryGroupFinderTest {

    @Test
    public void testSinglePixelGroup() {
        int[][] image = {
            {1}
        };

        DfsBinaryGroupFinder finder = new DfsBinaryGroupFinder();

        List<Group> expected = List.of(
            new Group(1, new Coordinate(0, 0))
        );

        assertEquals(expected, finder.findConnectedGroups(image));
    }
}
