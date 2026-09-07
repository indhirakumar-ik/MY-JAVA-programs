package indhirakumar;

public class armstrong_number {

	public static void main(String[] args) {

		        int number = 153;
		        int sum = 0;
		        int temp = number;

		        while (temp != 0) {
		            int digit = temp % 10;
		            sum += digit * digit * digit;
		            temp /= 10;
		        }

		        if (sum == number)
		            System.out.println("Armstrong Number");
		        else
		            System.out.println("Not an Armstrong Number");
		    }
		}

