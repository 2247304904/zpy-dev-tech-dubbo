package com.zpy.dev.tech.dubbo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 /**
 * @program: zpy-dev-tech-dubbo
 * @description: UserResDTO
 * @author: 张鹏宇
 * @create: 2023-10-14 03:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserReqDTO implements Serializable {

    private String userId;
    private String userName;
    private Integer userAge;

}
