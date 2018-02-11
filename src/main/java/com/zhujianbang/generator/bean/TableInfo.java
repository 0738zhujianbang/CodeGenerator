package com.zhujianbang.generator.bean;

import org.springframework.util.StringUtils;

/**
 * 用户表信息
 * 
 * @author 朱建邦
 * @version 创建时间：2018年2月11日 上午11:03:10
 */
public class TableInfo
{
	private String	name;		// 用户表名（中文)
	private String	code;		// 用户表名（英文)
	private String	pkName;		// 主键名
	private String	pkDataType;	// 主键数据类型

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getPkName()
	{
		return pkName;
	}

	public void setPkName(String pkName)
	{
		this.pkName = pkName;
	}

	public String getPkDataType()
	{
		return pkDataType;
	}

	public void setPkDataType(String pkDataType)
	{
		this.pkDataType = pkDataType;
	}

	/**
	 * 获得驼峰命名方式的用户表编码
	 * 
	 * @return
	 */
	public String getHumpCode()
	{
		return this.getHumpString(this.code, "_");
	}

	/**
	 * 获得第一个字母小写的驼峰命名方式用户表编码
	 * 
	 * @return
	 */
	public String getFirstLoweredHumpCode()
	{
		String hump = this.getHumpCode();
		return hump.substring(0, 1).toLowerCase() + hump.substring(1);
	}

	/**
	 * 获得驼峰命名方式的主键名
	 * @return
	 */
	public String getHumpPKName()
	{
		return this.getHumpString(this.pkName, "_");
	}

	/**
	 * 获得第一个字母小写的驼峰命名方式主键名
	 * @return
	 */
	public String getFirstLoweredHumpPKName()
	{
		String hump = this.getHumpPKName();
		return hump.substring(0, 1).toLowerCase() + hump.substring(1);
	}

	/**
	 * 生成驼峰命名方式的字符串
	 * 
	 * @param source
	 *            原始字符串
	 * @param delimiter
	 *            分隔符
	 * @return
	 */
	private String getHumpString(String source, String delimiter)
	{
		// 1.将字符串根据分隔符“-”分隔为字符串数组
		String[] codes = StringUtils.split(this.code, delimiter);

		// 2.将字符串数组第个元素的第一个字母大写并拼接成新的驼峰命名方式的字符串
		StringBuilder hump = new StringBuilder();

		for (String s : codes)
		{
			hump.append(s.substring(0, 1).toUpperCase() + s.substring(1));
		}

		return hump.toString();

	}
}
