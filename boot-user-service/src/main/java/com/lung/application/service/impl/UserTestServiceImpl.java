package com.lung.application.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lung.application.bean.UserAddress;
import com.lung.application.service.UserTestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Service//暴露服务
@Component
@Log4j2
public class UserTestServiceImpl implements UserTestService {

	@Override
	public List<UserAddress> getUserAddressList(String userId)  {
		// TODO Auto-generated method stub
		System.out.println("UserTestServiceImpl..3.....");
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		return Arrays.asList(address1,address2);
	}
}
