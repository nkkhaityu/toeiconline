package wad.project.api.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import wad.project.core.dao.UserDao;
import wad.project.core.daoimpl.UserDaoImpl;
import wad.project.core.persistence.entity.UserEntity;

public class LoginTest {
    private final Logger log = Logger.getLogger(this.getClass());

//    @Test
//    public void checkIsUserExist() {
//        UserDao userDao = new UserDaoImpl();
//        String name = "admin";
//        String password = "admin";
//        UserEntity entity = userDao.isUserExist(name, password);
//        if (entity != null) {
//            log.error("Login success");
//        } else {
//            log.error("Login fail");
//        }
//    }
//
//    @Test
//    public void checkFindRoleByUser() {
//        UserDao userDao = new UserDaoImpl();
//        String name = "admin";
//        String password = "admin";
//        UserEntity entity = userDao.findRoleByUser(name, password);
//        log.error(entity.getRoleEntity().getRoleId() + "-" + entity.getRoleEntity().getName());
//    }

}
