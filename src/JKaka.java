

import java.io.IOException;
import joinery.DataFrame;

public class JKaka {
	public static String KakaUrl = "http://10.1.8.120:8001/qry/";;
	public static DataFrame<Object> qry(String realm, String qry) throws IOException{
		String url = JKaka.KakaUrl + realm + "/?qry=" + qry + "&infmt=python";
		final DataFrame<Object> frame = DataFrame.readCsv(url);
		return frame;
	}
}
