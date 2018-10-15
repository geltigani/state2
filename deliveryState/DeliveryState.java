// A Java program to determine inventory statuses

package deliveryState;



public class DeliveryState {

	State deliveredState;
	State pendingState;
	State reorderedState;
	State refundState;
	
	State state;
	int count = 0;
	
	public DeliveryState (int daysOrdered ) {
		
		deliveredState = new DeliveredState(this);
		pendingState = new PendingState(this);
		reorderedState = new ReorderedState(this);
		refundState = new RefundState(this);
		
		this.count = daysOrdered;
		if (daysOrdered > 30 ) {
			state = refundState;
			} else 
			state = pendingState;	
		if (daysOrdered < 7 ) {
			state = deliveredState;
			} else {
			state = pendingState;	
			}
	}
	
	public void markItem() {
		state.markItem();
	}
	public void reorderItem() {
		state.reorderItem();
	}
	public void refundItem() {
		state.refundItem();
	}
	
	
	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }
    
    public State getDeliveredState() {
    	return deliveredState ;
    }
    public State getPendingState() {
    	return pendingState ;
    }
    public State getReorderedState() {
    	return reorderedState;
    }
    public State getRefundState() {
    	return refundState;
    }
    
    public String toString() {
    	StringBuffer result = new StringBuffer();
    	return result.toString();
    }
}
