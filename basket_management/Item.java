package basket_management;
import basket_management.*;
import java.util.*;

public class Item{
  FoodType food;

  public Item(FoodType food)
  {
    this.food = food;
  }

  public FoodType getFood(){
    return food;
  }
}