
public class gitTehtäväRyhmä4 {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		auto1.merkki = "Audi";
		auto1.malli = "A5";
		auto1.bensanMaara = 30;
		auto1.NaytaTiedot();

		auto1.Kiihdyta();
		auto1.NaytaTiedot();

	}//End of main
}	
	
class Auto {

	//Attribuutit
	public String merkki;
	public String malli;
	public int bensanMaara;
	public int tankkaus;

	//Metodit
	public void Jarruta () {

		System.out.println("Auto jarruttaa.");
	}

	public void Kiihdyta () {

		if (bensanMaara>0) {
			System.out.println("Auto kiihtyy.");
			bensanMaara = bensanMaara - 1;
		}
		else
		{
			System.out.println("Autossa ei ole polttoainetta.");
			System.out.println("Auto ei voi kiihdyttää.");
		}
	}

	public void NaytaTiedot () {

		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Auton bensan määrä: " + bensanMaara);
	}

	public void tankkaa()
	{
		tankkaus = 0;
		int bensaaTankissa = bensanMaara + tankkaus;
		System.out.println("Tankissa bensaa tankkauksen jälkeen " + bensaaTankissa + " litraa.")
	}


}
