import static org.junit.Assert.*;
import org.junit.*;
import basket_management.*;

public class ItemTest{

  Item item;

// default item
  @Before 
  public void before(){
    item = new Item(FoodType.EGGS, ValueType.TWO);
  }

  // getFood method test
  @Test
  public void canGetFood(){
    assertEquals(item.getFood(), FoodType.EGGS);
  }

  // getValue method test
  @Test
  public void canGetValue(){
    assertEquals(item.getValue(), ValueType.TWO);
  }



}