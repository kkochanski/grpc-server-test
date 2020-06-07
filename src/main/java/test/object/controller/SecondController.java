package test.object.controller;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SecondController extends test.grpc.greet.GreetGrpc.GreetImplBase {

    @Override
    public void sayHello(test.grpc.greet.HelloRequest req, StreamObserver<test.grpc.greet.HelloReply> responseObserver) {
        test.grpc.greet.HelloReply reply = test.grpc.greet.HelloReply.newBuilder().setMessage("Hello ==> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
