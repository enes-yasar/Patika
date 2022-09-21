import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	int rowNumber,colNumber,size;
	String[][] map;
	String[][] board;
	boolean game = true;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public MineSweeper(int rowNumber, int colNumber) {
		
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new String[rowNumber][colNumber];
		this.board = new String[rowNumber][colNumber];
		this.size = (rowNumber * colNumber);
		
	}
	public void run() {
		int row,col, succes = 0;
		prepareMap();
		print(map);
		System.out.println("Mayin tarlasina hosgeldiniz!");
		while(game) {
			print(board);
			System.out.print("Satir:");
			row = scan.nextInt();
			System.out.print("Sutun:");
			col = scan.nextInt();
			if (map[row][col] != "*") {
				checkMine(row,col);
				succes++;
				if (succes == (size - (size / 4))) {
					System.out.println("Tebrikler Kazandınız!");
					break;
				}
			}else {
				game = false;
				System.out.println("Kaybettiniz!");
			}
		}
	}
	public void checkMine(int r, int c) {
		int toplam = 0;
		if (board[r][c] == "-") {
			if ((c < colNumber-1) && (map[r][c+1] == "*")) {
			toplam++;
		}
		if ((r < rowNumber-1)&& (map[r+1][c] == "*")) {
			toplam++;
		}
		if ((r>0) && (map[r-1][c] == "*")) {
			toplam++;
		}
		if ((c>0)&&(map[r][c-1] == "*")) {
			toplam++;
		}
		if (board[r][c] == "-") {
			board[r][c] = String.valueOf(toplam);
		}
	}
		
	}
	
	public void prepareMap() {
		
		int ranRow,randCol,count=0;
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				board[i][j] = "-";
				map[i][j] = "-";
			}
		}
		while(count !=size/4) {
			ranRow = random.nextInt(rowNumber);
			randCol = random.nextInt(colNumber);
			if (map[ranRow][randCol] != "*") {
				map[ranRow][randCol] = "*";
				count++;
			}
		}
		
	}
	public void print(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
