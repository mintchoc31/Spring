package sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	
	@Autowired // 자동주입. inject 대신 사용? 
	private Speaker spk;

	public void powerOn() {
		System.out.println("LgTv powerOn...");
	}
	
	public void powerOff() {
		System.out.println("LgTv powerOff...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soundDown() {
		spk.soundDown();
	}
}
