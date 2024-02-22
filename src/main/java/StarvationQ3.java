class StarvationQ3 extends Thread {
    static int threadcount = 1;

    public void run() {
        System.out.println(threadcount + "Thread 1 is Starting ...");
        System.out.println("thread 1 is finishing ...");
        threadcount++;
    }

    public static void main(String[] args) {

    }

}
