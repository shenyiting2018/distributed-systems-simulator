package com.yiting.distributed_systems_simulators.infrastructures;

public interface Runnable {
	
	/**
	 * Checking if a Runnable is running
	 * @return
	 */
	public boolean isRunning();
	
	/**
	 * Return true if run command succeed
	 * @return
	 */
	public boolean run();
	
	/**
	 * Return true if shut down successfully
	 * @return
	 */
	public boolean shutDown();
	
	public boolean restart();
}
