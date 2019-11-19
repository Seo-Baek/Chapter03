package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
//		//jvm메모리 구조 찾아보장 evernote
//		camera.setName("nikon");
//		//camera.setPrice(400000);
//		camera.setPrice(1000);
//		camera.setCountStock(30);
//		camera.setCountSold(50);  //setter and getter로 퍼블릭이 만들어져서 가능해짐
		
		Goods camera = new Goods("nikon", 400000, 30, 50);
		//객체를 생성하는 데 사용한 클래스 정보를 얻어온다.(클래스이름, 메소드정보, 필드정보): reflection
		//Class cls = camera.getClass();
		//System.out.println(cls.getNAme());
		
		int price = camera.getPrice();
		System.out.println(price);
		camera.showInfo();
		
		
		int discountPrice = camera.calcDiscountPrice(0.5f); //50% 계산하여 return; f를 뒤에 적은 건 float라고 알려주는 것
		System.out.println("할인가격 : " + discountPrice);
		
		
		/*
		 * Goods camera2 = new Goods(); Goods camera3 = new Goods(); Goods camera4 = new
		 * Goods();
		 * 
		 * Goods.showCount();
		 */
		
	
		
		
		
	}

}
