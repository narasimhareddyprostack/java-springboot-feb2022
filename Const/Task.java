public class Task{
	int taskId;
	String taskName;
	Task(int taskId, String taskName){
		this.taskId = taskId;
		this.taskName = taskName;
		System.out.println("Constructor method");
	}
	public static void main(String[] args){
		Task t1 = new Task(101,"create Home Page");
		System.out.println(t1.taskId);
		
	}

}