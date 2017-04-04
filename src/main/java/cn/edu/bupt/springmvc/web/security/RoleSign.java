package cn.edu.bupt.springmvc.web.security;

/**
 * 角色标识配置类, <br>
 * 与 role_info 角色表中的 role_sign 字段 相对应 <br>
 * 使用:
 * <p>
 * <pre>
 * &#064;RequiresRoles(value = RoleSign.ADMIN)
 * public String admin() {
 *     return &quot;拥有admin角色,能访问&quot;;
 * }
 * </pre>
 * <p>
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
public class RoleSign {

    /**
     * 普通后台管理员 标识
     */
    public static final String ADMIN = "admin";

    /**
     * 客户经理 标识
     */
    public static final String CONSULTANT = "consultant";

    /**
     * VIP客户 标识
     */
    public static final String VIP_USER = "vip_user";

    /**
     * 商家 标识
     */
    public static final String MERCHANT = "merchant";

    /**
     * 添加更多...
     */

}
