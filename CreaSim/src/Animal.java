
public class Animal extends Species{
	private String size;
	private double lifespan, sizeMod;
	
	public Animal(String size, double lifespan, double sizeMod) {
		super();
		this.size = size;
		this.lifespan = lifespan;
		this.sizeMod = sizeMod;
	}

	
	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public double getLifespan() {
		return lifespan;
	}


	public void setLifespan(double lifespan) {
		this.lifespan = lifespan;
	}


	public double getSizeMod() {
		return sizeMod;
	}


	public void setSizeMod(double sizeMod) {
		this.sizeMod = sizeMod;
	}


	@Override
	public double calculateSurvivalbility() {
		return (100/1050) * getSizeMod() * getLifespan();
	}
	
	
	
}
