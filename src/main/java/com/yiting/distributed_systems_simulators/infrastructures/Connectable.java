package com.yiting.distributed_systems_simulators.infrastructures;

public interface Connectable {
	
	public boolean connect();
	
	public boolean disconnect();
	
	public int getIpAddress();
	
}
