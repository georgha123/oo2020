public class Proov3Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		Arvutatav[] ad=new Arvutatav[4];
		ad[0]=new RingiPindala();
		ad[1]=new RistkylikuPindala(3);
		ad[2]=new RistkylikuPindala(8);
		ad[3] = new RisttahukaRuumala(3, 7);
		for(int i=0; i<ad.length; i++){
			kuva(ad[i]);
		}
	}
}