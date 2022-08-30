package in.co.rays.basic;

import java.net.SocketTimeoutException;

public class HarmonicSeries {
	public static void main(String[] args) {
		
	
	int num=6;
	double result=1.5;
	System.out.println("the harmonic series is");
	while(num>0) {
		result=result + (double) 1/num;
		num--;
		System.out.println(result+",");
	
	}
	}
	
	

}
