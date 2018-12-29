package chapter02;

public class TV {
	private boolean power; //파워꺼지면 채널이나 볼륨올라가거나 내려가면안되제
	private int channel;   //0~50 
	private int volume;    //0~50
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
	  if(power) {	
		  if( channel > 50 ) {
			this.channel = 0;
		}else if(channel < 0 ){
			this.channel= 50;
		}else {
			 this.channel = channel;	
		}
	  
	  }else {
		  System.out.println("TV가 꺼져있습니다.");
	  }
	 
	}
	
	public void channel(boolean up) {
		channel( up? channel+1: this.channel-1 );
	}
	
	public void volume(int volume) {
	  if(power) {		
		if( volume > 50 || volume < 0 ) {
			this.volume = 0;
		}else {
			this.volume = volume;
		}
	  }else {
		  System.out.println("TV가 꺼져있습니다.");
	  }
	}
	public void volume(boolean up) {
		volume( up? this.volume+1 : this.volume-1 );
	}
	
	
	public void status() {
		System.out.println("TV[power=" + power +", channel=" + channel + ", volume="+ volume + "]");
	}
}
