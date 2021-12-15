package com.spring.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDao {

	@Autowired
	private ComponentJDBCConnection componentJdbcConnection;

	public ComponentJDBCConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJDBCConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

	
	
	
}
