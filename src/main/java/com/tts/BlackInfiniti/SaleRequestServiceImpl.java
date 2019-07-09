package com.tts.BlackInfiniti;

import com.tts.BlackInfiniti.SaleRequestRepository;
import com.tts.BlackInfiniti.SaleRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleRequestServiceImpl implements SaleRequestService {

    @Autowired
    private SaleRequestRepository saleRequestRepository;

    @Override
    public List<SaleRequest> findAll() {
        return saleRequestRepository.findAll();
    }

    @Override
    public SaleRequest findOne(Long ticketID) {
        return saleRequestRepository.findById(ticketID).get();
    }

    @Override
    public SaleRequest saveSaleRequest(SaleRequest saleRequest) {
        return saleRequestRepository.save(saleRequest);
    }

    @Override
    public void deleteSaleRequest(Long ticketID) {
        saleRequestRepository.deleteById(ticketID);
    }
}