class StarvationQ3 extends Thread {
    static int threadcount = 1;

    public void run() {
        System.out.println(threadcount + "Thread 1 is Starting ...");
        System.out.println("thread 1 is finishing ...");
        threadcount++;
    }

    public static void main(String[] args) {
        System.out.println(" thread 2 is starting");

        StarvationQ3 thread1 = new StarvationQ3();
        thread1.setPriority(9);
        StarvationQ3 thread2 = new StarvationQ3();
        thread2.setPriority(7);
        StarvationQ3 thread3 = new StarvationQ3();
        thread3.setPriority(5);
        StarvationQ3 thread4 = new StarvationQ3();
        thread4.setPriority(3);
        StarvationQ3 thread5 = new StarvationQ3();
        thread5.setPriority(1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("thread 2 is finishing");
    }
    }

}
