package world;

public class Wand {
	private String name;
	private double power;
	
	public Wand(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name.length() < 3) {
			String msg = "名前が短いです。";
			throw new IllegalArgumentException(msg);
		}
		this.name = name;
	}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		if (power >= 0.5 && power <= 100.0) {
			this.power = power;			
		} else {
			String msg = "増幅率が0.5から100.0の範囲です。";
			throw new IllegalArgumentException(msg);
		}
	}
}
