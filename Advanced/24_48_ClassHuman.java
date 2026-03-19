package advanced;

public class ClassHuman {
	private int height;
	private double weight;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height > 100 && height < 200) {
			this.height = height;
		} else {
			System.out.println("高度錯誤");
			this.height = 150;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
