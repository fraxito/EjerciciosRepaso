
public class EjerciciosBasicosJava extends acm.program.ConsoleProgram{

	public void run(){
	
//		println(fiestaArdillas(30,false));
//		println(fiestaArdillas(60,false));
//		println(fiestaArdillas(60,true));
		
		println(multa(60,false));
		println(multa(66,false));
		println(multa(66,true));
	}
	
	private boolean fiestaArdillas (int bellotas, boolean finDeSemana){
		if (finDeSemana){
			return true;
		}
		if (bellotas >= 40 && bellotas <= 60) {
			return true;
		}
		
		return false;
	}
	
	private int multa (int velocidad, boolean cumpleaños){
		if (cumpleaños){
			velocidad = velocidad -5;
		}
		if (velocidad <= 60){
			return 0;
		}
		if (velocidad > 60 && velocidad <= 80){
			return 1;
		}
		else {
			return 2;
		}
		
	}
	
}
