package com.zh.dao.impl;

import com.zh.dao.UserDao;
import com.zh.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository//标识dao层为spring bean
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    // 注入会话工厂对象
    @Resource
    public void setSF(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
    public User login(User user) {
        System.out.println("进入dao");
        String hql = "from User where uname = ? and pwd = ?";

        Session session = this.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

    //sadsad
        User u = (User) session.createQuery(hql).setParameter(0, user.getUname()).setParameter(1, user.getPwd()).uniqueResult();
        System.out.println("查询到"+u);
        transaction.commit();
        session.close();
        return u;
    }
    ///asdsada

    @Override
    public List<User> findAll() {

        List<User> list = (List<User>) this.getHibernateTemplate().find("from User ");

        return list;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int delete(int uid) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}
