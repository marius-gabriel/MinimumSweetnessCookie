package test;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> cookieJar=new PriorityQueue<Integer>();
		Scanner scan = new Scanner(System.in);
		int coockieNumber=scan.nextInt();
		if ((coockieNumber<1)||(coockieNumber>1000000)) return;
		int swetness=scan.nextInt();
		if ((swetness<0)||(coockieNumber>1000000000)) return;
		for(int i=0;i<coockieNumber;i++){
			int cookie =scan.nextInt();
			if ((cookie<0)||(cookie>1000000)) return;
			else cookieJar.add(cookie);
		}
		Integer leastSweetCookie=cookieJar.peek();
		int numberOfOperations=0;
		while ((leastSweetCookie<swetness)&&(cookieJar.size()>1)){
			cookieJar.add(cookieJar.poll()+2*cookieJar.poll());
			leastSweetCookie=cookieJar.peek();
			numberOfOperations++;
			//System.out.println(" operations "+numberOfOperations);
		}
		if (leastSweetCookie<swetness) System.out.println(-1);
		else System.out.println(numberOfOperations);
    }
}
