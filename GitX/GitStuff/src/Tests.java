interface I1
{
	//public static final int a = 10;
	void show();
}
class Tests implements I1 {
	//int a=10;
	public void show() 
	{
		System.out.println("Hello show");
	}
	public static void main(String[] args) {
		Tests t = new Tests();
		//System.out.println(t.a);
		t.show();
	}
}
