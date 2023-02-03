package com.dvelop.versioncontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
  @RequestMapping({ "/repositories"})
    public String repositories() {
    return "forward:/index.html";
  }

  @RequestMapping({ "/repositories/{repositoryid}"})
    public String repositoryDetails(@PathVariable("repositoryid") String repositoryId) {
    return "forward:/index.html";
  }

  @RequestMapping({ "/repositories/{repositoryid}/files/{fileid}"})
    public String fileDetails(@PathVariable("repositoryid") String repositoryId, 
      @PathVariable("fileid") String fileid) {
    return "forward:/index.html";
  }
}
