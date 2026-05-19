import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class LargestGroupSelectorTest {

 @Test
 public void selectLargestReturnEmptyListIsNull() {

  LargestGroupSelector selector = new LargestGroupSelector();
  Optional<Group> result = selector.selectLargest(null);
  assertTrue(result.isEmpty());
 }

 @Test
 public void selectLargestReturnsEmptyWhenListIsEmpty() {
  LargestGroupSelector selector = new LargestGroupSelector();

  Optional<Group> result = selector.selectLargest(new ArrayList<>());

  assertTrue(result.isEmpty());
 }

 @Test
 public void selectLargestReturnsOnlyGroupWhenListHasOneGroup() {
  LargestGroupSelector selector = new LargestGroupSelector();

  Group group = new Group(1, new Coordinate(1, 1));

  Optional<Group> result = selector.selectLargest(List.of(group));

  assertTrue(result.isPresent());
  assertSame(group, result.get());
 }

}
