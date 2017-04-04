package cn.edu.bupt.springmvc.web.service.impl;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.core.generic.GenericServiceImpl;
import cn.edu.bupt.springmvc.web.dao.CountryMapper;
import cn.edu.bupt.springmvc.web.model.Country;
import cn.edu.bupt.springmvc.web.model.CountryExample;
import cn.edu.bupt.springmvc.web.service.CountryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/16 0016.
 * Email:liumingbo2008@gmail.com
 */
@Service
public class CountryServiceImpl extends GenericServiceImpl<Country, Long> implements CountryService {

    @Resource
    CountryMapper countryMapper;

    @Override
    public int insert(Country model) {
        return countryMapper.insertSelective(model);
    }

    @Override
    public int update(Country model) {
        return countryMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return countryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Country selectById(Long id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<Country, Long> getDao() {
        return countryMapper;
    }

    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        CountryExample countryExample = new CountryExample();
        CountryExample.Criteria criteria = countryExample.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname())) {
            criteria.andCountrynameLike("%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode())) {
            criteria.andCountrycodeLike("%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null) {
            criteria.andIdEqualTo(country.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return countryMapper.selectByExample(countryExample);
    }
}
