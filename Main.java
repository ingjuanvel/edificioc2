package edificio;

import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		
		//Se inicializan los espacios para las 20 habitaciones del apartamento
		Habitacion[][] matriz=new Habitacion[5][4];
		
		//Se crearon los objetos "Materiales" del edificio
		Material hormigonR = new Material(17.0,"Hormigon revocado");
		Material ladrilloP= new Material(20.0,"Ladrillo pintado");;
		Material ventana = new Material(9.58,"Ventana de vidrio");;
		Material puertaM= new Material(10.45,"Puerta de madera");;
		
		Material[] paredes= {ventana,ventana,ladrilloP,puertaM};
		
		String[] adyacencia=new String[3];
		
		int cont=0;
		for (int i = 1; i <= 20; i++) {
			Habitacion habi=new Habitacion(paredes,hormigonR,hormigonR,("Habitacion "+i+ " (ubicada en el Piso " + (cont+1)+")"));
			
			if((i+1)%2==0) {
				adyacencia[0]="Habitacion "+(i+1) + " (ubicada en el Piso " + (cont+1)+")";
			}else {
				adyacencia[0]="Habitacion "+(i-1) + " (ubicada en el Piso " + (cont+1)+")";
			}
			if(i<5) {
				adyacencia[1]="Habitacion "+(i+4)+ " (ubicada en el Piso " + (cont+2)+")";
			}else if(i<16) {
				adyacencia[1]="Habitacion "+(i+4)+ " (ubicada en el Piso " + (cont+2)+")";
				adyacencia[2]="Habitacion "+(i-4)+ " (ubicada en el Piso " + (cont)+")";
			}else {
				adyacencia[2]="Habitacion "+(i-4)+ " (ubicada en el Piso " + (cont)+")";
			}
			habi.addAdyacencia(adyacencia);
			adyacencia=new String[3];
			
			matriz[cont][i-1-cont*4]=habi;
			if(i-cont*4==4) {
				cont++;
			}
		}
		
		
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int opcion=0;
		while(opcion>=0) {
			System.out.println("El edificio posee 20 habitaciones, "
					+ "\ndigite el numero de la habitacion de la cual desea obtener informacion (1 a 20)"
					+ "\nEn caso de desear terminar el programa digite un numero negativo");
			opcion=in.nextInt();
			if((opcion<1 || opcion>20) && opcion>=0) {
				System.out.println("El numero de habitacion digitado no es valido vuelva a intentarlo\n");
			}else{
				Habitacion habi=matriz[(int)Math.ceil((double)opcion/(double)4)-1][(int)(-(Math.ceil((double)opcion/(double)4))+1)*4+opcion-1];
				while(opcion>=0) {
					System.out.println("Si desea conocer las habitaciones adyacentes a la "+ habi.getNumero()+" digite 1"
							+ "\nSi desea conocer los materiales de los que se compone la "+ habi.getNumero()+" digite 2"
							+ "\nEn caso de desear retroceder el programa digite un numero negativo");
					opcion=in.nextInt();
					if(opcion<0) {
						opcion=0;
						break;
					}else if(opcion!=1 && opcion!=2 && opcion>=0) {
						System.out.println("La opcion digitado no es valida vuelva a intentarlo\n");
					}else if(opcion==1) {
						habi.getAdyacencia();
					}else {
						habi.getMateriales();
					}
					System.out.println();
				}
			}
		}
		
		
		
	}

}
