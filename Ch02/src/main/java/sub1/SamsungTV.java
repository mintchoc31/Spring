package sub1;

public class SamsungTV {
	
	private Speaker spk;

	public void powerOn() {
		System.out.println("SamsungTv powerOn...");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv powerOff...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soundDown() {
		spk.soundDown();
	}
}
