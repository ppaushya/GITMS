package org.cap.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.cap.model.Pilot;
import org.springframework.stereotype.Repository;

@Repository("pilotDao")
public class PilotImpl  implements IPilotDao{
	
	private static AtomicInteger pilotId=new AtomicInteger(1000);
	private static List<Pilot> pilots=dummyDB();
	
	private static List<Pilot> dummyDB(){
		List<Pilot> pilots=new ArrayList<>();
		
		pilots.add(new Pilot(pilotId.incrementAndGet(), "tom", true, 120000,LocalDate.of(1990, 2, 23)));
		pilots.add(new Pilot(pilotId.incrementAndGet(), "Jack", false, 4354353,LocalDate.of(1970, 2, 23)));
		pilots.add(new Pilot(pilotId.incrementAndGet(), "Jerry", false, 32432,LocalDate.of(1991, 6, 12)));
		pilots.add(new Pilot(pilotId.incrementAndGet(), "kamal", true, 898787,LocalDate.of(2000, 7, 9)));
		pilots.add(new Pilot(pilotId.incrementAndGet(), "Lee", false, 120000,LocalDate.of(1990, 2, 11)));
		pilots.add(new Pilot(pilotId.incrementAndGet(), "Annie", true, 123233,LocalDate.of(1987, 8, 21)));
		
		return pilots;
	}

	@Override
	public List<Pilot> getAllPilots() {
		
		return pilots;
	}

}
