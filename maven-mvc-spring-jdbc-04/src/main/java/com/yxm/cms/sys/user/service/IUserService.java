package com.yxm.cms.sys.user.service;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import com.yxm.cms.sys.user.model.User;
import com.yxm.cms.sys.user.model.UserCond;
public interface IUserService {
	int insert(User user,MultipartFile img);

	int delete(int id);

	int update(User user);

	User findById(int id);

	List<User> queryList(UserCond cond);

}
