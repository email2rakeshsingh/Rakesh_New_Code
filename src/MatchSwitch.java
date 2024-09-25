
public class MatchSwitch {

	public static void main(String[] args) {

	    int num1 = 200;
	    int num2 = 30;

	    String operation = "div"; // Corrected variable name from "opertion" to "operation"
	    switch (operation) {
	        case "add":
	            System.out.println(num1 + num2);
	            break;
	        case "mul":
	            System.out.println(num1 * num2);
	            break;
	        case "sub":
	            System.out.println(num1 - num2);
	            break;
	        case "div":
	            System.out.println(num1 / num2); // Corrected to perform division
	            break;
	        default:
	            System.out.println("please enter the proper operation");
	            break;
	    }
	}


	}


