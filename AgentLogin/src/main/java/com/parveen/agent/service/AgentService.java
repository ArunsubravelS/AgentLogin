package com.parveen.agent.service;

import com.parveen.agent.dto.AgentDto;
import com.parveen.agent.entity.AppResponse;

public interface AgentService {

	public AppResponse createData(AgentDto agentdto);
}
