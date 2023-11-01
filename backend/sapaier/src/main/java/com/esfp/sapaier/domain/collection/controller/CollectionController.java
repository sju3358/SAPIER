package com.esfp.sapaier.domain.collection.controller;

import com.esfp.sapaier.domain.collection.service.CollectionService;
import com.esfp.sapaier.domain.collection.service.dto.request.CreateCollectionRequest;
import com.esfp.sapaier.domain.collection.service.dto.request.ModifyCollectionRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/collection")
@RestController
public class CollectionController {

    private final CollectionService collectionService;

    @PostMapping
    public ResponseEntity<Object> registCollectionDocument(@RequestBody CreateCollectionRequest createCollectionRequest){
        collectionService.createCollectionDocument(createCollectionRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> collectionList() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

   @PatchMapping
    public ResponseEntity<Object> modifyCollection(@RequestBody ModifyCollectionRequest modifyCollectionRequest){
        collectionService.modifyCollection(modifyCollectionRequest);
        return new ResponseEntity<>(HttpStatus.OK);
   }
}