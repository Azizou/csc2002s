package testing;

import javax.swing.*;
import java.awt.*;

import java.util.*;

public class BinaryAdder {
	
	
	private DigitalInput[] Augend;
	private DigitalInput[] Addend;
	
	
	public BinaryAdder(DigitalInput[] augend, DigitalInput[] addend) {
		Augend = augend;
		Addend  = addend; 
	}
	
	
	public static int[] addBits(int a, int b){
		
		int result = a + b;
		int[] out = {0,0};
		if(result==2){
			out[0] = 1;
		}
		else if(result ==1)
			out[1] = 1;
		return out;

	}
	public static int[] fullAdder(int[] part, int carry_in){
		int[] res = {0,0};
		int result = part[0] + part[1] + carry_in;
		if(result ==3){
			res[0] = 1;
			res[1] = 1;
		}
		else if(result==2){
			res[0] = 1;
			res[1] = 0;
		}
		else if (result = 1){
			res[1] = 1;
		} 
		
		return res;
		
	}
	
	public int[] add(){
		int max = Math.max(Augend.length, Addend.length);
		int[] res = new int[Math.max(Augend.length, Addend.length) + 1];
		int cin = 0;
		int[] bits = {0,0};
                     for(int i=max;i>0 ;i--){
                        bits = addBits(Augend[i],Addend[i]);
			bits = fullAdder(bits,cin)[0];
			res[i]  = bits[0];
			cin = bits[1];
		}
		return null;
	}
	
}
