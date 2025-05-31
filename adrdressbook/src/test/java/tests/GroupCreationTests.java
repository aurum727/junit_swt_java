package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void canCreateFirstGroup() {
    app.openGroupsPage();
    app.createGroup(new GroupData("1", "2", "3"));
  }

  @Test
  public void canCreateSecondGroup() {
    app.openGroupsPage();
    var emptyGroup = new GroupData();
    var groupWithName = emptyGroup.withName("some name");
    app.createGroup(new GroupData("4", "5", "6"));
  }

  @Test
  public void canCreateGroupWithNameOnly() {
    app.openGroupsPage();
    app.createGroup(new GroupData().withName("some name"));
  }


}
