package com.shiimaxx.jmxsample;

public class SampleMonitor implements SampleMonitorMBean {
	@Override
	public long getMetrics1() {
		return 1;
	}
}
