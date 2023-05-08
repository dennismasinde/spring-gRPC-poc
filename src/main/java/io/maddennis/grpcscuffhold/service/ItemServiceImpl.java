package io.maddennis.grpcscuffhold.service;

import io.grpc.stub.StreamObserver;
import io.maddennis.grpcscuffhold.repository.ItemRepository;
import io.maddennis.item.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class ItemServiceImpl extends ItemServiceGrpc.ItemServiceImplBase {

    private final ItemRepository itemRepository;

    @Override
    public void fetchItemById(IdItemRequest request, StreamObserver<ItemResponse> responseObserver) {
        //itemRepository.findById(request.getId());
        //responseObserver.onNext(itemRepository.findById(request.getId()));
        responseObserver.onCompleted();
    }

    @Override
    public void fetchItemByName(NameItemRequest request, StreamObserver<ItemResponse> responseObserver) {
        super.fetchItemByName(request, responseObserver);
    }

    @Override
    public void fetchItemsByCategory(CategoryItemRequest request, StreamObserver<ItemResponse> responseObserver) {
        super.fetchItemsByCategory(request, responseObserver);
    }

    @Override
    public void updateItemById(UpdateItemByIdRequest request, StreamObserver<UpdateResponse> responseObserver) {
        super.updateItemById(request, responseObserver);
    }

    @Override
    public void updateItemByName(UpdateItemByNameRequest request, StreamObserver<UpdateResponse> responseObserver) {
        super.updateItemByName(request, responseObserver);
    }

    @Override
    public void countItemInStock(CountItemInStockById request, StreamObserver<ItemInStockResponse> responseObserver) {
        super.countItemInStock(request, responseObserver);
    }
}
