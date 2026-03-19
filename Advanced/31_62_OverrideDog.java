package demo;

public class OverrideDog extends OverrideAnimal {

	// 給人看的
	@Override
	public void 呼吸() {
		System.out.println("用肺呼吸");

		super.呼吸();
	}

}
