package b;

import a.AccessModifiersOne;

public class AccessModiferTwo extends AccessModifiersOne{

	
	public static void main(String[] args) {
		
		AccessModifiersOne one = new AccessModifiersOne();
		one.publicMethod();
		//one.privateMethod();
		//one.protectedMethod();
		//one.packageFriendlyMethod();
		
		AccessModiferTwo child = new AccessModiferTwo();
		child.publicMethod();
		//child.privateMethod();
		child.protectedMethod();
		//child.packageFriendlyMethod();
		
	}
}
