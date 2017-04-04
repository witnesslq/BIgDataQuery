package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.model.Country;

import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/16 0016.
 * Email:liumingbo2008@gmail.com
 */
public interface CountryService extends GenericService<Country, Long> {

    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);

}
