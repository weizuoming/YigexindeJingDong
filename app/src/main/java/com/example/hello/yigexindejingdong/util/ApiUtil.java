package com.example.hello.yigexindejingdong.util;

/**
 * Created by 韦作铭 on 2018/2/23.
 * 专门存放所有的路径的类,,,全都是静态变量,,,直接类名.调用
 */

public class ApiUtil {
    //首页
    public static final String HOME_URL = "https://www.zhaoapi.cn/ad/getAd";
    //分类
    public static final String FEN_LEI_URL = "https://www.zhaoapi.cn/product/getCatagory";
    //详情
    public static final String DETAIL_URL = "https://www.zhaoapi.cn/product/getProductDetail";
    //子分类
    public static final String CHILD_FEN_LEI_URL = "https://www.zhaoapi.cn/product/getProductCatagory";
    //搜索
    public static final String SEARTCH_URL = "https://www.zhaoapi.cn/product/searchProducts";

    //登录
    public static final String LOGIN_URL = "https://www.zhaoapi.cn/user/login";
    //查询购物车
    public static final String SELECT_CART = "https://www.zhaoapi.cn/product/getCarts";
    //更新购物车 https://www.zhaoapi.cn/product/updateCarts?uid=71&sellerid=1&pid=1&selected=0&num=10
    public static final String UPDATE_CART_URL = "https://www.zhaoapi.cn/product/updateCarts";
    //删除购物车...https://www.zhaoapi.cn/product/deleteCart?uid=72&pid=1
    public static final String DELETE_CART_URL = "https://www.zhaoapi.cn/product/deleteCart";
    //添加购物车...uid...pid
    public static final String ADD_CART = "https://www.zhaoapi.cn/product/addCart";

}
