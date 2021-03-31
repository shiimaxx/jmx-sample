package com.shiimaxx.jmxsample;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

import com.shiimaxx.jmxsample.SampleMonitor;

public class App 
{
    public static void main( String[] args )
    {
		SampleMonitor monitor = new SampleMonitor();
		String name = "com.shiimaxx.app:type=SampleMonitor";
		MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
		try {
			mBeanServer.registerMBean(monitor, new ObjectName(name));
			while(true) {
        		System.out.println("sleep");
				TimeUnit.SECONDS.sleep(10);
			}
		} catch (Exception ex) {
        	System.out.println(ex);
		}
    }
}
