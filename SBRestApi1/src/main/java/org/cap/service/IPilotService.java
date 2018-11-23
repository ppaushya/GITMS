package org.cap.service;

import java.util.List;

import org.cap.model.Pilot;

public interface IPilotService {
	public List<Pilot> getAllPilots();
	public List<Pilot> createPilot(Pilot pilot);
	public List<Pilot> deletePilot(Integer pilotId);
}
