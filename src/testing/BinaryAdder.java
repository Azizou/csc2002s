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
		else
			out[1] = 1;
		return out;

	}
	public static int[] fullAdder(int[] part, int carry_in){
		int[] res = {0,0};
		
		return res;
		
	}
	
	public int[] add(){
		int max = Math.max(Augend.length, Addend.length);
		int[] res = new int[Math.max(Augend.length, Addend.length) + 1];
		for(int i=0;i<max;i++){
			
		}
		return null;
	}
	
}
