package com.chainsys.overload;

class Nokia extends Phone {
	public static void main(String args[])
	{
		Nokia ph=new Nokia();
		ph.makeACall();
		ph.sendSMS();
		ph.makeACall();
		
	}
		public void makeACall()
		{
			System.out.println("Call made from Nokia");
		}

		
    }


