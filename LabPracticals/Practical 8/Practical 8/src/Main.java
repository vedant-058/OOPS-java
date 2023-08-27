import java.util.concurrent.atomic.AtomicInteger;

class CricketScore {

    private static final AtomicInteger score = new AtomicInteger(100);

    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                score.incrementAndGet();
                System.out.println("Server: Updated score to " + score);
            }
        });

        Thread clientThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Client: Read score as " + score);
            }
        });

        serverThread.start();
        clientThread.start();
    }
}