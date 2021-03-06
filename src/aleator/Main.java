package aleator;

import java.util.Scanner;

import aleator.Generator;

public class Main {
    
    public static void main(String[] args) {
  
		Scanner scanner = new Scanner(System.in);
    	
    	System.out.print( "Introduce 1 pentru LCG sau 2 pentru MidSquare: " );
        int optiune = scanner.nextInt();
        
    	if(optiune == 2){
    		System.out.print( "Dati seed: " );
            int seedmidsq = scanner.nextInt();
            System.out.print( "Cate nr sa genereze: " );
            int nr = scanner.nextInt();
	        Generator ms = new MidSquare(seedmidsq);
	        System.out.println("MidSquare: ");
			System.out.println(ms.next());
			for (int i = 0; i < nr; i++) {
				System.out.println((float)ms.next());
	        }
    	}
		if(optiune==1){
			System.out.print( "Cate nr sa genereze: " );
	        int n = scanner.nextInt();	
	        System.out.print( "Dati seed: " );
	        int seed = scanner.nextInt();
	        System.out.print( "Dati a: " );
	        int a = scanner.nextInt();	
	        System.out.print( "Dati c: " );
	        int c = scanner.nextInt();	
	        System.out.print( "Dati m: " );
	        int m = scanner.nextInt();	
	        Generator lcg = new LCG(seed,a,c,m);
	        System.out.println("\nLCG: ");
	        System.out.println(lcg.next());
	        for (int i = 0; i < n; i++) {
	        	System.out.println((float)lcg.next());
	        }
		}
		scanner.close();
                
    }
}