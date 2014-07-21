package com.dips.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import com.dips.intent.Action;

public class tesSpring {
	public static void main(String args[]) throws FileNotFoundException{
		PropertyConfigurator.configure("log4j.properties");
//		ApplicationContext ctx=new FileSystemXmlApplicationContext("bean.xml");
//		Action action=(Action)ctx.getBean("TheAction");
//		InputStream is=new FileInputStream("bean.xml");
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("bean.xml"));
		Action action=(Action)factory.getBean("TheAction");
		System.out.println(action.execute("adfsafFADSFfeF"));
	}
}
