package com.chainsys.unittest;

import com.chainsys.interfaces.InterfaceA;
import com.chainsys.interfaces.InterfaceCImpl;

public class TestInterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA.echo();
        InterfaceA a1=new InterfaceCImpl();
        a1.print();
        a1.print("Hello");
        
	}

}
