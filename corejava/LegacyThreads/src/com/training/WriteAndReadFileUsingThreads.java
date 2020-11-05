package com.training;
import java.util.*;
import java.util.concurrent.*;
public class WriteAndReadFileUsingThreads {

	public static void main(String[] args) {
		
	    BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	    ReaderThread reader = new ReaderThread(queue);
	    WriterThread writer = new WriterThread(queue);

	    new Thread(reader).start();
	    new Thread(writer).start();

	}
}
