import java,util.scanner;

public class FindTriangularNumbers {
     
    int static startingNum , endingNum , result ;
    
    public static void findNumbers(int startingNum , int endingNum){
        for(int i= startingNum ; i<=endingNum ; i++){
            result = i*(i+1)/2 ;
            System.out.println("Triangular number of "+i+" is "+result) ;
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        startingNum = scan.nextInt() ;
        endingNum = scan.nextInt() ;
        
        findNumbers( startingNum , endingNum ) ;
    }
     
}
