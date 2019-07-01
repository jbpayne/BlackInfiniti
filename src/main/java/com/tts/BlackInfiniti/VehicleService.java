package com.tts.BlackInfiniti;

import java.util.List;
import java.util.Optional;

import com.tts.BlackInfiniti.Vehicle;

public interface VehicleService {

    List<Vehicle> findAll();

    Optional<Vehicle> findOne(Long stockNumber);

    Vehicle saveVehicle(Vehicle vehicle);

    void deleteVehicle(Long stockNumber);

}