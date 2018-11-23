package org.cap.controller;

import java.util.List;

import org.cap.model.Pilot;
import org.cap.service.IPilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PilotController {

	@Autowired
	private IPilotService pilotService;
	
	@GetMapping("/pilots")
	public ResponseEntity<List<Pilot>> getAllPilots(){
		
		List<Pilot> pilots=pilotService.getAllPilots();
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Pilots Not available!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots,HttpStatus.OK);
	}
	
}
