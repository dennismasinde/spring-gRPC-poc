package io.maddennis.grpcscuffhold.service;

import io.grpc.stub.StreamObserver;
import io.maddennis.grpcscuffhold.repository.UserRepository;
import io.maddennis.user.IdUserRequest;
import io.maddennis.user.NameUserRequest;
import io.maddennis.user.UserResponse;
import io.maddennis.user.UserServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserRepository userRepository;

    @Override
    public void fetchUserById(IdUserRequest request, StreamObserver<UserResponse> responseObserver) {
        super.fetchUserById(request, responseObserver);
    }

    @Override
    public void fetchUserByName(NameUserRequest request, StreamObserver<UserResponse> responseObserver) {
        super.fetchUserByName(request, responseObserver);
    }
}
