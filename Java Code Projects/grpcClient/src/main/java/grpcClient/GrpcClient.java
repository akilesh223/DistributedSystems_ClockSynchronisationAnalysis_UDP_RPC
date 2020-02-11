package grpcClient;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.clockSync.ClockSync.reqTimeObj;
import io.grpc.clockSync.ClockSync.resTimeObj;
import io.grpc.clockSync.TimeComputeGrpc;
import io.grpc.clockSync.TimeComputeGrpc.TimeComputeBlockingStub;

public class GrpcClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//FileWriter myWriter = new FileWriter("D://AfterJoiningCUBoulder//output//output_RPC_tst.txt"); 
	//	FileWriter myWriter = new FileWriter("/home/varigela/DS/output_RPC.txt"); 
		FileWriter myWriter = new FileWriter("/home/varigela/DS/output_RPC_3.txt");
		
		int count=0;
		 
		while(count < 120) {
		
		
		//ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9000).usePlaintext().build();
		//ManagedChannel channel = ManagedChannelBuilder.forAddress("10.128.0.3",9001).usePlaintext().build();
		ManagedChannel channel = ManagedChannelBuilder.forAddress("10.172.0.2",9002).usePlaintext().build();
		
		//stubs - generate from proto files
		
		TimeComputeBlockingStub computeStub = TimeComputeGrpc.newBlockingStub(channel);
		
		reqTimeObj req = reqTimeObj.newBuilder().setClientSentTime(getTimeStamp()).build();
		
		resTimeObj res = computeStub.time(req);
		
//		System.out.println(res.getClientSentTime());
//		System.out.println(res.getServerRecdTime());
//		System.out.println(res.getServerSentTime());
//		System.out.println(getTimeStamp());
		
		 myWriter.write(res.getClientSentTime().replace(" ","")+" ");
		 
		 myWriter.write(getTimeStamp().replace(" ","")+" ");

		 myWriter.write(res.getServerSentTime().replace(" ","")+" ");
		
		 myWriter.write(res.getServerRecdTime().replace(" ","")+" ");
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
