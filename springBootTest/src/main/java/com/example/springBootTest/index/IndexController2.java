package com.example.springBootTest.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springBootTest.index.model.IndexForm;

@Controller
public class IndexController2 {

//    @RequestMapping(value="/")
//    public String index1(Model model) {
//        model.addAttribute("indexForm", new IndexForm());
//        return "index";
//    }
//    @RequestMapping(value="/index")
//    public String index2(Model model) {
//        model.addAttribute("indexForm", new IndexForm());
//        return "index";
//    }

    @RequestMapping(value="/resulton", method=RequestMethod.POST)
    public String indexFormSubmit(@ModelAttribute IndexForm indexForm, Model model) {
        if (indexForm.getId() == 1) {
            indexForm.setContent("お前がナンバーワンだ！");
        }
        model.addAttribute("indexForm", indexForm);
        return "resulton";
    }
}