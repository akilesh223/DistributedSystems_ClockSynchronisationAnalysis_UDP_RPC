package clockSync_1;

import java.sql.Timestamp;
import java.util.Date;

import io.grpc.clockSync.ClockSync.reqTimeObj;
import io.grpc.clockSync.ClockSync.resTimeObj;
import io.grpc.clockSync.TimeComputeGrpc.TimeComputeImplBase;
import io.grpc.stub.StreamObserver;

public class clockService extends TimeComputeImplBase{

	@Override
	public void time(reqTimeObj request, StreamObserver<resTimeObj> responseObserver) {
		
		String client_sent_time = request.getClientSentTime();
		
		resTimeObj.Builder response= resTimeObj.newBuilder();
		
		response.setClientSentTime(client_sent_time);
		response.setServerRecdTime(getTimeStamp());
		response.setServerSentTime(getTimeStamp());
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
	
	//Utility Class
    public  String getTimeStamp() {
		
		Date date= new Date() ;
	    long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        
        return ts.toString();
		
	}
	

}
