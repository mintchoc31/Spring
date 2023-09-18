package sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

	private CPU cpu;
	private RAM ram;
	
	// DI - Field Inject
	@Autowired
	private HDD hdd;
	
	// DI - Constructor Inject (생성자 인젝션)
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// 캡슐화된 멤버값을 바꿀 수 있는 setter?
	// ID - Setter Inject
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
	
}
