package com.parveen.agent.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parveen.agent.constant.AgentConstant;
import com.parveen.agent.dto.AgentDto;
import com.parveen.agent.service.AgentServiceImpl;

@RestController
public class AgentController {
	
	@Autowired
	AgentServiceImpl agentServiceImpl;
	
	
	
	@PostMapping(value=AgentConstant.createData)
	public @ResponseBody void createData(@RequestBody AgentDto agentDto ) {
		agentServiceImpl.createData(agentDto);
	}
	
}
