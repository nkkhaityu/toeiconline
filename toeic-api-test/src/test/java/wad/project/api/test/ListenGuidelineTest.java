package wad.project.api.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wad.project.core.dao.ListenGuidelineDao;
import wad.project.core.daoimpl.ListenGuidelineDaoImpl;

import java.util.HashMap;
import java.util.Map;

public class ListenGuidelineTest {

    ListenGuidelineDao listenGuidelineDao;
    @BeforeTest
    public void initData() {
        listenGuidelineDao = new ListenGuidelineDaoImpl();
    }

    @Test
    public void testFindByProperties() {
        ListenGuidelineDao listenGuidelineDao = new ListenGuidelineDaoImpl();
//        Object[] result = listenGuidelineDao.findByProperty(null, null, null, null, 2, 2);
    }

    @Test
    public void checkApiFindByProperty() {
        Map<String, Object> property = new HashMap<String, Object>();
        property.put("title", "Guideline 5");
        property.put("content", "Content Guideline 5");
        Object[] objects = listenGuidelineDao.findByProperty(property, null, null, null, null);
    }

}
