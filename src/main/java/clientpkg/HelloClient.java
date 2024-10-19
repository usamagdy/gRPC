package clientpkg;

import eg.learn.HelloWorld.APIRequest;
import eg.learn.HelloWorld.APIResponse;
import eg.learn.helloGrpc;
import eg.learn.helloGrpc.helloBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloClient {
	
	public static void main(String[] args) {
		ManagedChannel  channel =ManagedChannelBuilder.forAddress("localhost", 9876).usePlaintext().build();
		
		
		helloBlockingStub stub = helloGrpc.newBlockingStub(channel);
		APIRequest  req =APIRequest.newBuilder().setText("Osama").build();
		
		
		stub.message(req);
		
		
		APIResponse res = stub.message(req);
		
		
		System.out.println(res.getResponseCode());
		System.out.println(res.getTextResponse());
		
	}

}
