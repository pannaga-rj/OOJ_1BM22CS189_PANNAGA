class Q {
    int n;
    boolean val = false;

    synchronized int get() {
        while (!val) {
            try {
                System.out.println("Consumer Waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception Caught");
            }
        }
        System.out.println("Got: " + n);
        val = false;
        //System.out.println("Inimate Producer");
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (val) {
            try {
                //System.out.println("Producer Waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        val = true;
        System.out.println("Put: " + n);
        //System.out.println("Inimate Consumer");
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i < 15)
            q.put(i++);
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("Consumed: " + q.get());
            i++;
        }
    }
}

class Lab10 {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Ctrl-C to stop");
    }
}
