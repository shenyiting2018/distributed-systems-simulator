package resources;

public class CPU {
	
	private final int numCore;
	
	public CPU(int numCore) {
		super();
		this.numCore = numCore;
	}
	
	public int getNumCore() {
		return numCore;
	}
	
	public static CPU createCPU(int numCore) {
		return new CPU(numCore);
	}

}
