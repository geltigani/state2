
package deliveryState;
import java.util.*;

public class DeliveryStateTest {

	public static void main(String[] args) {
		DeliveryState deliveryState = new DeliveryState(0);
		
		System.out.println("Enter number of days since ordered");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		deliveryState.markItem();
		deliveryState.reorderItem();
		deliveryState.refundItem();
		
	    System.out.println(deliveryState);

	}

}
