package chapter03;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	
	public void power (boolean power) {
		this.power = power;
		
	}
	
	
	public void channel (int channel) {
		if(!power) {
			return;
		}
		if(channel < 1) {
			channel = 255;
		} else if (channel > 255){
			channel = 1;
		}

		this.channel = channel;
	}
	public  void channel(boolean up) {
		channel ( channel + ( up ? 1 : -1));
	}

	
	public void volume (int volume) {
		if(!power) {
			return;
		}
		if(volume > 200) {
			volume = 0;
		}
		
		this.volume = volume;
	}
	public void volume(boolean up) {
//		if(up) {
//			volume(volume + 1);
//		} else {
//			volume(volume - 1);
//		}

		volume ( volume + ( up ? 1 : -1));
	}
	
	
	public void status() {
		System.out.println("TV[channel = " + channel + ",volume = " + volume + ", power = " + (power? "on" : "off") + "]");
		
	}

	
	
}
