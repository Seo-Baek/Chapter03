package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//jvm�޸� ���� ã�ƺ��� evernote
		camera.setName("nikon");
		//camera.setPrice(400000);
		camera.setPrice(-10);
		camera.setCountStock(30);
		camera.setCountSold(50);  //setter and getter�� �ۺ��� ��������� ��������
		
		camera.showInfo();
		
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		Goods camera4 = new Goods();
		
		Goods.showCount();
		
		
	
		
		
		
	}

}
