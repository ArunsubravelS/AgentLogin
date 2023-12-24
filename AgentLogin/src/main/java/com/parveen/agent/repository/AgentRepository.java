package com.parveen.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parveen.agent.entity.Agent;

@Repository
public interface AgentRepository  extends JpaRepository<Agent, Long> {
	
	
	
	
	

}
