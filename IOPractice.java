import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOPractice  {
    public static void main(String[] args) throws IOException {

        FileInputStream fls = new FileInputStream("C:\\Users\\Lenovo\\Documents\\testout.txt");
        FileInputStream fls1 = new FileInputStream("C:\\Users\\Lenovo\\Documents\\test.txt");
        SequenceInputStream sq = new SequenceInputStream(fls,fls1);
        int j = 0;
        while ((j=sq.read()) != -1){
            System.out.print((char)j);
        }
        sq.close();
        fls1.close();
        fls.close();

           // USING BUFFERED READER IN FILEOUTPUTSTREAM FOR EFFICIENCY
        FileOutputStream fl = new FileOutputStream("C:\\Users\\Lenovo\\Documents\\test.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fl);
        String st = "   hi rahul";
        byte[] by = st.getBytes();
        bout.write(by);
        bout.flush();
        bout.close();
        fl.close();
        System.out.println("suct");

        // Print the error message in red color
        System.err.println("error msg");

        // PRINT THE INPUT ON THE CONSOLE FROM THE GIVEN DESTINED FILE
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Documents\\testout.txt");
            //int i = fin.read();
            int i = 0;
            while ((i = fin.read()) != -1 ) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e){
            e.printStackTrace();
        }



        // FILE OUTPUT STREAM ONLY TO PRINT THE BYTES
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Lenovo\\Documents\\testout.txt");
            String s = "welcome rahul";
            byte[] b = s.getBytes(StandardCharsets.UTF_8);
            fout.write(b);
            fout.close();
            System.out.println("success");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        int i = System.in.read();
        System.out.println((char)i);

        try {
            FileOutputStream ft = new FileOutputStream("C:\\Users\\Lenovo\\Documents\\test.txt");
            ft.write(65);
            ft.close();
            System.out.println("sucess");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
