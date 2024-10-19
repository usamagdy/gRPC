package content;

import eg.learn.HelloWorld.APIRequest;
import eg.learn.HelloWorld.APIResponse;
import eg.learn.helloGrpc.helloImplBase;
import io.grpc.stub.StreamObserver;

public class MessageClass extends helloImplBase {

	@Override
	public void message(APIRequest request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		
		System.out.println("Message Received");
		
		APIResponse.Builder  response = APIResponse.newBuilder();
		response.setResponseCode(200);
		response.setTextResponse("Hello " +  request.getText());
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		super.message(request, responseObserver);
	}
	
	

}
