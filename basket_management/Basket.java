package basket_management;
import basket_management.*;
import java.util.*;

public class Basket{

  private ArrayList<Item> basket;
  private Item item;
  private Cost cost;

  public Basket(){
    this.basket = new ArrayList<Item>();
  }
    

  // returns all items in basket
  public ArrayList<Item> getAllItems(){
    ArrayList<Item> clone = new ArrayList<Item>(this.basket);
    return clone;
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
  public void emptyBasket(){
    basket.clear();
  }
  
  // total cost of items
  public void totalCost(){
    cost = 0;
    for (Item item : getAllItems() ){
      cost += item.getValue();
    }
    return cost;
  }

  // bogof

  // 10% discount >£20
  public double applyDiscount(){
    // double cost 
    if (cost > 20){
      cost -= (cost/100 * 10);
    } 
    return cost;
  }
  // 2% discount with loyalty card
  public double applyLoyaltyDiscount(){
    // if loyalty card = true apply discount
    // if (cost > 20){
    cost -= (cost/100 * 2);
  }
  // return cost
  }


}