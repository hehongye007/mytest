package com.itheima.servlet;

import com.itheima.bean.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsServlet {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public String findById(Model model){
        Items items = itemsService.finById(1);
        model.addAttribute("item",items);

        return "itemfindByid";
    }
}
