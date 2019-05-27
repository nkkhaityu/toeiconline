package wad.project.core.service.impl;

import wad.project.core.dto.UserDTO;
import wad.project.core.persistence.entity.UserEntity;
import wad.project.core.service.UserService;
import wad.project.core.service.utils.SingletonDaoUtil;
import wad.project.core.utils.UserBeanUtil;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    public UserDTO isUserExist(UserDTO dto) {
        UserEntity entity = SingletonDaoUtil.getUserDaoInstance().findUserByUsernameAndPassword(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }

    public UserDTO findRoleByUser(UserDTO dto) {
        UserEntity entity = SingletonDaoUtil.getUserDaoInstance().findUserByUsernameAndPassword(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }

    public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit) {
        Object[] objects = SingletonDaoUtil.getUserDaoInstance().findByProperty(property, sortExpression, sortDirection, offset, limit);
        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for (UserEntity item: (List<UserEntity>)objects[1]) {
            UserDTO userDTO = UserBeanUtil.entity2Dto(item);
            userDTOS.add(userDTO);
        }
        objects[1] = userDTOS;
        return objects;
    }

    public UserDTO findById(Integer userId) {
        UserEntity entity = SingletonDaoUtil.getUserDaoInstance().findById(userId);
        UserDTO dto = UserBeanUtil.entity2Dto(entity);
        return dto;
    }

    public void saveUser(UserDTO userDTO) {
        Timestamp createdDate = new Timestamp(System.currentTimeMillis());
        userDTO.setCreatedDate(createdDate);
        UserEntity entity = UserBeanUtil.dto2Entity(userDTO);
        SingletonDaoUtil.getUserDaoInstance().save(entity);
    }

    public UserDTO updateUser(UserDTO userDTO) {
        UserEntity entity = UserBeanUtil.dto2Entity(userDTO);
        entity = SingletonDaoUtil.getUserDaoInstance().update(entity);
        userDTO = UserBeanUtil.entity2Dto(entity);
        return userDTO;
    }
}
