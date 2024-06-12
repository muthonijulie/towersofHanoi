package recursive;


		import java.util.Scanner;

		public class Towersofhanoi {

		    // Function to print the movement of disks
		    static void moveDisk(int n, char fromRod, char toRod) {
		        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
		    }

		    // Recursive function to solve the Tower of Hanoi puzzle
		    static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
		        if (n == 1) {
		            moveDisk(n, fromRod, toRod);
		            return;
		        }
		        solveHanoi(n - 1, fromRod, auxRod, toRod);
		        moveDisk(n, fromRod, toRod);
		        solveHanoi(n - 1, auxRod, toRod, fromRod);
		    }

		    // Function to calculate the total number of steps required
		    static int calculateSteps(int n) {
		        return (int) Math.pow(2, n) - 1;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter the number of disks: ");
		        int numDisks = scanner.nextInt();

		        System.out.println("Solving Tower of Hanoi with " + numDisks + " disks:");
		        solveHanoi(numDisks, 'A', 'C', 'B');
		        
		        int steps = calculateSteps(numDisks);
		        System.out.println("Number of steps taken: " + steps);
		        
		        scanner.close();
		    }
		}


	


