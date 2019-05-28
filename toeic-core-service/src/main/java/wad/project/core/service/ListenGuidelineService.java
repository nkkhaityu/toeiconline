package wad.project.core.service;

import org.hibernate.exception.ConstraintViolationException;
import wad.project.core.dto.ListenGuidelineDTO;

import java.util.List;
import java.util.Map;

public interface ListenGuidelineService {
    Object[] findListenGuidelineByProperties(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    ListenGuidelineDTO findByListenGuidelineId(String property, Integer listenGuideLineId);
    void saveListenGuideline(ListenGuidelineDTO dto) throws ConstraintViolationException;
    ListenGuidelineDTO updateListenGuideline(ListenGuidelineDTO dto);
    Integer delete(List<Integer> ids);
}
