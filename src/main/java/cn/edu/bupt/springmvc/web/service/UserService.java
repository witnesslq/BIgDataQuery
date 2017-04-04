package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.model.User;

/**
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     *
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User selectByUsername(String username);

}
