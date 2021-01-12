package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/12/31
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

        @Autowired
        private ItemsService itemsService;

        /**
         * 查询所有
         * @param model
         * @return
         */
        @GetMapping("/list")
        public String list(Model model){
                List<Items> list = itemsService.findAll();
                // 塞给 页面
                model.addAttribute("items",list);
                // 视图
                return "items";
        }
}
