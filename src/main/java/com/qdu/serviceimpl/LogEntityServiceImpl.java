package com.qdu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdu.dao.LogEntityDao;
import com.qdu.pojo.Admin;
import com.qdu.pojo.LogEntity;
import com.qdu.service.LogEntityService;

@Transactional
@Service
public class LogEntityServiceImpl implements LogEntityService{

	@Autowired LogEntityDao logEntityDaoImpl;
	
	@Override
	public void saveLog(LogEntity logEntity) {
		logEntityDaoImpl.saveLog(logEntity);
	}
 
	@Override 
	public List<LogEntity> selectLog() {
		return logEntityDaoImpl.selectLog();
	}

	@Override
	public Admin selectAdminById(String adminId) {
		return logEntityDaoImpl.selectAdminById(adminId);
	}

}
