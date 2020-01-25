import java.util.Scanner;

public class Mercedes extends Samochod {
	
	Scanner s = new Scanner(System.in);
	
	private int iloscKM;

	public Mercedes(String model, int rokProdukcji) {
		super("Mercedes", model, rokProdukcji);
		// TODO Auto-generated constructor stub
		
		boolean isOk = true;
		while (isOk) {
			System.out.print("Ile KM ma Twoj Merol? ");
			iloscKM = s.nextInt();
			if (iloscKM <= 50)
				System.out.println("Coœ posz³o nie tak...");
			else
				isOk = false;
		}
	}

	@Override
	public void silnikStart() {
		// TODO Auto-generated method stub
		System.out.println("\nEngine-start:");
		if(isOdpalony() == false) {
			if (iloscKM < 150)
				System.out.println("\tWrrrum! Pyr-pyr-pyr...");
			else
				System.out.println("\tWrrrrrrrrum, wrrrrrrrrum, wrrrrrrrrum! Mrrrrrrrr....");
			setCzyOdpalony(true);
		}
		else
			System.out.println("\tZZZzzzz!!!\n\tAlert! Engine actually works.");
	}
	
	@Override
	public void wyswietlDane() {
		System.out.println("Dane samochodu marki Mercedes: ");
		System.out.println("\tMarka: " + getModel());
		System.out.println("\tRok Produkcji: " + getRokProdukcji());
		System.out.println("\tIlosc KM: " + getIloscKM());
	}

	public int getIloscKM() {
		return iloscKM;
	}
}
