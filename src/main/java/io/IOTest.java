package io;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        File file;
//        Writer writer = new FileWriter("C:\\Users\\Administrator\\Desktop\\ABC.txt", true);
//        writer.append("老王");
//        writer.close();


        Reader reader = new FileReader("C:\\Users\\Administrator\\Desktop\\ABC.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = null;
        // 逐行读取信息
        while (null != (str = bufferedReader.readLine())) {
            System.out.println(str);
        }
        bufferedReader.close();
        reader.close();
    }
}
