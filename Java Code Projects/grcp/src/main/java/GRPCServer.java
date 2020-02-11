import java.io.IOException;

import clockSync_1.clockService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//Server server = ServerBuilder.forPort(9000).addService(new clockService()).build();
		//Server server = ServerBuilder.forPort(9001).addService(new clockService()).build();
		Server server = ServerBuilder.forPort(9002).addService(new clockService()).build();
		
		server.start();
		
		
		server.awaitTermination();
		
	}

}
