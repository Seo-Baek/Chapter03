package chapter03;

public class Goods {
	public static int count; // new�� �ʿ䰡 ���� ��¥ ����
	
	public Goods() {
		Goods.count += 1;
		
	}
	
	
	
	public static void showCount() {
		System.out.println(Goods.count);
		//static �� static�� �����Ѵ�. ���Ƕ�����
	}
	
	private String name;
	//���������� 3���� �˾ƾ� �� ��
	//public 
	//private �ٱ����� ������ ����
	//protected
	private int price;
	private int countStock;	//7:26Ȯ��
	private int countSold;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			this.price = 0;
		} else {
		this.price = price; //this �ڱ��ڽ� ���� ����
		}
	}	
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
	public void showInfo () {
		
		System.out.println(
			"��ǰ�̸� : " + name + 
			", ���� : " + price + 
			", ����� : " + countStock +
			", �ȸ����� :" + countSold);  // private �ڱ�Ŭ���� �ȿ����� ������ ������!
		
	}
	
	//public Goods() {
	//}						�ڵ����� �־��ִ� ��! <GoodsApp new Goods(); ����
	
	
	
	

}
