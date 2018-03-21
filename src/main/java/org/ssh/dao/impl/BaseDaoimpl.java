package org.ssh.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ssh.dao.BaseDao;

public class BaseDaoimpl<T> implements BaseDao<T>{

	@Resource
	private SessionFactory sf;
	@Override
	public List<T> select(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery  query = session.createSQLQuery(sql);
		List list =query.list();
		return list;
	}

}
