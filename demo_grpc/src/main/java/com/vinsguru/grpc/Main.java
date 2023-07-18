package com.vinsguru.grpc;

import com.vinsguru.io.FileServiceGrpc;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    private static final GRPCServer SERVER = new GRPCServer();
    private static final Executor EXECUTOR = Executors.newSingleThreadExecutor();
    private static  FileServiceGrpc.FileServiceStub fileServiceStub;
    public static void main(String[] args) {
        EXECUTOR.execute(SERVER::start);
        var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        fileServiceStub = FileServiceGrpc.newStub(channel);
    }
}
