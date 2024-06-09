class A extends Thread {
    public void run() {
        display();
    }

    public static synchronized void display() {
        int i;
        for (i = 0; i < 10; i++) {
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class sn1 {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
    }
}