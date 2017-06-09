package com.sw.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sw.dao.UserDao;
import com.sw.domain.User;

/*
 *@Author swxctx
 *@time 2017��5��10��
 *@Explain:Dao��ʵ��
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	public User findUserByUsername(String username) {
		Session session=null;
		User user=new User();
		try {
			session=this.getHibernateTemplate().getSessionFactory().openSession();
			Criteria criteria=(Criteria) session.createCriteria(User.class);
			//����������ѯ
			criteria.add(Restrictions.eq("username", username));
			user=(User) criteria.uniqueResult();
		} finally {
			if(session!=null){
				session.close();
			}
		}
		return user;
	}

}
