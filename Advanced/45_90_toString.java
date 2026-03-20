package demo2;

import java.math.BigDecimal;

//equals與hashCode的建立
public class Product {// 值類型物件，VO、POJO、DTO
	private Integer id;// 產品編號
	private String name;// 產品名稱
	private BigDecimal price;// 任意精度的十進制數字型態，產品價格
	private Integer qty;// 產品數量

	@Override
	public String toString() {//toString製作方式
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", qty=");
		builder.append(qty);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override // 覆寫父類別的 equals 方法
	public boolean equals(Object obj) { // 定義 equals 方法，參數是任意物件
		if (this == obj)
			return true; // 如果兩個物件參考指向同一個記憶體位置，直接回傳 true

		if (!(obj instanceof Product))
			return false; // 如果傳入的物件不是 Product 類型，則不可能相等

		Product other = (Product) obj; // 將傳入的物件轉型為 Product，方便後續比較

		if (id == null) { // 比較 id 欄位，先判斷當前物件的 id 是否為 null
			if (other.id != null)
				return false; // 如果當前物件的 id 為 null，但另一個物件的 id 不為 null，則不相等
		} else if (!id.equals(other.id))
			return false; // 如果兩個 id 都不為 null，但值不同，則不相等

		if (name == null) { // 比較 name 欄位，先判斷當前物件的 name 是否為 null
			if (other.name != null)
				return false; // 如果當前物件的 name 為 null，但另一個物件的 name 不為 null，則不相等
		} else if (!name.equals(other.name))
			return false; // 如果兩個 name 都不為 null，但值不同，則不相等

		return true; // 如果 id 與 name 都相等，則回傳 true
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
