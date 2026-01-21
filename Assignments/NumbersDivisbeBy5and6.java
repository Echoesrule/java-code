public class NumbersDivisbeBy5and6 {
    public static void main(String[] args){
        int count=0;
        for(int numbers=100;numbers<=1000;numbers++){
            if(numbers%5==0&&numbers%6==0){
                System.out.print(numbers+" ");
                  count++;

                // when 10 numbers are printed, move to next line
                if (count % 10 == 0) {
                    System.out.println();
                }       
            }
         }
    }
}