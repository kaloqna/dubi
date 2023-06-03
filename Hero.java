import java.util.Scanner;
import java.util.ArrayList;
public class Hero {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList <Programa> h = new ArrayList<>();
		
             Programa champion = new Programa("Akali", "female", 19, "Assasian");
             Programa champion1 = new Programa();
             
             champion1.setName("Zoe");
             champion1.setSex("female");
             champion1.setAge(15);
             champion1.setRole("Mage");
             
             h.add(champion);
             h.add(champion1);
             h.get(0).damage=1400;
             h.get(0).enemies="Annie";
             h.get(0).inventar="Riftmaker";
             h.get(1).damage=1550;
             h.get(1).enemies="Akshan";
             h.get(1).inventar="Luden's Tempset";
             
           
             champion.koiIgrae(); 
             
             String st=scan.nextLine();
             if (st.equals("Акали")) { System.out.println("Ти избра:");
                System.out.println(champion.getName() + ", " + champion.getSex() + ", тя е на " + champion.getAge() + " години и е "+ champion.getRole());
                System.out.println("Силата й е: " + h.get(0).damage);
                System.out.println("Нейните врагове са: " + h.get(0).enemies);
                System.out.println("В инвентара си тя има: " + h.get(0).inventar);
           }
             if (st.equals("Зоуи")) { System.out.println("Ти избра:");
        	   System.out.println(champion1.getName() + ", " + champion1.getSex() + ", тя е на " + champion1.getAge() + " години и е "+ champion1.getRole());
        	   System.out.println("Силата й е: " + h.get(1).damage);
        	   System.out.println("Нейните врагове са: " + h.get(1).enemies);
        	   System.out.println("В инвентара си тя има: " + h.get(1).inventar);
           }
             
             System.out.println(); 
             champion.gotov();
             
             String str=scan.nextLine();
             if(str.equals("да")) {
             System.out.println(); 
             System.out.println("Нека започваме тогава, твоята задача е да убиваш миньони,");
             System.out.println("които ти дават пари, също трябва да се пазиш от враговете си,");
             System.out.println("ако успееш да събереш достатъчно пари можеш да си купиш ");
             System.out.println("втори item и да победиш врагът си, ");
             System.out.println("но бъди внимателен има доста капани! ");
             }
             System.out.println(); 
             System.out.println("Избери накъде да тръгнеш. Наляво или надясно");
             String s=scan.nextLine();
             if(s.equals("наляво")) {
            	 System.out.println(); 
            	 System.out.println("Браво! Ти избра верния път. Не ми се мисли ако беше избрал да тръгнеш надясно..");
            	 System.out.println("Ето я първата вълна от миньони, убий всички за да получиш 500 парички!");
            	 System.out.println("😈 😈 😈 😈 😈");
            	 System.out.println("Съвет: Използвай оръжието си за да ги убиеш, цъкни О");
            	 String а=scan.nextLine();
            	 if(а.equals("О")) {
            		 System.out.println("...........");
            		 System.out.println("Ти успя! +500 парички");
            	 }
            	 System.out.println();
            	 System.out.println("Време е за хапване. Избери какво ще ядеш: къпини или боровинки");
            	 String z=scan.nextLine();
            	 if(z.equals("къпини")) {
            		 System.out.println("Супер! Ти се наяде и продължи по пътя си.");
            	 }if(z.equals("боровинки")){ 
            		 System.out.println("О не! Тези боровинки бяха отровни и сега всичко ти се върти! Ти припадна. ");
            		 System.out.println("За твое щастие те намери една добродушна фея, която ти помогна да се излекуваш. ");
            		 System.out.println("Също така тя ти даде един ключ, но не ти каза къде и кога да го използваш");
            		 System.out.println("Ти й благодари и пое по пътя си");
            	 }
            		 System.out.println();
            		 System.out.println("В далечината се вижда една къщичка, ще влезнеш ли в нея?");
            		 String d=scan.nextLine();
                	 if(d.equals("да")) {
                		 System.out.println("Цялата къщичка е заобиколена от миньони, цъкни О за да ги убиеш");	
                		 System.out.println("😈 😈 😈 😈 😈");
                    	 String c=scan.nextLine();
                    	 if(c.equals("О")) {
                    		 System.out.println("...........");
                    		 System.out.println("Ти успя! +500 парички, вече имаш събрани 1000 парички");
                    		 System.out.println("Остават ти още толкова за да можеш да си купиш втория item");
                	 } 
            	 }
                	 
                	 
             }
             if(s.equals("надясно")) {
            	 System.out.println(); 
            	 System.out.println("О не! Ти попадна в първия си капан, един зъл трол те държи ");
            	 System.out.println("👹   ⛓️🧑🏻");            	 		
            	 System.out.println("казва ти, че ще те пусне само ако му прехвърлиш част от силата си");
            	 System.out.println(); 
            	 System.out.println("Ще му дадеш ли?");
            	 String е=scan.nextLine();
            	 if(е.equals("да")) {
            		 System.out.println(); 
            		 System.out.println("Правилен избор, ако не беше приел щеше да те превърне в жаба");
            	 }
            	 System.out.println(); 
            	 System.out.println("Ти му даде част от силата си и вече тя е 1300, бъди по-внимателен следващия път.");
            	 System.out.println("Все пак имаш за задача да убиеш най-големият си враг.");
            	 System.out.println(); 
            	 System.out.println("Вече си свободен, в далечината се виждат миньони, отиди да ги убиеш за да спечелиш малко парички");
            	 System.out.println("😈 😈 😈 😈 😈");
            	 System.out.println("Съвет: Използвай оръжието си за да ги убиеш, цъкни О");
            	 String b=scan.nextLine();
            	 if(b.equals("О")) {
            		 System.out.println("...........");
            		 System.out.println("Ти успя! +500 парички");
             }
            
	}
}
}