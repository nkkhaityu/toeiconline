package wad.project.core.service.impl;

import wad.project.core.dao.ListenGuidelineDao;
import wad.project.core.daoimpl.ListenGuidelineDaoImpl;
import wad.project.core.dto.ListenGuidelineDTO;
import wad.project.core.persistence.entity.ListenGuidelineEntity;
import wad.project.core.service.ListenGuidelineService;
import wad.project.core.utils.ListenGuidelineBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class ListenGuidelineServiceImpl implements ListenGuidelineService {
    private ListenGuidelineDao listenGuidelineDao = new ListenGuidelineDaoImpl();
    public Object[] findListenGuidelineByProperties(String property, Object value, String sortExpression, String sortDirection, Integer offset, Integer limit) {
        List<ListenGuidelineDTO> result = new ArrayList<ListenGuidelineDTO>();
        Object[] objects = listenGuidelineDao.findByProperty(property, value, sortExpression, sortDirection, offset, limit);
        for (ListenGuidelineEntity item: (List<ListenGuidelineEntity>)objects[1]) {
            ListenGuidelineDTO dto = ListenGuidelineBeanUtil.entity2Dto(item);
            result.add(dto);
        }
        objects[1] = result;
        return objects;
    }
}
