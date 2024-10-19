package content;

import java.io.IOException;

import io.grpc.ServerBuilder;

public class Server {

	
	public static void main(String[] args) throws Exception {
		io.grpc.Server  server = ServerBuilder.forPort(9876).addService(new MessageClass()).build();
		
		server.start();
		System.out.println("server started");
		
		server.awaitTermination();
		
	}
}
