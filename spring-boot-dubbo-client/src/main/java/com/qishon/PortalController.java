package com.qishon;

import com.qishon.uic.AccountManager;
import com.qishon.uic.ItemManager;
import com.qishon.uic.UicTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {
    @Autowired
    private AccountManager accountManager;


    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", accountManager.findById(1L));
        return "index";
    }

}
