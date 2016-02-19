package com.work.dao;

import java.io.Serializable;
import java.util.List;

import com.work.entity.wx.WxUser;

public interface WxUserDao extends GenericDao<WxUser, Serializable> {

	public List<WxUser> queryAll(WxUser wxUser);
}
