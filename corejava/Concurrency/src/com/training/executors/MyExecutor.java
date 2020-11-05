package com.training.executors;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {

	@Override
	public void execute(Runnable command) {

		   Thread thread = new Thread(command);
		   thread.start();
	}

	
}
