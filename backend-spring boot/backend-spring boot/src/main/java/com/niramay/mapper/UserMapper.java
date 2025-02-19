package com.niramay.mapper;

import com.niramay.dto.OrderDto;
import com.niramay.dto.OrderItemDto;
import com.niramay.dto.UserDto;
import com.niramay.model.Order;
import com.niramay.model.OrderItem;
import com.niramay.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
