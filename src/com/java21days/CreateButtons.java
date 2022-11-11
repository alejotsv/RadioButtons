package com.java21days;

public class CreateButtons {
    public static void main(String[] args) {
        String[] buttons = { "Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0" };
        String message = "Choose an output format for syndicated news items";
        RadioButtons buttonScreen = new RadioButtons("Choose an Output Format", buttons, message);
    }
}
