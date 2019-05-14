package wad.project.core.service.impl;

import wad.project.core.dao.UserDao;
import wad.project.core.daoimpl.UserDaoImpl;
import wad.project.core.dto.UserDTO;
import wad.project.core.persistence.entity.UserEntity;
import wad.project.core.service.UserService;
import wad.project.core.utils.UserBeanUtil;

public class UserServiceImpl implements UserService {
    public UserDTO isUserExist(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findUserByUsernameAndPassword(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }

    public UserDTO findRoleByUser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findUserByUsernameAndPassword(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }
}
