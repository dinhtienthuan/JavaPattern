package test;

import builder.Computer;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(computer.getHDD());
    }
}
