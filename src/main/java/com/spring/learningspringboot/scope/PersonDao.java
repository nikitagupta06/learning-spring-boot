package com.spring.learningspringboot.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDao {

	@Autowired
	private XmlJDBCConnection jdbcConnection;

	public XmlJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(XmlJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
