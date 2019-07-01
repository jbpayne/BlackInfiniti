package com.tts.BlackInfiniti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.BlackInfiniti.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}