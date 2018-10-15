package deliveryState;

public class PendingState implements State {
	DeliveryState deliveryState;
	
	
	public PendingState(DeliveryState deliveryState) {
		this.deliveryState = deliveryState;
		}
	
	public void markItem() {
		System.out.println("Item not delivered!");
		deliveryState.setState(deliveryState.getRefundState());
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

