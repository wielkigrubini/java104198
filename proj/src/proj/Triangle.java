package proj;

public class Triangle {
	
	// Pola
	
	private double a,b,c; //miary dlugosci kolejnych bokow trojkata
	private double poleTrojkata; //pole trojkata
	private boolean czyProstokatny; //czy jest prostokatny
	private boolean czyRozwartokatny; //czy jest wypuk³y
	
	
	// Metody
	
	private boolean ifTriangle(double a, double b, double c) {
		if (((a + b) > c) && ((a + c) > b) && ((c + b) > a)) {
			return true;
		}
		else
			return false;
	}
	
	public Triangle(double a, double b, double c) {
			if (ifTriangle(a,b,c) == false)
				System.out.println("Trojkat o podanych bokach nie istnieje.");
			else {
				System.out.println("Stworzyles trojkat.");
				this.a = a;
				this.b = b;
				this.c = c;
			}
	}
	
	public void obliczaniePola() {
		if (ifTriangle(a,b,c) == false)
			System.out.println("Trojkat o podanych bokach nie istnieje.");
		else {
			double p = (this.a + this.b + this.c)/2;
			this.poleTrojkata = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
			System.out.println("Pole trojkata o podanych dlugosciach wynosi: " + this.poleTrojkata);
		}
	}
	
	public void podawanieDlugosciRosnaco() {
		if (ifTriangle(a,b,c) == false)
			System.out.println("Trojkat o podanych bokach nie istnieje.");
		else {
			double[] boki = {this.a, this.b, this.c};
			double temp;
			for(int i=0; i<boki.length-1; i++){
				if(boki[i]>boki[i+1]) {
					temp = boki[i+1];
					boki[i+1] = boki[i];
					boki[i] = temp;
				}
			}
			for(int i=0; i<boki.length; i++) {
				System.out.print(boki[i]+" ");
			}
		}
	}
	
	public void czyTrojkatProstokatny() {
		if (ifTriangle(a,b,c) == false)
			System.out.println("Trojkat o podanych bokach nie istnieje.");
		else {
			if ((Math.pow(this.a, 2) + Math.pow(this.b, 2) == Math.pow(this.c, 2)) || (Math.pow(this.c, 2) + Math.pow(this.b, 2) == Math.pow(this.a, 2)) || (Math.pow(this.a, 2) + Math.pow(this.c, 2) == Math.pow(this.b, 2))) {
				this.czyProstokatny = true;
			}
			else {
				this.czyProstokatny = false;
			}
			System.out.println("Czy trojkat prostokatny? " + this.czyProstokatny);
		}
	}
	
	public void czyTrojkatRozwartokatny() {
		if (ifTriangle(a,b,c) == false)
			System.out.println("Trojkat o podanych bokach nie istnieje.");
		else {
			if ((Math.pow(this.a, 2) + Math.pow(this.b, 2) < Math.pow(this.c, 2)) || (Math.pow(this.c, 2) + Math.pow(this.b, 2) < Math.pow(this.a, 2)) || (Math.pow(this.a, 2) + Math.pow(this.c, 2) < Math.pow(this.b, 2))) {
				this.czyRozwartokatny = true;
			}
			else {
				this.czyRozwartokatny = false;
			}
			System.out.println("Czy trojkat rozwartokatny? " + this.czyRozwartokatny);
		}
	}
	
	public static void main(String[] args) {
		Triangle prawidlowy = new Triangle(3,4,5);
		prawidlowy.obliczaniePola();
		prawidlowy.podawanieDlugosciRosnaco();
		prawidlowy.czyTrojkatProstokatny();
		prawidlowy.czyTrojkatRozwartokatny();
		
		Triangle nieprawidlowy = new Triangle(7,1,5);
		nieprawidlowy.obliczaniePola();
		nieprawidlowy.podawanieDlugosciRosnaco();
		nieprawidlowy.czyTrojkatProstokatny();
		nieprawidlowy.czyTrojkatRozwartokatny();
	}
}

