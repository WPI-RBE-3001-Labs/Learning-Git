package main;

/*
 * I don't know why anyone would read this.  If you do...
 * kudos, I guess?  At any rate:  here's an inefficient
 * fibonacci calculator.
 */
public class main {

	public static void main(String[] args) {
		int i = 0;
		while(true) {
			System.out.println("The " + i + "th fibonacci number is: " + main.fib(i++));
		}
	}
	
	private static int fib(int n) {
		if(n == 0) { return 0; } // base case
		if(n == 1) { return 1; } // baser case
		return fib(n - 1) + fib(n - 2);
	}
}