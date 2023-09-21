
public class Item {

	private String name;
	private int price;
	
	//コンストラクタを作成
	public Item(String string, int i) {
		this.name = string;
		this.price = i;
	}
	
	//displayメゾットを作成
	public void display () {
		System.out.println(this.name + ":" + this.price + "円");
	}
}