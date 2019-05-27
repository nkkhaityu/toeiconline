package wad.project.api.test;

import org.testng.annotations.Test;
import wad.project.core.dao.RoleDao;
import wad.project.core.daoimpl.RoleDaoImpl;
import wad.project.core.persistence.entity.RoleEntity;

public class ImportTest {

    @Test
    public void TestImport() {
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = roleDao.findEqualUnique("name", "USER");
        System.out.println(entity.getName());
    }
}
