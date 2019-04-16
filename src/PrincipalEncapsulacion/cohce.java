package PrincipalEncapsulacion;

public class cohce {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private int peso_total;
	private String color;
	private float precio;
	private boolean full_equipo;
	private boolean climatizador;
	private boolean asientos_cuero;
	
	// Construcctor
	public cohce(){
		ruedas=4;
		largo=6;
		ancho=3;
		motor=1800;
		peso_total=3500;
		full_equipo=false;
		asientos_cuero=false;
}
	
	//METODOS GETTER AND SETTER
	public String dime_largo(){// aqui no me permite en getter unir string con un dato nativo en INT
		return "El largo del choche es "+ largo;
	}
	
	public void establece_color(){
		color="azul";
	}
	
	public String dime_color(){
		return "El color de tu coche es "+color;
	}
	
	public String datos_generales(){
		return "El auto tiene: \n"+"Ruedas="+this.ruedas+"\nLargo="+this.largo+"\nAncho="+ancho+"\nMotor="+motor+"\nPeso="+peso_plataforma+"\nColor="+color;
	}
	
	public void cambiar_ruedas(int ruedas){
		if(this.ruedas==3){
			this.ruedas=ruedas;
		}else if(this.ruedas==4){
			System.out.println("El coche tiene las ruedas completas");// dentro del void podemos usar este tipo de mensajes.
		}
	}
	
	public void configura_fullEquipo(String full_equipo){
		if(full_equipo=="si"){
			this.full_equipo=true;
		}else{
			this.full_equipo=false;
		}
	}
	
	public String full_equipo(){
		if(this.full_equipo==true){
			return "El coche esta equipado o tiene full equipo";
		}else{
				return "El coche no es full equipo";
		}
	}
	
	public void configura_climatizador(String climatizador){// SETTER
		if(climatizador=="si"){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){// GETTER
		if(climatizador==true){
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}
	
	public void configura_asientosCuero(String asientos_cuero){//SETTER
		if(asientos_cuero=="si"){
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientosCuero(){
		if(climatizador==true){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche no tiene asientos de cuero";
		}
	}
	
	public String dime_pesoCoche(){// SETTER + GETTER
		int pesoCarroceria=500;
		peso_total=peso_plataforma+pesoCarroceria;
		
		if(asientos_cuero==true){
			peso_total=peso_total+50; 
		}
		
		if(climatizador==true){
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es "+peso_total;
	}
	
	public int precioCoche(){
		int precioFinal=10000;
		
		if(asientos_cuero==true){
			precioFinal=precioFinal+2000;
		}
		
		if(climatizador==true){
			precioFinal=precioFinal+1500;
		}
		
		return precioFinal;
	}

}
