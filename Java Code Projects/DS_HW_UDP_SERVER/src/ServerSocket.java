
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;



public class ServerSocket {

	public static void main(String args[]) throws IOException {
		
		while(true) {
		
		 DatagramSocket socket = new DatagramSocket(9999);
		 byte[] buffer = new byte[512];
		 
		 
		 DatagramPacket request = new DatagramPacket(buffer,buffer.length);
         socket.receive(request);
         
         Timestamp ts = getTimeStamp();
         ServerTimes st = new ServerTimes();
         st.tsr = ts;
         
         InetAddress address = InetAddress.getByName("10.128.0.2");
         byte[] buffer2 = new byte[512];
         
         st.tss = getTimeStamp();
         
         
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         ObjectOutputStream out = new ObjectOutputStream(bos);   
         out.writeObject(st);
         out.flush();
         buffer2 = bos.toByteArray();
            
         
         DatagramPacket response = new DatagramPacket(buffer2,buffer2.length,address,request.getPort());
         socket.send(response);
         
         socket.close();
         
		}
		

	}
	
	public static Timestamp getTimeStamp() {
		
        
		/*
		 * Calendar cal = Calendar.getInstance();
		 * 
		 * Timestamp timestamp = new Timestamp(new Date().getTime());
		 * 
		 * cal.setTimeInMillis(timestamp.getTime()); cal.add(Calendar.HOUR, 0);
		 * timestamp = new Timestamp(cal.getTime().getTime());
		 * 
		 * 
		 * return timestamp;
		 */
		

		Date date= new Date() ;
	    long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        
        return ts;
		
		
	}
	
	

}



class ServerTimes implements Serializable {

	public Timestamp tsr;
	public Timestamp tss;
	
public ServerTimes() {
	
}
	
	
}


