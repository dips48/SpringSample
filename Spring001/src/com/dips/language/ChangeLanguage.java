package com.dips.language;

import java.util.Calendar;
import java.util.Locale;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ChangeLanguage {
	public static void main(String args[]){
		PropertyConfigurator.configure("log4j.properties");
		ApplicationContext ctx=new FileSystemXmlApplicationContext("language.xml");
		Object[] arg=new Object[]{
				"Ericat",
				Calendar.getInstance().getTime()
		};
		String msg=ctx.getMessage("userinfo", arg, Locale.CHINESE);
		System.out.println(msg);
	}

}