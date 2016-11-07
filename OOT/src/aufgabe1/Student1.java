package aufgabe1;
import java.time.LocalDate;
public class Student1 {
	


	
		private String name;
		private String vorname;
		private LocalDate geburtsdatum;
		private int matrikelnummer;
		private Adresse adresse;
		private int alter;
		
		public Student1(String name,String vorname,LocalDate geburtsdatum,int matrikelnummer){
			this(name,vorname,geburtsdatum,matrikelnummer,null);
			this.alter = altBerechnen();
		}
		
		public Student1(String name,String vorname,LocalDate geburtsdatum,int matrikelnummer,Adresse adresse){
			this.name = name;
			this.vorname = vorname;
			this.geburtsdatum = geburtsdatum;
			this.matrikelnummer = matrikelnummer;
			this.alter = altBerechnen();
		}
		
		
		private int altBerechnen(){
			LocalDate heute = LocalDate.now();
			int diffYear = heute.getYear() - geburtsdatum.getYear();
			boolean hatteGeburtstag = heute.getDayOfYear()>= geburtsdatum.getDayOfYear();
			if (hatteGeburtstag){
				alter = heute.getYear()-geburtsdatum.getYear();
			}else{
				alter = heute.getYear()-geburtsdatum.getYear()-1;
			}
			return alter;
		}
		
		public static int durchschnittsalterBerechnen(int[] alt){
			int sum = 0;
			
			for (int i = 0; i < alt.length; i++){
				sum = sum + alt[i];
			}
			int durchschnittAlter = sum / alt.length;
			
			return durchschnittAlter;
		}
		
		public int getAlter(){
			return alter;
		}
		

	    public static void main(String[] args){
	    	Student1 stu1 = new Student1("Paul","Mueller",LocalDate.of(1990,10,10),1511611);
	    	Student1 stu2 = new Student1("Alisa","Klaus",LocalDate.of(1988,9,10),1518800);
	    	Student1[] stu = {stu1,stu2};
	    	int[] alt = new int[stu.length];
	    	for(int i = 0; i < alt.length; i++){
	    		alt [i] = stu[i].getAlter();
	    	}
	    	for(int j = 0; j < alt.length; j++){
	    		System.out.println(alt[j]);
	    	}
	    	int durchschnitt = Student1.durchschnittsalterBerechnen(alt);
	    	System.out.println("Durchschnittsalter:"+durchschnitt);
	    }
	}





