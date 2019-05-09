package wad.project.core.service;

import wad.project.core.dto.UserDTO;

public interface UserService {
    UserDTO isUserExist(UserDTO dto);
    UserDTO findRoleByUser(UserDTO dto);
}
