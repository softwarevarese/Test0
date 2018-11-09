
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		System.out.println("1) ");
		System.err.println("Change occurred. ");
		
		int  [] arr = {1,2,3,4,5,6};
        
        for(int i = 0; i<arr.length; i++ ) {
            System.out.println("Arr["+i+"] -> " + arr[i]);
        }
        
        for (int temp : arr) {
            System.out.println("Arr[foreach] -> " + temp);
        }
        
        System.out.println("Ho testato il for ed il for each");

	}

}
