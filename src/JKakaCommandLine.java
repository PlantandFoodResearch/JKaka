import java.io.IOException;

import joinery.DataFrame;

public class JKakaCommandLine {
    public static void main ( String [] arguments ) throws IOException
    {
    	DataFrame<Object> res = JKaka.qry("experiment", "");
        System.out.println("Hello, world");
        System.out.println(res.columns());
    }
}
