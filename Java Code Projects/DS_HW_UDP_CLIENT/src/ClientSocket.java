

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.Date;



public class ClientSocket {	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		FileWriter myWriter = new FileWriter("/home/varigela/DS/output.txt"); 
		 //FileWriter myWriter = new FileWriter("/home/varigela/DS/output_2.txt");
		 //FileWriter myWriter = new FileWriter("/home/varigela/DS/output_3.txt"); 
		 int count=0;
		 
		while(count < 120) {
 
		 //InetAddress address = InetAddress.getByName("10.128.0.2");	
		   //InetAddress address = InetAddress.getByName("10.128.0.3");	
		 InetAddress address = InetAddress.getByName("10.172.0.2");
         DatagramSocket socket = new DatagramSocket();
         
         System.out.println("Clinet Sent Time = "+getTimeStamp());
         myWriter.write(getTimeStamp().replace(" ","")+" ");
         
         DatagramPacket request = new DatagramPacket(new byte[1], 1, address, 9999);
         socket.send(request);

         byte[] buffer = new byte[512];
         DatagramPacket response = new DatagramPacket(buffer, buffer.length);
         socket.receive(response);

         System.out.println("Client Received Time = "+getTimeStamp());
         myWriter.write(getTimeStamp().replace(" ","")+" ");
         
         buffer = response.getData();
         ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
         ObjectInput in = new ObjectInputStream(bis);
         ServerTimes st = (ServerTimes) in.readObject(); 
         
         
         
         System.out.println("Server Sent Time = "+st.tss);
         myWriter.write(st.tss.toString().replace(" ","")+" ");
         System.out.println("Server Received Time = "+st.tsr);
         myWriter.write(st.tsr.toString().replace(" ","")+" ");
         myWriter.write("\n");
         
         count++;
         Thread.sleep(60000);
         
		}
		
         
         myWriter.close();
	}
	
	public static String getTimeStamp() {
		
		Date date= new Date() ;
	    long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        
        return ts.toString();
		
	}
	
	

}

class ServerTimes implements Serializable {

	public Timestamp tsr;
	public Timestamp tss;
	
public ServerTimes() {
	
}
	
	
}
