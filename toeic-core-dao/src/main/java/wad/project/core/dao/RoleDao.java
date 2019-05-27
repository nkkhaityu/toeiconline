package wad.project.core.dao;

import wad.project.core.data.dao.GenericDao;
import wad.project.core.persistence.entity.RoleEntity;

import java.util.List;

public interface RoleDao extends GenericDao<Integer, RoleEntity> {
    List<RoleEntity> findByRoles(List<String> roles);
}
