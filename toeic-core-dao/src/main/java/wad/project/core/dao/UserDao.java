package wad.project.core.dao;

import wad.project.core.data.dao.GenericDao;
import wad.project.core.persistence.entity.UserEntity;

public interface UserDao extends GenericDao<Integer, UserEntity> {
    UserEntity isUserExist(String name, String password);
    UserEntity findRoleByUser(String name, String password);
}
