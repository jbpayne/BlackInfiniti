package com.tts.BlackInfiniti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.tts.BlackInfiniti.Vehicle;

@Service
public class InitApplicationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(InitApplicationService.class);

	@Autowired
	VehicleService vehicleService;

	@Autowired
	ClientService clientService;

	@Autowired
    SaleRequestService saleRequestService;

	@EventListener(ApplicationReadyEvent.class)
	public void initializeTestData() {
		LOGGER.info("Initialize test data");
		
		vehicleService.saveVehicle(new Vehicle(37450, 39660, 2019, "Infiniti", "Q50", "Black", "JN8AY4ND7G3DS9CH2", "CAR", false, 0, 0));
		vehicleService.saveVehicle(new Vehicle(37450, 39660, 2019, "Infiniti", "Q50", "Silver", "JN8C8865712F6VH21", "CAR", false, 0, 0));
		vehicleService.saveVehicle(new Vehicle(39200, 42350, 2020, "Infiniti", "Q50", "Blue", "JN8AY4N297238GG23", "CAR", true, 36, 12000));
		vehicleService.saveVehicle(new Vehicle(59320, 62667, 2019, "Infiniti", "Q60", "Red", "JN8A888SN66C279CF", "CAR", false, 0, 0));
		vehicleService.saveVehicle(new Vehicle(59320, 62667, 2019, "Infiniti", "Q60", "Purple", "JN8AY4HH333LJLK23", "CAR", true, 36, 12000));
		vehicleService.saveVehicle(new Vehicle(61420, 64200, 2020, "Infiniti", "Q60", "Grey", "JN8AY4NJD774DHJ232", "CAR", true, 36, 12000));

		clientService.saveClient(new Client("Abraham", "Lincoln", "555-867-5309", "HonestAbe@wh.gov", "1600 Pennsylvania Avenue"));
		clientService.saveClient(new Client("George", "Washington", "555-704-1776", "Georgie@wh.gov", "1 Delaware Crossing"));

		saleRequestService.saveSaleRequest(new SaleRequest(1L, "Abraham", "Lincoln", "555-867-5309", "HonestAbe@wh.gov", "1600 Pennsylvania Avenue", "FullSale", 4L, 61420, 64200, 2020, "Infiniti", "Q60", "Grey", "JN8AY4NJD774DHJ232", "CAR", true, true, 36, 12000));
		saleRequestService.saveSaleRequest(new SaleRequest(2L, "George", "Washington", "555-704-1776", "Georgie@wh.gov", "1 Delaware Crossing", "FullSale", 1L, 37450, 39660, 2019, "Infiniti", "Q50", "Black", "JN8AY4ND7G3DS9CH2", "CAR", true, false, 0, 0));
		
		LOGGER.info("Initialization completed");
	}

}