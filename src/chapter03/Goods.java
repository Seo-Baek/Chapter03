package chapter03;

public class Goods {
	public static int count; // new가 필요가 없음 진짜 변수
	
	public Goods() {
		Goods.count += 1;
		
	}
	
	
	
	public static void showCount() {
		System.out.println(Goods.count);
		//static 은 static만 접근한다. 편의때문에
	}
	
	private String name;
	//접근지시자 3가지 알아야 할 것
	//public 
	//private 바깥에서 접근을 못함
	//protected
	private int price;
	private int countStock;	//7:26확인
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
		this.price = price; //this 자기자신 안의 변수
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
			"상품이름 : " + name + 
			", 가격 : " + price + 
			", 재고개수 : " + countStock +
			", 팔린개수 :" + countSold);  // private 자기클래스 안에서는 접근이 가능함!
		
	}
	
	//public Goods() {
	//}						자동으로 넣어주는 것! <GoodsApp new Goods(); 관련
	
	
	
	

}
