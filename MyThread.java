public class MyThread implements Runnable {
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    public static void main(String argvs[]) {

        Runnable ob = new MyThread();

        Thread o = new Thread(ob, "leave me alone ");

        o.start();

        String str = o.getName();
        System.out.println(str);
    }
}