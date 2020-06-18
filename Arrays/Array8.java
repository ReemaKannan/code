public class Array8{
    public static void main(String[] args) {
        int arr[] = new int[args.length];
        int i = 0;
        int index = 0, index1 = 0;
        for(String a  : args){ 
            arr[i] = Integer.parseInt(a);
            if(arr[i] == 6) index = i;
            if(arr[i] == 7) index1 = i;
            i++;
        }
        int sum = 0;
        for(i = 0 ; i < args.length; i++){
            if((i >= index) && (i <= index1)) continue;
            else sum += arr[i];        
        }
        System.out.println(sum);
    }
}