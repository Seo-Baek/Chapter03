package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
//		//jvm�޸� ���� ã�ƺ��� evernote
//		camera.setName("nikon");
//		//camera.setPrice(400000);
//		camera.setPrice(1000);
//		camera.setCountStock(30);
//		camera.setCountSold(50);  //setter and getter�� �ۺ��� ��������� ��������
		
		Goods camera = new Goods("nikon", 400000, 30, 50);
		//��ü�� �����ϴ� �� ����� Ŭ���� ������ ���´�.(Ŭ�����̸�, �޼ҵ�����, �ʵ�����): reflection
		//Class cls = camera.getClass();
		//System.out.println(cls.getNAme());
		
		int price = camera.getPrice();
		System.out.println(price);
		camera.showInfo();
		
		
		int discountPrice = camera.calcDiscountPrice(0.5f); //50% ����Ͽ� return; f�� �ڿ� ���� �� float��� �˷��ִ� ��
		System.out.println("���ΰ��� : " + discountPrice);
		
		
		/*
		 * Goods camera2 = new Goods(); Goods camera3 = new Goods(); Goods camera4 = new
		 * Goods();
		 * 
		 * Goods.showCount();
		 */
		
	
		
		
		
	}

}
