import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 */
class MyThread implements Runnable{
	int count;
	static int class_count=0;
	public MyThread(int c){
		count =c;
	}
	@Override
	public void run(){
		int i=0;
		while(i++<10){
			this.addCount();
			System.out.println("nos" + this.count);
		}
		while(i++<15){
			this.addStaticCount();
			System.out.println("static" + class_count);
		}
	}
	public synchronized int addCount(){
		return ++count;
	}
	public static synchronized int addStaticCount(){
		return ++class_count;
	}
}
public class TestThread implements Runnable ,Serializable{
	ArrayList<Integer> list = new ArrayList<Integer>();
	int mode;
	int index =0;
	long start =0;
	long time =0;
	public TestThread(){
		for(int i=0;i<100;i++){
			list.add(i);
		}
		mode=0;
	}
	@Override
	public void run() {
		if(start ==0)
			start = System.nanoTime();
		if(mode==0){
			while (index < 100) {
				//System.out.println(Thread.currentThread().getName() + " " + index);
				list.add(22);
				index++;
			}
		}
		if(index==100)
			time = System.nanoTime()-start;
	}
	public static void main(String args[]){
		TestThread a = new TestThread();
		Thread t[] = new Thread[100];
		ExecutorService es = Executors.newFixedThreadPool(20);
		//MyThread mt = new MyThread(10);
		for(int i =0;i<5;i++){
			MyThread m = new MyThread(i);
			es.execute(m);
		}
		es.shutdown();
		List<Integer> list = new ArrayList<Integer>();
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});
		//ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor();
		//a.start = System.nanoTime();
		//ObjectInputStream out = new ObjectInputStream(new FileInputStream(""));
//		for(int i=0;i<t.length;i++){
//			t[i]=new Thread(a);
//			t[i].start();
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(a.time);
	}
}
