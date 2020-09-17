package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PutStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\ABC.txt"));
        byte[] bytes = new byte[inputStream.available()];
        // 读取到 byte 数组
        inputStream.read(bytes);
        // 内容转换为字符串
        String content = new String(bytes, "UTF-8");
        inputStream.close();
        System.out.println(content);
    }

}

class outPutStream{
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\ABC.txt"),true);
        outputStream.write("老王".getBytes());
        outputStream.close();
    }

}


class fileRead{
    public static void main(String[] args) throws IOException {
        // 读取文件
        byte[] bytes = Files.readAllBytes(Paths.get("d:\\io.txt"));
        // 写入文件
        System.out.println(Files.exists(Paths.get("d:\\io.txt")));
        Files.write(Paths.get("d:\\io.txt"), "追加内容".getBytes(), StandardOpenOption.APPEND);
    }
}
