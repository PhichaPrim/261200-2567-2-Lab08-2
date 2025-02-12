public class Main {
    public static void main(String[] args) {
        TurtleThread KrathongThread = new TurtleThread(0);
        TurtleThread MoonThread = new TurtleThread(1);
        TurtleThread WaveThread = new TurtleThread(2);

        KrathongThread.start();
        MoonThread.start();
        WaveThread.start();
    }
}
