package demo2;

public class OneNumberException extends Exception {//功能內部
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5057625222253599915L;

	public OneNumberException(Exception e) {
		super("輸入數值有問題");
	}

	public OneNumberException(String message, Throwable cause) {
		super("輸入數值有問題", cause);
		
	}

	
	
}
