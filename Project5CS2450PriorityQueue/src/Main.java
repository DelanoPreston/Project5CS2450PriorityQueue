import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter names and their importance (eg. joseph 4");
		
		List<String> temp = new ArrayList<String>();
		while(true){
			String t1 = in.nextLine();
			if(!t1.equals(""))
				temp.add(t1);
			else
				break;
		}
		String[] listOfNames = temp.toArray(new String[temp.size()]);
		in.close();
		
		MyPriorityQueue queue = new MyPriorityQueue(listOfNames);
		queue.PrintQueue();
		
		System.out.print("The queues order with the more important first: ");
	}
}
