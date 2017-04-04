package cn.edu.bupt.springmvc.core.generic;

/**
 * 所有自定义枚举类型实现该接口
 *
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
public interface GenericEnum {

    /**
     * value: 为保存在数据库中的值
     */
    public String getValue();

    /**
     * text : 为前端显示值
     */
    public String getText();

}
