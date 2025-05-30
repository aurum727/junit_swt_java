import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void canCreateFirstGroup() {
    openGroupsPage();
    createGroup("1", "2", "3");
  }

  @Test
  public void canCreateSecondGroup() {
    openGroupsPage();
    createGroup("4", "5", "6");
  }

}
