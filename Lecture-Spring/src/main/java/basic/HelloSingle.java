package basic;

public class HelloSingle {

	private static HelloSingle instance = null;
	private String msg = "안녕 난 싱글턴이야...";
	
	private HelloSingle() {
		System.out.println("HelloSingle객체 로딩...");
	}
	
	public static HelloSingle getInstance() {			
		if(instance == null)
			instance = new HelloSingle();
		return instance;
	}
	
	public void prnMsg() {
		System.out.println("msg : " + msg);
	}
}
