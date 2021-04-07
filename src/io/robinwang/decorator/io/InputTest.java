package io.robinwang.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/wangweishan/Documents/code/designPatten/src/io/robinwang/decorator/io/test.txt")
                    )
            );
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
