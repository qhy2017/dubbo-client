package com.qhy.demo.service;

import java.io.File;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
@Component
@Service

public interface IDemoService {
	public Object sendMessage(String msg);

	public File getFile();
}
