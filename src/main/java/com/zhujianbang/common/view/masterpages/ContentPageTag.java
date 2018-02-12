package com.zhujianbang.common.view.masterpages;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * 内容页标签
 * 
 * @author 朱建邦
 * @version 创建时间：2018年2月12日 上午10:32:13
 */
public class ContentPageTag extends BodyTagSupport
{

	private final String		masterFolderPath	= "/WEB-INF/master/";
	private final String		masterPageSuffix	= ".jsp";

	private static final long	serialVersionUID	= 1L;

	@Override
	public void doInitBody() throws JspException
	{
		try
		{
			this.pageContext.getRequest().setCharacterEncoding("UTF-8");
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		super.doInitBody();
	}

	@Override
	public int doAfterBody() throws JspException
	{
		return SKIP_BODY;
	}

	@Override
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		CustomResponse bufferedResponse = new CustomResponse((HttpServletResponse) this.pageContext.getResponse());

		try
		{
			// 渲染页面
			this.pageContext.getServletContext().getRequestDispatcher(this.getMasterPageUrl())
					.include(this.pageContext.getRequest(), bufferedResponse);
			out.write(bufferedResponse.getContent());
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return SKIP_PAGE;

	}

	private String getMasterPageUrl()
	{
		return this.masterFolderPath + this.materPageId + this.masterPageSuffix;
	}

	private String materPageId;

	public String getMaterPageId()
	{
		return materPageId;
	}

	public void setMaterPageId(String masterPageId)
	{
		this.materPageId = masterPageId;
	}
}
