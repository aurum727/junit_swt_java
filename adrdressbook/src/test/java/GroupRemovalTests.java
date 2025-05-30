import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {

  @Test
  public void canRemoveGroup() {
    openGroupsPage();
    if (!isGroupPresent()) {
      createGroup("2", "2", "2");
    }
    removeGroup();
  }

}
