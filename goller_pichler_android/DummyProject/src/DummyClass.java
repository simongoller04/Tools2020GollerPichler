
public class DummyClass {

	public void existing(){
		System.out.print("Existing Method");
		System.out.println("Hallo Lukas");
		//new LoC
		int newLineOfCode;
	}
	
	public void thisIsANewMethod() { 
		int counter = 0;
		for (int i=0;i<=10;i++) {
			System.out.println(i);

			System.out.println("Hallo");

			System.out.println(i);
			
			//new LoC
			int anotherNewLineOfCode;
		}
	}
}
