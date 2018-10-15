package deliveryState;

public class RefundState implements State {
	DeliveryState deliveryState;
	
	
	public RefundState(DeliveryState deliveryState) {
		this.deliveryState = deliveryState;
		}
	
	public void markItem() {
		System.out.println("Item refunded!");
		deliveryState.setState(deliveryState.getReorderedState());
	}
	
	
	public void reorderItem() {
		System.out.println("Reorder after refund!");
	}
	public void refundItem() {
	}
	
	public String toString() {
		return "Reorder refunded item!";
	}
	
	

}

