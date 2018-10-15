package deliveryState;

public class ReorderedState implements State {
	DeliveryState deliveryState;
	
	
	public ReorderedState(DeliveryState deliveryState) {
		this.deliveryState = deliveryState;
		}
	
	public void markItem() {
		System.out.println("Item reorderd!");
		deliveryState.setState(deliveryState.getReorderedState());
	}
	
	
	public void reorderItem() {
		System.out.println("Reorder!");
	}
	public void refundItem() {
	}
	
	public String toString() {
		return "Reorder item!";
	}
	
	

}

