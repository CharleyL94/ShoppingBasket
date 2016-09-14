package basket_management;
import basket_management.*;
import java.util.*;

public class Item{
  FoodType food;
  float value;
  boolean bogof;

  public Item(FoodType food, float value, boolean bogof)
  {
    this.food = food;
    this.value = value;
    this.bogof = bogof;
  }

  public FoodType getFood(){
    return food;
  }

  public float getValue(){
    return value;
  }

  public boolean itemBogof(){
    return this.bogof;
  }


}