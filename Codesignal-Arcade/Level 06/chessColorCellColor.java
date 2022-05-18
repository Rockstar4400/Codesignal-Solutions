/*
 *CODEFIGTHS - LEVEL 06 - CHESSBOARDCELLCOLOR
 *
 *Given two cells on the standard chess board, determine whether they have the same color or not.
 *
 *For cell1 = "A1" and cell2 = "C3", the output should be
 *chessBoardCellColor(cell1, cell2) = true.
 *
 *For cell1 = "A1" and cell2 = "H3", the output should be
 *chessBoardCellColor(cell1, cell2) = false.
 *
 *Input/Output
 *
 *[execution time limit] 3 seconds (java)
 *
 *[input] string cell1
 *
 *[input] string cell2
 *
 *[output] boolean
 *
 *true if both cells have the same color, false otherwise
 *
 */
 
public class chessColorCellColor {
    
    public static boolean chessColorCellColorMethod(String cell1,String cell2){
	
	//String[][] chessBoard = new String[8][8];
	
	
	if( cell1 == cell2){
	return true;
	}
	return false;
	}
    
    public static void main(String[] args) {
    	
    	System.out.println(chessColorCellColorMethod("Hola","Holas"));
    	
    }
}
