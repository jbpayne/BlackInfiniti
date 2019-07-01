package com.tts.BlackInfiniti;

import com.tts.BlackInfiniti.VehicleRepository;
import com.tts.BlackInfiniti.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> findOne(Long stockNumber) {
        return vehicleRepository.findById(stockNumber);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long stockNumber) {
        vehicleRepository.deleteById(stockNumber);
    }
}