package org.cap.dao;

import org.cap.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("pilotDbDao")
@Transactional
public interface IPilotDBDao extends JpaRepository<Pilot,Integer> {

}
