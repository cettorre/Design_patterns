package command_v2;

/*
 * https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */

public class CommandPatternMain {
	
		   public static void main(String[] args) {
		      Stock abcStock = new Stock();

		      BuyStock buyStockOrder = new BuyStock(abcStock);
		      SellStock sellStockOrder = new SellStock(abcStock);

		      Broker broker = new Broker();
		      broker.takeOrder(buyStockOrder);
		      broker.takeOrder(sellStockOrder);

		      broker.placeOrders();
		   }
	}
	
	
	

