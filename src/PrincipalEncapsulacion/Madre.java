package PrincipalEncapsulacion;

public class Madre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cohce auto = new cohce();
		 
		System.out.println(auto.dime_largo());
		
		System.out.println("---------------------------");
		System.out.println(auto.datos_generales());
		
		System.out.println("---------------------------");
		
		auto.cambiar_ruedas(5);
		
	}

}
