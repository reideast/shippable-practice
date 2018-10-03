package net.andreweast;

public class RunMe {
    protected boolean status;

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        RunMe run = new RunMe(true);
    }

    public RunMe(boolean status) {
        this.status = status;
    }

    public int report() {
        if (status) {
            return 1;
        } else {
            return -1;
        }
    }
}
