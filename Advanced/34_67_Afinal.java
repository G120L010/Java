package a.a;

public final class Afinal { // 觀察3.：有無final的差別
	public 			int ia = 40;
	protected final int ib = 30; // 觀察1：有無final的差別
					int ic = 20;
	private 	    int id = 10;

	public final void name() { // 觀察2：有無final的差別
		System.out.println(ia);
		System.out.println(ib);
		System.out.println(ic);
		System.out.println(id);
	}
}
