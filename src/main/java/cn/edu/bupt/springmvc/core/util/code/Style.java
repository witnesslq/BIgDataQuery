package cn.edu.bupt.springmvc.core.util.code;

/**
 * 字段转换方式
 *
 * Created by FirenzesEagle on 2016/6/16 0016.
 * Email:liumingbo2008@gmail.com
 */
public enum Style {
    normal,                     //原值
    camelhump,                  //驼峰转下划线
    uppercase,                  //转换为大写
    lowercase,                  //转换为小写
    camelhumpAndUppercase,      //驼峰转下划线大写形式
    camelhumpAndLowercase,      //驼峰转下划线小写形式
}
