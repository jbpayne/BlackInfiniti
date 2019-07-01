package com.tts.BlackInfiniti;


import com.tts.BlackInfiniti.Vehicle;
import com.tts.BlackInfiniti.VehicleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @Autowired
    VehicleService vehicleService;

	@Autowired
    ClientService clientService;

	@Autowired
    SaleRequestService saleRequestService;

    @RequestMapping(value="/inventory")
    public String vehicleList(Model model) {
        model.addAttribute("vehicleList", vehicleService.findAll());
        return "vehicleList";
    }

    @RequestMapping(value={"/vehicleEdit","/vehicleEdit/{stockNumber}"}, method = RequestMethod.GET)
    public String vehicleEditForm(Model model, @PathVariable(required = false, name = "stockNumber") Long stockNumber) {
        if (null != stockNumber) {
            model.addAttribute("vehicle", vehicleService.findOne(stockNumber));
        } else {
            model.addAttribute("vehicle", new Vehicle());
        }
        return "vehicleEdit";
    }

    @RequestMapping(value="/vehicleEdit", method = RequestMethod.POST)
    public String vehicleEdit(Model model, Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        model.addAttribute("vehicleList", vehicleService.findAll());
        return "vehicleList";
    }

    @RequestMapping(value="/vehicleDelete/{stockNumber}", method = RequestMethod.GET)
    public String VehicleDelete(Model model, @PathVariable(required = true, name = "stockNumber") Long stockNumber) {
        vehicleService.deleteVehicle(stockNumber);
        model.addAttribute("vehicleList", vehicleService.findAll());
        return "vehicleList";
    }

    @CrossOrigin
    @RequestMapping(value="/vehicles", produces="application/json", method = RequestMethod.GET)
    @ResponseBody
    public List<Vehicle> listVehicles() {
    	
    	return vehicleService.findAll();
    }

    @RequestMapping(value="/client")
    public String clientList(Model model) {
        model.addAttribute("clientList", clientService.findAll());
        return "clientList";
    }

    @RequestMapping(value={"/clientEdit","/clientEdit/{id}"}, method = RequestMethod.GET)
    public String clientEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            model.addAttribute("client", clientService.findOne(id));
        } else {
            model.addAttribute("client", new Client());
        }
        return "clientEdit";
    }

    @RequestMapping(value="/clientEdit", method = RequestMethod.POST)
    public String clientEdit(Model model, Client client) {
        clientService.saveClient(client);
        model.addAttribute("clientList", clientService.findAll());
        return "clientList";
    }

    @RequestMapping(value="/clientDelete/{id}", method = RequestMethod.GET)
    public String ClientDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
        clientService.deleteClient(id);
        model.addAttribute("clientList", clientService.findAll());
        return "clientList";
    }

    @CrossOrigin
    @RequestMapping(value="/clients", produces="application/json", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> listClients() {
    	
    	return clientService.findAll();
    }

    @RequestMapping(value="/saleRequestDelete/{ticketID}", method = RequestMethod.GET)
    public String SaleRequestDelete(Model model, @PathVariable(required = true, name = "ticketID") Long ticketID) {
        saleRequestService.deleteSaleRequest(ticketID);
        return "vehicleList";
    }

    @CrossOrigin
    @RequestMapping(value="/saleRequests", produces="application/json", method = RequestMethod.GET)
    @ResponseBody
    public List<SaleRequest> listSaleRequests() {
    	
    	return saleRequestService.findAll();
    }

}