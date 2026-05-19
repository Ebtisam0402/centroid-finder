import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.foreign.Linker.Option;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class LargestGroupSelectorTest {

 @Test
 public void selectLargestReturnEmptyListIsNull() {

  LargestGroupSelector selector = new LargestGroupSelector();
  Optional<Group> result = selector.selectLargest(null);
  assertTrue(result.isEmpty());
 }

}
