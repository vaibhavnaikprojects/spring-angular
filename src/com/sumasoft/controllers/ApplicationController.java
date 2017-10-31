package com.sumasoft.controllers;

import java.io.IOException;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody public String getFileUpload(@RequestParam("file") MultipartFile file){
		StringWriter writer = new StringWriter();
		try {
			IOUtils.copy(file.getInputStream(), writer, "UTF-8");
			return writer.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "something went wrong";
		}
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(){
		return new ModelAndView("index");
	}
	
}
