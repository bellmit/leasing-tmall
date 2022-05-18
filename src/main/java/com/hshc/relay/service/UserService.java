package com.hshc.relay.service;

import com.hshc.relay.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-01 15:35
 */
@Service
public class UserService extends BaseService<User> {

    @Transactional(rollbackFor = Exception.class)
    public int batchAdd1(List<User> userList) throws Exception {
        add(userList.get(0));
        throw new Exception();
    }

}
