package com.zhujianbang.common.view.masterpages;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * 母版 页标签
 * @author 朱建邦
 * @version 创建时间：2018年2月12日 上午10:15:49
 */
public class MasterPageTag extends BodyTagSupport
{

	private static final long serialVersionUID = 1L;

	@Override
	public int doAfterBody() throws JspException
	{
		// TODO Auto-generated method stub
		return SKIP_BODY;
	}

	@Override
	public int doStartTag() throws JspException
	{
		// 执行子标签
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException
	{
		JspWriter out= pageContext.getOut();
		
		if(bodyContent != null) {
			if(out instanceof BodyContent) {
				out = ((BodyContent)out).getEnclosingWriter();
			}
		}
		
		String content = this.bodyContent.getString();
		try
		{
			this.bodyContent.clear();
			out.write(content);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return SKIP_PAGE;
	}
}
