package com.plumblum.model.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限标识
 * 
 * @author 小威老师
 *
 */
@Data
public class SysPermission implements Serializable {

	private static final long serialVersionUID = 280565233032255804L;

	private Long id;
	private String permission;
	private String name;
	private Date createTime;
	private Date updateTime;

}
