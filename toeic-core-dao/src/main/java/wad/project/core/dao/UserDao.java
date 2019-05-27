package wad.project.core.dao;

import wad.project.core.data.dao.GenericDao;
import wad.project.core.persistence.entity.UserEntity;

import java.util.List;

public interface UserDao extends GenericDao<Integer, UserEntity> {
    Object[] checkLogin(String name, String password);
    List<UserEntity> findByUsers(List<String> names);
}