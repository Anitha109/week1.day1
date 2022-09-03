package week1.day1;

public class Prime {
public static void main(String[] args) {
	int number = 89;
	boolean isPrime = false;
	for (int i = 2; i < number ; i++) {
		if (number % i == 0){
			isPrime = true;
			i = number;
		}
	}
	if (isPrime == true){
		System.out.println(number + " is a Prime number");
	}
	else {
		System.out.println(number + " is not a Prime number");
	}
	}
}

