package hipotenuza;

public class Stranice {

	private int x;
	private int y;

	public Stranice(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double hipotenuzaRezultat() {
		double d = Math.sqrt(x*x + y*y);
		return d;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
