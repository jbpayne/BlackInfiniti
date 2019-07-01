package com.tts.BlackInfiniti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.BlackInfiniti.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}