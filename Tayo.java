public class Tayo extends Animasi{
	
	public String bunyi;

	public Tayo(String namaKartun, String bunyi){
		super(namaKartun);		
		this.bunyi = bunyi;
	}

	public Tayo(String namaKartun){
		super(namaKartun);
	}


	public void showBunyi(){
		System.out.println(bunyi);
	}

}