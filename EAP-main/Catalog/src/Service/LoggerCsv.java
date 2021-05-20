package Service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class LoggerCsv {
	
	private static final String AUDIT_CSV = "audit.csv";
	
	private FileWriter csvWriter;
	
	public LoggerCsv() {
		try {
			this.csvWriter = new FileWriter(AUDIT_CSV, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void info(String funcName) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			this.csvWriter.append(funcName).append(",").append(timestamp.toString()).append("\n");
			this.csvWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
