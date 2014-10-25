package fr.mrazerty31.azergrief;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Utils {
	static File log, error;
	
	public static void init() {
		log = new File(AzerGrief.instance.getDataFolder()+"/latest.log");
		error = new File(AzerGrief.instance.getDataFolder()+"/error.log");
	}
	
	public static void writeToLog(String s) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(log, true));
			bw.write(s + "\r\n");
			bw.flush();
			bw.close();
		} catch(IOException ioe) {
			try {
				ioe.printStackTrace(new PrintWriter(new File(AzerGrief.instance.getDataFolder()+"/error.log")));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	public static String getCurrentTime() {
	    Date cal = Calendar.getInstance().getTime();
	    cal.setHours(cal.getHours()+2);
	    return cal.toGMTString();
	}
	
	@SuppressWarnings("deprecation")
	public static String getHourTime() {
	    Date cal = Calendar.getInstance().getTime();
	    cal.toGMTString();
	    cal.setHours(cal.getHours()+2);
	    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    return sdf.format(cal);
	}
}
