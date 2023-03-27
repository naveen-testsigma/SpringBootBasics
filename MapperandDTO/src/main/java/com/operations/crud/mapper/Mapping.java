package com.operations.crud.mapper;
import com.operations.crud.entity.User;
import com.operations.crud.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public  interface Mapping {
    UserDTO userToUserGetDRO(User user);
}
