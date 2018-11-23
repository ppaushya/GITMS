package org.cap.controller;

import java.util.List;

import org.cap.model.Pilot;
import org.cap.service.IPilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class PilotDbController {
	
	@Autowired
	private IPilotService pilotDbService;
	
	
	@GetMapping("/pilots")
	public ResponseEntity<List<Pilot>> getAllPilots(){
		List<Pilot> pilots=pilotDbService.getAllPilots();
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Pilots Not available!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots,HttpStatus.OK);
	}
	
	@PostMapping("/pilots")
	public ResponseEntity<List<Pilot>> createPilots(
			@RequestBody Pilot pilot){
		List<Pilot> pilots=pilotDbService.createPilot(pilot);
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Pilots Not available!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deletepilot/{pilotId}")
	public ResponseEntity<List<Pilot>>deletpilot(
			@PathVariable("pilotId")Integer pilotId){
		List<Pilot> pilot= pilotDbService.deletePilot(pilotId);
		
		if(pilot==null)
			return new ResponseEntity("Sorry! Customer Id not available!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilot, HttpStatus.OK);
	}
	
	
}
