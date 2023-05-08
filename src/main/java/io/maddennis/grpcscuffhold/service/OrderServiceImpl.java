package io.maddennis.grpcscuffhold.service;

import io.grpc.stub.StreamObserver;
import io.maddennis.grpcscuffhold.repository.OrderRepository;
import io.maddennis.order.IdOrderRequest;
import io.maddennis.order.OrderResponse;
import io.maddennis.order.OrderServiceGrpc;
import io.maddennis.order.UserOrdersRequest;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@RequiredArgsConstructor
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    private final OrderRepository orderRepository;

    @Override
    public void fetchOrderById(IdOrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        super.fetchOrderById(request, responseObserver);
    }

    @Override
    public void fetchUserOrdersById(UserOrdersRequest request, StreamObserver<OrderResponse> responseObserver) {
        super.fetchUserOrdersById(request, responseObserver);
    }
}
