package org.cap.service;

import java.util.List;

import org.cap.dao.IPilotDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pilotService")
public abstract class PilotServiceImpl implements IPilotService{

	@Autowired
	private IPilotDao pilotDao;
	
	@Override
	public List<Pilot> getAllPilots() {
		
		return pilotDao.getAllPilots();
	}


}
