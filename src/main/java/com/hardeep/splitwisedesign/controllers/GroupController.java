package com.hardeep.splitwisedesign.controllers;

import com.hardeep.splitwisedesign.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {
    private GroupService groupService;
    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    settleGroupResponseDto settleGroup(settleGroupRequestDto request){
        //Make a call to the service
    }
}
