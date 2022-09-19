import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String array[][] = new String[9][5];
		// E harfi 
		for(int i = 0; i < array.length; i++) {
			for(int j  = 0; j < array[i].length; j++) {
				if (i == 0 || i == 4 || i == 8) {
					array[i][j] = " * ";
				}
				else if (j == 0 || j == 5 || j == 9) {
					array[i][j] = " * ";
				}
				else {
					array[i][j] = "  ";
				}
			}
		}
		
        	for (String[] row : array){
            		for (String col : row){
                	System.out.print(col);
            	}
           	 System.out.println();
        	}
        	System.out.println("====================================");
        	// B Harfi
            String[][] letter = new String[7][4];

    		for(int i = 0; i < letter.length; i++) {
    			for(int j  = 0; j < letter[i].length; j++) {
    				if(i == 0 || i == 3 || i == 6) {
    					letter[i][j] = " * ";
    				}
    				else if(j == 0 || j == 3) {
    					letter[i][j] = " * ";
    				}
    				
    				else {
    					letter[i][j] = "    "; 
    				}
    			}
    		}
    		
            	for (String[] row : letter){
                		for (String col : row){
                    	System.out.print(col);
                	}
               	 System.out.println();
            	}
	}

}
