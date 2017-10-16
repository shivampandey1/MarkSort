import java.util.*;
public class ch10E4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		int inputNum;
		ArrayList<Integer> total= new ArrayList<Integer>();
		ArrayList<Integer> set1= new ArrayList<Integer>();
		ArrayList<Integer> set2= new ArrayList<Integer>();
		ArrayList<Integer> set3= new ArrayList<Integer>();
		ArrayList<Integer> set4= new ArrayList<Integer>();
		ArrayList<Integer> set5= new ArrayList<Integer>();
		ArrayList<Integer> set6= new ArrayList<Integer>();
		ArrayList<Integer> set7= new ArrayList<Integer>();
		ArrayList<Integer> set8= new ArrayList<Integer>();
		ArrayList<Integer> set9= new ArrayList<Integer>();
		System.out.println("Please enter the values of your dataset (between 1-50. Once you are done filling it in, please type any number greater than 51.");
		do {
		//sort the values here
		inputNum = input.nextInt();
		if (6 > inputNum){
		total.add(inputNum);
		set1.add(inputNum);
		}
		else if (11 > inputNum && inputNum > 5){
		total.add(inputNum);
		set1.add(inputNum);
		}
		else if (11 > inputNum && inputNum > 5){
			total.add(inputNum);
			set2.add(inputNum);
			}
		else if (16 > inputNum && inputNum > 10){
			total.add(inputNum);
			set3.add(inputNum);
			}
		else if (21 > inputNum && inputNum > 15){
			total.add(inputNum);
			set4.add(inputNum);
			}
		else if (26 > inputNum && inputNum > 20){
			total.add(inputNum);
			set4.add(inputNum);
			}
		else if (31 > inputNum && inputNum > 25){
			total.add(inputNum);
			set5.add(inputNum);
			}
		else if (36 > inputNum && inputNum > 30){
			total.add(inputNum);
			set6.add(inputNum);
			}
		else if (41 > inputNum && inputNum > 35){
			total.add(inputNum);
			set7.add(inputNum);
			}
		else if (46 > inputNum && inputNum > 40){
			total.add(inputNum);
			set8.add(inputNum);
			}
		else if (51 > inputNum && inputNum > 45){
			total.add(inputNum);
			set9.add(inputNum);
			}
		}
		while (51 > inputNum);
		//find average, maximum, range, median, histogram
		//average
		int sum = 0;
		for (double i : total)
		    sum += i;
		System.out.println("sum total of dataset: "+ sum);
		double sizeTotal = total.size();
		System.out.println("number of data points entered: " + sizeTotal);
		double average = sum / sizeTotal;
		System.out.println("The average value of your data is: " + average);
		//=======
		//maximum
		System.out.println("The highest value in the array is: " +Collections.max(total));
		//=======
		//minimum
		int range = (Collections.max(total)) - (Collections.min(total));
		System.out.println("The highest value is " + Collections.max(total) + ", and the lowest value is " + Collections.min(total) + ". Therefore, the range is " + range + ".");
		//=======
		//median is (#points + 1) /2
		System.out.println("Median Calc:" + sizeTotal % 2);
		double median;
		if (total.size() % 2 == 0){
			median = (Collections.max(total) + 1) / 2;
			System.out.println("The median value is: " + median);
		}
		else if (total.size() % 2 != 0){
			median = Collections.max(total) / 2;
		System.out.println("The median value is: " + median);
		}
		//======
		//histograms
		System.out.println("\n Number of points in set 1: ");
		for (int i = 0; i < set1.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 2: ");
		for (int i = 0; i < set2.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 3: ");
		for (int i = 0; i < set3.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 4: ");
		for (int i = 0; i < set4.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 5: ");
		for (int i = 0; i < set5.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 6: ");
		for (int i = 0; i < set6.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 7: ");
		for (int i = 0; i < set7.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 8: ");
		for (int i = 0; i < set8.size(); i++) {
			System.out.print("*");
		}
		System.out.println("\n Number of points in set 9: ");
		for (int i = 0; i < set9.size(); i++) {
			System.out.print("*");
		}
	
	}

}
