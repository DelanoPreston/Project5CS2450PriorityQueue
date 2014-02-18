


public class MyPriorityQueue {
//	HashMap<String, Integer> tempQueue = new HashMap<String, Integer>();
	String[] queue;
	
	public MyPriorityQueue(){
		queue = null;
	}
	
	public MyPriorityQueue(String[] inStuff){
		queue = inStuff;
		PrioritizeQueue();
	}
	
	public void PrintQueue(){
		for(int i = 0; i < queue.length; i++){
			System.out.println(queue[i]);
		}
	}
	
	public void Add(String name){
		String[] temp = queue; 
		queue = new String[temp.length + 1];
		
		for(int i = 0; i < queue.length; i++){
			queue[i] = temp[i];
		}
		queue[queue.length - 1] = name;
		
		PrioritizeQueue();
	}
	
	private void PrioritizeQueue(){
		int importance = 10;
		int index = 0;
		String[][] temp = new String[queue.length][2];  
		
		for(int i = 0; i < queue.length; i++){
			temp[i] = queue[i].split(" ");
		}
		
		while(index < queue.length){
			for(int j = 0; j < temp.length; j++){
				if(Integer.parseInt(temp[j][1]) == importance){
					queue[index] = temp[j][0] + " " + importance;
					index++;
//					break;
				}	
			}
			importance--;
		}
	}
}
