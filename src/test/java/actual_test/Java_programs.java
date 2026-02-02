package actual_test;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Java_programs {

	@Test
	public void evenNumber() {
		int i;
		for(i=1;i<=30;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void oddnumber() {
		int i=25;
		
			if(i%3==0) {
				System.out.println(i);
		}
	}
	
	@Test
	public void factorial() {
		int i,pdt=1;
		for( i=5;i>=1;i--) {
			
			pdt=pdt*i;	
		}
		System.out.println(pdt);
	}
	
	@Test
	public void swap() {
		int a=10,b=20;
		
		System.out.println("Before Swapping:" );
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a + "  " +b);	
	}
	
	
	
	
}
