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
  



}