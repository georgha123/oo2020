public class Proov2Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		kuva(new RingiPindala());
		kuva(new RisttahukaRuumala(4,6));
	}
}