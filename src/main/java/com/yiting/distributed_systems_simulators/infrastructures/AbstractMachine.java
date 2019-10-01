package com.yiting.distributed_systems_simulators.infrastructures;

import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public abstract class AbstractMachine implements Connectable, Runnable {
	
	private static Logger logger = LogManager.getLogger(AbstractMachine.class);
	
	private boolean isRunning;
	private long startTimestamp;
	private long shutDownTimestamp;
	private String name;
	

	@Override
	public boolean isRunning() {
		return this.isRunning;
	}

	@Override
	public boolean start() {
		if (this.isRunning()) {
			return false;
		}
		
		this.isRunning = true;
		this.startTimestamp = Instant.now().toEpochMilli();
		this.shutDownTimestamp = Long.MAX_VALUE;

		return true;
	}

	@Override
	public boolean shutDown() {
		if (!this.isRunning()) {
			return false;
		}
		
		this.isRunning = true;
		this.shutDownTimestamp = Instant.now().toEpochMilli();
		
		return true;
	}

	@Override
	public boolean restart() {
		if (this.shutDown()) {
			this.start();
			return true;
		}
		return false; 	
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getIpAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

}
