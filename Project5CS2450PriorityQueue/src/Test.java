import junit.framework.TestSuite;


public class Test {

	@org.junit.Test
	public void test() {
		suite();
	}
	public static TestSuite suite(){
		TestSuite suitew = new TestSuite();
		suitew.addTest(new TestAdd());
		suitew.addTest(new TestMult());
		return suitew;
	}
}
