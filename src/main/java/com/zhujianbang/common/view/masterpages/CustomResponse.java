package com.zhujianbang.common.view.masterpages;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CustomResponse extends HttpServletResponseWrapper
{
	private StringWriter	stringWriter	= new StringWriter();
	private PrintWriter		out				= new PrintWriter(stringWriter);

	public CustomResponse(HttpServletResponse response)
	{
		super(response);
	}

	@Override
	public PrintWriter getWriter() throws IOException
	{
		// TODO Auto-generated method stub
		return out;
	}

	public String getContent()
	{
		return stringWriter.toString();
	}
}
