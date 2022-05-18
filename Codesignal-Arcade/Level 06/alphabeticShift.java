/*
 * CODEFIGTHS - ARCADE LEVEL 07 - ALPHABETICSHIFT
 *
 * Source help:
 * https://www.javatpoint.com/java-string-getbytes
 * https://stackoverflow.com/questions/7655127/how-to-convert-a-char-array-back-to-a-string
 * https://stackoverflow.com/questions/1978933/a-quick-and-easy-way-to-join-array-elements-with-a-separator-the-opposite-of-sp
 * https://stackoverflow.com/questions/5328996/java-change-int-to-ascii
 * https://www.javatpoint.com/java-string-getbytes
 * http://javadevnotes.com/java-split-string-into-array-of-integers-example
 *
 * Given a string,replace each its character by the next one in the English
 * alphabet (z would be replaced by a).
 * 
 * For inputString = "crazy" , the output should be alphabeticShift(inputString)
 * = "dsbaz".
 *
 * Input/Output
 *
 * [execution time limit] 4 seconds (js)
 * [input]string inputString
 *
 * Non-empty string consisting of lowcase English characters.
 *
 * Guaranteed constraints:
 *
 * 1 <= inputString.length <= 10.
 *
 * [output]string
 *
 * The result string after replacing all of its characters
 *
 */
 
public class alphabeticShift {
    
   public static String alphabeticShiftMethod(String inputString){
   	
   	String stringArray = inputString;
	byte[] ASCII = stringArray.getBytes();	
	int x;
	int z = 122;
	int Z = 90;
	int[] intASCII = new int[ASCII.length];;
	char l;
	char[] charASCII = new char[intASCII.length];
	
    for(int i = 0;i < ASCII.length;i++){
   	 	x = ASCII[i];
   	 	if(x == z ||x == Z){
		intASCII[i] = x-25;
   	 	}else{
   	 	intASCII[i]	= x+1;
		}
	}
	
	for(int j = 0;j < intASCII.length;j++){
		l = (char) intASCII[j];
		charASCII[j] = l;
	}
   	
   	//String join = String.join("",charASCII.toString()); //Use String.join("") instead x.join()
   	String join = new String(charASCII);
   	
   	return join;
	}
    
    public static void main(String[] args) {

    System.out.println(alphabeticShiftMethod("CRAZY"));
    
    }
}
