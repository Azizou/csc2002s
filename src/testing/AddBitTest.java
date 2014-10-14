package testing;

public class AddBitTest{
	
	public static void main(String[] args){
		DigitalInput[] A = new DigitalInput[8]; //8 bit binarry number;
		DigitalInput[] B = new DigitalInput[8]; //8 bit binarry number;
		int[] a = {1,0,1,0,0,1,0,1}; //10100101
		int[] b = {0,1,1,1,1,0,1,1}; //01111011
		for(int i=0; i<a.length;i++){
			A[i] = new DigitalInput(a[i]);
			B[i] = new DigitalInput(b[i]);
		}
		
		int[] res ;//= BinaryAdder.addBits(1, 1);
		for(int i=0;i<2;i++){
			
			for(int j=0;j<2;j++){
				res = BinaryAdder.addBits(i, j);
				System.out.println("Carry: " + res[0] + " and Sum is " +res[1]);
			}
		}
		
		System.out.println("Testin the Full adder");
		
		int[] full ;//= BinaryAdder.addBits(1, 1);
		int cin = 0;
		int[] from;
		for(int i=0;i<2;i++){
			
			for(int j=0;j<2;j++){
				from = BinaryAdder.addBits(i, j);
				
				full = BinaryAdder.fullAdder(from, cin);
				cin = full[0];
				System.out.println("Carry: " + full[0] + " and Sum is " +full[1]);
			}
		}
		
	}
}
