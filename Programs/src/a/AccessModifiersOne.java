package a;

public class AccessModifiersOne {

	public int num1 = 1;
	private int num2 = 2;
	protected int num3 = 3;
	int num4 = 4;

	public void publicMethod() {
		System.out.println("public modifier " + num1);
	}

	private void privateMethod() {
		System.out.println("private modifer " + num2);
	}

	protected void protectedMethod() {
		System.out.println("protected modifier " + num3);
	}

	void packageFriendlyMethod() {
		System.out.println("package friendly/ no access modifier " + num4);
	}

	public static void main(String[] args) {
		AccessModifiersOne one = new AccessModifiersOne();
		one.publicMethod();
		one.privateMethod();
		one.protectedMethod();
		one.packageFriendlyMethod();
	}

}
