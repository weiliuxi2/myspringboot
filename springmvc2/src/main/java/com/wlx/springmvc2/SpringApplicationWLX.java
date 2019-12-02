package com.wlx.springmvc2;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;
import java.io.File;

public class SpringApplicationWLX {
    public static void run()  {
        try {


            Tomcat tomcat = new Tomcat();
            tomcat.setPort(9999);



           // tomcat.addServlet(context,"app",servlet).setLoadOnStartup(1);
           // context.addServletMapping("/**","wlx");
         //   String sourcePath = SpringApplicationWLX.class.getResource("/").getPath();

            //添加webapp, 告訴tomcat是一个web项目
            Context ctx = tomcat.addWebapp("/",new File("springmvc2/src/main").getAbsolutePath());
            //tomcat.addContext("/",new File("springmvc2/src/main").getAbsolutePath());
           // WebResourceRoot resources = new StandardRoot(ctx);
            /*resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                    sourcePath, "/"));*/
           // ctx.setResources(resources);
            tomcat.start();
            tomcat.getServer().await();
        }catch(Exception e){

        }

    }
}
