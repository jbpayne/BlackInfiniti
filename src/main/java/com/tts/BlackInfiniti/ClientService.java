package com.tts.BlackInfiniti;

import java.util.List;
import java.util.Optional;

import com.tts.BlackInfiniti.Client;

public interface ClientService {

    List<Client> findAll();

    Optional<Client> findOne(Long id);

    Client saveClient(Client client);

    void deleteClient(Long id);

}