package aulasDioJava;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal atual : " +smartTv.canal);
		
		smartTv.mudarCanal(13);
		
		System.out.println("Canal atual : " +smartTv.canal);
		
		System.out.println("Volume atual : " +smartTv.volume);
		
		System.out.print("Tv ligada?" + smartTv.ligada);
		
		System.out.print("Canal atual: " + smartTv.canal);
		
		System.out.print("Volume atual: " + smartTv.volume);
		
			
	}
	
}
