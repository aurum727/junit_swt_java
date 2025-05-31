import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void canCreateFirstGroup() {
    openGroupsPage();
    createGroup(new GroupData("1", "2", "3"));
  }

  @Test
  public void canCreateSecondGroup() {
    openGroupsPage();
    var emptyGroup = new GroupData();
    var groupWithName = emptyGroup.withName("some name");
    createGroup(new GroupData("4", "5", "6"));
  }

  @Test
  public void canCreateGroupWithNameOnly() {
    openGroupsPage();
    createGroup(new GroupData().withName("some name"));
  }


}
