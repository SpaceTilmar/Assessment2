package org.example;

public class Engine {
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                '}';
    }
}
