package cn.edu.bupt.springmvc.web.controller;

import cn.edu.bupt.springmvc.web.model.Country;
import cn.edu.bupt.springmvc.web.service.CountryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/16 0016.
 * Email:liumingbo2008@gmail.com
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    private String page_list = "index";

    @RequestMapping(value = "list")
    public ModelAndView getList(Country country,
                                @RequestParam(required = false, defaultValue = "1") int page,
                                @RequestParam(required = false, defaultValue = "10") int rows) {
        ModelAndView result = new ModelAndView(page_list);
        List<Country> countryList = countryService.selectByCountry(country, page, rows);
        result.addObject("pageInfo", new PageInfo<Country>(countryList));
        result.addObject("queryParam", country);
        result.addObject("page", page);
        result.addObject("rows", rows);
        return result;
    }

}
