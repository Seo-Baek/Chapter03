package chapter03_2;

public class VIPCustomer extends chapter03.Customer {

	public void set() {
		//public은 접근가능 (어디서든지 접근 가능)
		job = "student";
		
		//protected는 접근가능 (같은 패키지, 자식에서 접근 가능)
		address = "서울시 은평구 구파발동";
		
		// default는 다른 패키지에서 접근 불가능 (같은 패키지이기 때문에 가능하다)
		//age = 19;
		
		
		//private는 자식에서 접근할수 없다.
		//name = "둘리";
		
	}

}
