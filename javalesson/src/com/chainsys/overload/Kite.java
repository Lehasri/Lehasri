package com.chainsys.overload;

public class Kite {
	public static void main(String[] args) {
        Kite k=new Kite();
        k.fall(2);
        k.fall("2.30 pm");
        k.fly(100);
        k.fly(2.40, 30);
        k.fly(4, 50);
        k.fly(3, 77);
        
    }
	public void fly(int distance)
	{
		System.out.println("Fly1"+distance);
	}
	public void fly(double time,int speed)
	{
		System.out.println("Fly1"+time);
	}
	int fly(int time,int speed)
	{
		return time*speed;
	}
    public void fall(String time)
    {
    	System.out.println("Fall1"+time);
    }
    public int fall(int distance)
    {
    	System.out.println("Fall2"+distance);
    	return distance;
    }
    void glide(int time)
    {
    	System.out.println("Glide1"+time);
    }
    void glide(double time)
    {
    	System.out.println("glide 2"+time);
    }
}
