package wad.project.core.service.impl;

import wad.project.core.dto.RoleDTO;
import wad.project.core.persistence.entity.RoleEntity;
import wad.project.core.service.RoleService;
import wad.project.core.service.utils.SingletonDaoUtil;
import wad.project.core.utils.RoleBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {

    public List<RoleDTO> findAll() {
        List<RoleEntity> entities = SingletonDaoUtil.getRoleDaoInstance().findAll();
        List<RoleDTO> dtos = new ArrayList<RoleDTO>();
        for (RoleEntity item : entities) {
            RoleDTO dto = RoleBeanUtil.entity2Dto(item);
            dtos.add(dto);
        }
        return dtos;
    }
}
