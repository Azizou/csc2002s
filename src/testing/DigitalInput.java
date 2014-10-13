package testing;

public class DigitalInput {
	private static final int high = 1;
	private static final int low = 0;
	
	private int level;
	
	public DigitalInput() {
		this(low);
	}
	DigitalInput(int level){
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isLow() {
		return this.level == low;
	}
	
	public boolean isHigh() {
		return !isLow();
	}
}
