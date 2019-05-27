package wad.project.core.service.utils;

import wad.project.core.daoimpl.ListenGuidelineDaoImpl;
import wad.project.core.daoimpl.RoleDaoImpl;
import wad.project.core.daoimpl.UserDaoImpl;

public class SingletonDaoUtil {
    private static UserDaoImpl userDaoImpl = null;
    private static RoleDaoImpl roleDaoImpl = null;
    private static ListenGuidelineDaoImpl listenGuidelineDaoImpl = null;

    public static UserDaoImpl getUserDaoInstance() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }

    public static RoleDaoImpl getRoleDaoInstance() {
        if (roleDaoImpl == null) {
            roleDaoImpl = new RoleDaoImpl();
        }
        return roleDaoImpl;
    }

    public static ListenGuidelineDaoImpl getListenGuidelineDaoInstance() {
        if (listenGuidelineDaoImpl == null) {
            listenGuidelineDaoImpl = new ListenGuidelineDaoImpl();
        }
        return listenGuidelineDaoImpl;
    }
}