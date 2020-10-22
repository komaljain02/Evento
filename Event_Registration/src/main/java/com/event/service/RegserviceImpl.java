package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.DAO.RegisterDAO;

@Service
public class RegserviceImpl implements Regservice{

	@Autowired
	private RegisterDAO registerdao; 
	
}
