package Mythread;

import java.util.Iterator;

public class Mythread2 extends Mythread1{
	@Override
	public void run() {
 for (int i = 0; i < 10; i++) {
	 System.out.println("B" + i  );
}

	}

}
