package com.parveen.agent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter@Setter
	@Column(name="id")
	public long aId;

	@Getter@Setter
	@Column(name="agent_name")
	public String agentName;
	
	@Getter@Setter
	@Column(name="agent_address")
	public String address;
	
	@Getter@Setter
	@Column(name="phone_no")
	public String phoneNo;
	
	@Getter@Setter
	@Column(name="password")
	public String password;

}
