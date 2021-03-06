package com.kossine.ims.repository.impl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.kossine.ims.models.Ram;
import com.kossine.ims.repository.RamRepo;
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RamRepoImpl extends GenericRepoImpl<Ram> implements RamRepo{
	public RamRepoImpl() {
		setClazz(Ram.class);
		
	}
	

}
