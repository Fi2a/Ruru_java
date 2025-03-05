package innerTest;

public class MainMt {

	public static void main(String[] args) {
		
		Job job = new Job() {
			@Override
			public void myJob() {
				System.out.println(JobName);
			}			
		};
		job.JobName = "백수";
		job.myJob();
		
		Work work = new Work() {
			@Override
			public void working() {
				System.out.println("자바 공부");
			}
		};
		
		work.working();
		
		
	}

}
