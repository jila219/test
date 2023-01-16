public class arryasDEmo3 {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,45,50};
        //Write code to add all the numbers froom an array
        int sum= 0;
        for (int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
            System.out.println(sum);
        }
    }
}
