package chapter02;

public class GoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		goods.setName("nikon");
		goods.setPrice(44000);
		goods.setCountSold(100);
		goods.setCountStock(50);
	
		goods.showInfo();
		
		System.out.println(goods.calcDiscountPrice(0.3f)); //그냥 리터럴로 쓰면 double로 알기때문에 f를 붙여서 플로우트라고 말해준다.
 		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
	
		System.out.println(Goods.countOfGoods);
	}
}
