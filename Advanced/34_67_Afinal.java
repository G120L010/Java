package a.a;

public final class Afinal { // 觀察3
	public 			int ia = 40;
	protected final int ib = 30; // 觀察1
					int ic = 20;
	private 	    int id = 10;

	public final void name() { // 觀察2
		System.out.println(ia);
		System.out.println(ib);
		System.out.println(ic);
		System.out.println(id);
	}
}
