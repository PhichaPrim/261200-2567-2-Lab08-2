class TurtleThread extends Thread {
    private Turtle bob;
    private int id;

    public TurtleThread(int id) {
        this.id = id;
        this.bob = new Turtle();
    }

    @Override
    public void run() {
        if (id == 0) {
            drawKrathong();
        } else if (id == 1) {
            drawMoon();
        } else if (id == 2) {
            drawWave();
        }
    }

    private void drawKrathong() {
        bob.penColor("green");
        bob.home();
        bob.width(2);
        bob.forward(340);
        bob.backward(50);
        bob.right(90);
        bob.forward(50);
        bob.right(90);
        bob.forward(240);
        bob.right(90);
        bob.forward(50);
        bob.right(30);
        bob.forward(40);
        bob.right(120);
        bob.forward(40);
        for (int i = 0; i < 5; i++) {
            bob.left(120);
            bob.forward(40);
            bob.right(120);
            bob.forward(40);
        }
        bob.up();
        bob.home();
        bob.forward(170);
        bob.penColor("brown");
        bob.left(90);
        bob.down();
        bob.forward(50);
        bob.width(3);
        bob.penColor("orange");
        bob.forward(120);
        bob.penColor("red");
        bob.forward(4);
        bob.penColor("yellow");
        bob.forward(1);
    }

    private void drawMoon() {
        bob.up();
        bob.penColor("yellow");
        bob.setPosition(210,400 );
        bob.down();
        bob.right(90);
        bob.width(115);
        for (int i = 0; i < 360; i++) {
            bob.right(1);
            bob.forward(1);
        }
        bob.up();
    }


    private void drawWave() {
        bob.up();
        bob.width(3);
        bob.setPosition(-50, -25);
        bob.right(90);
        bob.penColor("blue");
        bob.down();
        for (int x = -50; x <= 390; x++) {
            int y = (int) (5 * Math.sin(x * 0.1) - 30);
            bob.setPosition(x, y);
        }
    }
}