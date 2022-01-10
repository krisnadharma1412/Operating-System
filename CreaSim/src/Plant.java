
public class Plant extends Species{
	private String size, light;
	private double sizeMod, lightMod;
	
	public Plant(String size, String light, double sizeMod, double lightMod) {
		super();
		this.size = size;
		this.light = light;
		this.sizeMod = sizeMod;
		this.lightMod = lightMod;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public double getSizeMod() {
		return sizeMod;
	}

	public void setSizeMod(double sizeMod) {
		this.sizeMod = sizeMod;
	}

	public double getLightMod() {
		return lightMod;
	}

	public void setLightMod(double lightMod) {
		this.lightMod = lightMod;
	}

	@Override
	public double calculateSurvivalbility() {
		return (100/28) * getSizeMod() * getLightMod();
	}
	
	
}
