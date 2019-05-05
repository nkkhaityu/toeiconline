package wad.project.command;

import wad.project.core.dto.UserDTO;
import wad.project.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand() {
        this.pojo = new UserDTO();
    }
}
