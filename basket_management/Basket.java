package basket_management;
import basket_management.*;
import java.util.*;

public class Basket{

  private ArrayList<Item> basket;
  private Item item;

  public Basket(){
    this.basket = new ArrayList<Item>();
  }
    

// check number of items in basket
  public int getBasketSize(){
    return basket.size();
  }

//place item into basket 
  public void recieveAnItem(Item item){
    basket.add(item);
  }

// remove item from basket
  public void removeAnItem(Item item){
    basket.remove(item);
  }
  
  // empty basket
  public void emptyBasket(Item item){
    basket.remove(0);
  }
  
  // total cost of items
  

  // bogof
  // 10% discount >£20
  // 2% discount with loyalty card


}