package com.parveen.agent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parveen.agent.dto.AgentDto;
import com.parveen.agent.entity.Agent;
import com.parveen.agent.entity.AppResponse;
import com.parveen.agent.repository.AgentRepository;
import com.parveen.agent.util.EncryptDecrypt;

@Service
public class AgentServiceImpl implements AgentService{
	
	@Autowired
	AgentRepository agentRepository;
	
	@Override
	public AppResponse createData(AgentDto agentDto) {
		// TODO Auto-generated method stub
		EncryptDecrypt ec=new EncryptDecrypt();
		
		Agent agent=new Agent();
		agent.setAgentName(agentDto.getAgentName());
		agent.setPassword(ec.encrypt((agentDto.getPassword())));
		agent.setPhoneNo(agentDto.getPhoneNo());
		agent.setAddress(agentDto.getAddress());
		
		agentRepository.save(agent);
		
		return new AppResponse("Success", 200, agent, null);
	}

}
