package com.zhujianbang.common.view.masterpages;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 点位符标签
 * @author 朱建邦
 * @version 创建时间：2018年2月12日 上午10:27:39
 */
public class ContentPlaceHolderTag extends TagSupport
{

	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException
	{
		JspWriter out = pageContext.getOut();

		Object obj = this.pageContext.getRequest().getAttribute(this.getId());

		try
		{
			if (obj != null)
			{
				out.write(obj.toString());
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		return EVAL_PAGE;
	}

}
