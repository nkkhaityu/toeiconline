package wad.project.api.test;

import org.testng.annotations.Test;
import wad.project.core.dao.ListenGuidelineDao;
import wad.project.core.dao.UserDao;
import wad.project.core.daoimpl.ListenGuidelineDaoImpl;
import wad.project.core.daoimpl.UserDaoImpl;

public class ListenGuidelineTest {

    @Test
    public void testFindByProperties() {
        ListenGuidelineDao listenGuidelineDao = new ListenGuidelineDaoImpl();
        Object[] result = listenGuidelineDao.findByProperty(null, null, null, null, 2, 2);
    }
}
