package ch16.sec02;

public class Button {
	public static interface ClickListener{
		void onClick();
		
	}
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListner) {
		this.clickListener =clickListener;
		
	}
	public void click() {
		this.clickListener.onClick();
	}

}
