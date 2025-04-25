package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.DataFile;
import com.example.Repository.MyRepoInterface;
@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	private MyRepoInterface myRepo;
	@Override
	public String save(DataFile datafile) {
		// TODO Auto-generated method stub
		DataFile r1= myRepo.save(datafile);
		return r1+"SAvED SuCCes";
	}

}
