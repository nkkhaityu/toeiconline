package wad.project.core.web.utils;

import wad.project.core.service.impl.ListenGuidelineServiceImpl;
import wad.project.core.service.impl.RoleServiceImpl;
import wad.project.core.service.impl.UserServiceImpl;

public class SingletonServiceUtil {
    private static UserServiceImpl userServiceImpl = null;
    private static RoleServiceImpl roleServiceImpl = null;
    private static ListenGuidelineServiceImpl listenGuidelineServiceImpl = null;

    public static UserServiceImpl getUserDaoInstance() {
        if (userServiceImpl == null) {
            userServiceImpl = new UserServiceImpl();
        }
        return userServiceImpl;
    }

    public static RoleServiceImpl getRoleDaoInstance() {
        if (roleServiceImpl == null) {
            roleServiceImpl = new RoleServiceImpl();
        }
        return roleServiceImpl;
    }

    public static ListenGuidelineServiceImpl getListenGuidelineDaoInstance() {
        if (listenGuidelineServiceImpl == null) {
            listenGuidelineServiceImpl = new ListenGuidelineServiceImpl();
        }
        return listenGuidelineServiceImpl;
    }
}
