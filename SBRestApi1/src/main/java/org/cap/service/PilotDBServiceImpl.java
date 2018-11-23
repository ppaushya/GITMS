package org.cap.service;

import java.util.List;

import org.cap.dao.IPilotDBDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pilotDbService")
public abstract class PilotDBServiceImpl implements IPilotService {
	
	@Autowired
	private IPilotDBDao pilotDbDao;

	@Override
	public List<Pilot> getAllPilots() {
		
		return pilotDbDao.findAll();
	}

	@Override
	public List<Pilot> createPilot(Pilot pilot) {
		
		pilotDbDao.save(pilot);
		return pilotDbDao.findAll();
	}

	@Override
	public List<Pilot> deletePilot(Integer pilotId) {
		// TODO Auto-generated method stub
		pilotDbDao.deleteById(pilotId);
		return pilotDbDao.findAll();
	}

}
