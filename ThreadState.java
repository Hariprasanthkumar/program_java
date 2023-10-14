
class ABC implements Runnable {
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("LEO" + ThreadState.t1.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String argvs[]) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("Thalapathy Vijay,Lokesh kanagaraj Team ,Aniruth " + t1.getState());

        t1.start();

        System.out.println(
                "The first 10 min is more good dont missed,it was likely very advanced virtual " + t1.getState());
    }

    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        System.out.println("GVM character is in leo always nearby vijay " + t2.getState());
        t2.start();

        System.out.println("it was like dass & co " + t2.getState());

        try {

            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Almost the leo songs are released and reached to fans  " + t2.getState());

        try {

            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("The Remaing the two songs are unrelesed " + t2.getState());
    }

}