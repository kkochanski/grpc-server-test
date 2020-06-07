package test.object.controller;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class FirstController extends test.grpc.greet.GreetGrpc.GreetImplBase {

    @Override
    public void sayHelloAgain(test.grpc.greet.HelloRequest req, StreamObserver<test.grpc.greet.HelloReply> responseObserver) {
        test.grpc.greet.HelloReply reply = test.grpc.greet.HelloReply.newBuilder().setMessage("Hello Again ==> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
