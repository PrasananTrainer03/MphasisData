package com.java.day5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInfo {

    public void showFile() throws FileNotFoundException {
        FileInputStream fin = new FileInputStream("e:/hello.txt");
    }
    public static void main(String[] args) {

    }
}