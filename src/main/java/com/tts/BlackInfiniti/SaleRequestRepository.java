package com.tts.BlackInfiniti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.BlackInfiniti.SaleRequest;

@Repository
public interface SaleRequestRepository extends JpaRepository<SaleRequest, Long> {
}