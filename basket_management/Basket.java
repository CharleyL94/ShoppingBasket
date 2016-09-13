package basket_management;
import basket_management.*;
import java.util.*;

public class Basket{

  private ArrayList<Basket> basket;
  private Item item;

  public Basket(){
    this.basket = new ArrayList<Basket>();
  }

  public void createBasket(){
    deck.add(new Item(item));
  }

  public int getBasketSize(){
    return basket.size;
  }

  public void recieveAnItem(Item item){
    basket.add(item);
  }

  // remove item
  // empty basket

  // total cost of items
  // discount


}