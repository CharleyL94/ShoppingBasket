package basket_management;
import basket_management.*;
import java.util.*;

public class Item{
  FoodType food;
  ValueType value;

  public Item(FoodType food, ValueType value)
  {
    this.food = food;
    this.value = value;
  }

  public FoodType getFood(){
    return food;
  }

  public ValueType getValue(){
    return value;
  }
}