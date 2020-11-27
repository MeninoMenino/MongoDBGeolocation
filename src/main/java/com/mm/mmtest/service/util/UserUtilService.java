package com.mm.mmtest.service.util;

import com.mm.mmtest.model.Location;
import com.mm.mmtest.model.User;
import com.mm.mmtest.model.dto.InsertUserDto;
import org.springframework.stereotype.Service;

@Service
public class UserUtilService {

    public User convertDtoToEntity(InsertUserDto userDto){
        Location userLocation = new Location("Point", userDto.getCoordinates());
        return new User(userDto.getName(), userDto.getAge(), userLocation);
    }
}
