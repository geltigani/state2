package deliveryState;

public class DeliveredState implements State {
	DeliveryState deliveryState;
	
	public DeliveredState(DeliveryState deliveryState) {
		this.deliveryState = deliveryState;
		}
	
	public void markItem() {
		System.out.println("Item was already delivered!");
		deliveryState.setState(deliveryState.getDeliveredState());
	}
	
	
	public void reorderItem() {
		System.out.println("Check again in a few weeks!");
	}
	public void refundItem() {
	}
	
	public String toString() {
		return "Delivered already!";
	}
	
	

}
