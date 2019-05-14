package wad.project.controller.admin;

import wad.project.command.ListenGuidelineCommand;
import wad.project.core.dto.ListenGuidelineDTO;
import wad.project.core.web.common.WebConstant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/admin-guideline-listen-list.html")
public class ListenGuidelineController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ListenGuidelineCommand command = new ListenGuidelineCommand();
        List<ListenGuidelineDTO> listenGuidelineDTOS = new ArrayList<ListenGuidelineDTO>();
        ListenGuidelineDTO dto = new ListenGuidelineDTO();
        dto.setTitle("Listen Guideline 1");
        dto.setContent("Content Guideline 1");
        listenGuidelineDTOS.add(dto);
        ListenGuidelineDTO dto2 = new ListenGuidelineDTO();
        dto2.setTitle("Listen Guideline 2");
        dto2.setContent("Content Guideline 2");
        listenGuidelineDTOS.add(dto2);
        command.setListResult(listenGuidelineDTOS);
        command.setMaxPageItems(1);
        command.setTotalItems(listenGuidelineDTOS.size());
        request.setAttribute(WebConstant.LIST_ITEMS, command);

        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/listenguideline/list.jsp");
        rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
