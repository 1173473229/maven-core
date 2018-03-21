package org.ssh.dao;

import java.util.List;

public interface BaseDao<T> {
	
	List<T>select(String sql);

}
