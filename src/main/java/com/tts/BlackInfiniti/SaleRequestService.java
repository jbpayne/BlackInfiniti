package com.tts.BlackInfiniti;

import java.util.List;
import java.util.Optional;

import com.tts.BlackInfiniti.SaleRequest;

public interface SaleRequestService {

    List<SaleRequest> findAll();

    Optional<SaleRequest> findOne(Long ticketID);

    SaleRequest saveSaleRequest(SaleRequest saleRequest);

    void deleteSaleRequest(Long ticketID);

}