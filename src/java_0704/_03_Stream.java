package java_0704;

import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class _03_Stream {
    public static void main(String[] args) throws IOException {//throws IOException = 테스트
        
       OutputStream out = new FileOutputStream("data.dat"); // data.dat = 파일명
        out.write(7);
        out.close();
        
        
        InputStream in = new FileInputStream("data.dat");
        int dat = in.read();
        in.close();

        System.out.println(dat);   
    }
}