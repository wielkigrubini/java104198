
public abstract class Samochod {
	private String marka;
	private String model;
	private int rokProdukcji;
	private boolean odpalony = false;
	
	public Samochod(String marka, String model, int rokProdukcji) {
		this.marka = marka;
		this.model = model;			
		this.rokProdukcji = rokProdukcji;
	}
	
	public abstract void silnikStart(); 
	
	public abstract void wyswietlDane();
	
	public void silnikZgas() {
		if (isOdpalony() == true)
			System.out.println("Engine-off");
		else
			System.out.println("Przecie¿ jest wy³¹czony...");
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public boolean isOdpalony() {
		return odpalony;
	}

	public void setCzyOdpalony(boolean odpalony) {
		this.odpalony = odpalony;
	}
	
	
}
