package Lab8;

public class Number2 implements Runnable
{ 
   public static void main(String[] args) 
   { 

		Thread t=new Thread(new Timer());
		t.start();
         
   }

@Override
public void run() {
	int time=1;
	while(true) {
	try {
		Thread.sleep(1000);
	if(time==11) time=1;
	System.out.println("time : "+time);
	time++;
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
} 
}
