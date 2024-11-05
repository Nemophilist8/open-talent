package com.example.backend.service;

import com.example.backend.domain.Org;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.backend.entity.Member;

/**
 * @author HDX
 * @description 针对表【organizations】的数据库操作Service
 * @createDate 2024-11-01 10:26:14
 */
public interface OrgService extends IService<Org> {
    void orgRegister(Org org);
}