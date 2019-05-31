package a;

public class AccessChildClass extends AccessModifiersOne {

	public static void main(String[] args) {

		AccessModifiersOne one = new AccessModifiersOne();
		one.publicMethod();
		//one.privateMethod();
		one.protectedMethod();
		one.packageFriendlyMethod();

		AccessChildClass child = new AccessChildClass();
		child.publicMethod();
		//child.privateMethod();
		child.protectedMethod();
		child.packageFriendlyMethod();

	}

}
