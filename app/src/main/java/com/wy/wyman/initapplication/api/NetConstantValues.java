package com.wy.wyman.initapplication.api;

/**
 * Created by DELL on 2017/1/6.
 */

public interface NetConstantValues {
    /**
     * 开发环境
     */
//    String HOST_URL = "http://192.168.6.59:8010/";
//    String HOST_PAY="http://192.168.6.59:8014/";
    /**
     * 测试服务器
     */
    String HOST_URL = "http://192.168.6.60:8010/";
    String HOST_PAY = "http://192.168.6.60:8014/";
    //帅帅
    // String HOST_URL = "http://192.168.10.36:9090/";
    // String HOST_PAY="http://192.168.13.63:9093/";


    String USERMANAGE = "zhongying/v1/api/";
    String BIGTHREE = "chinazy-sms-bigthree/api/";
    String HUIFU_SH = "pay/http/huifush/";
    String P2P = "pay/http/p2p/";


    String user_login = USERMANAGE + "user/login";//登录
    String user_register = USERMANAGE + "user/register";//注册
    String USER_FORGETPWD = USERMANAGE + "user/resetPassword";//忘记密码
    String IMAGE_CHECK = USERMANAGE + "image/checkcode";//检查图形验证
    String IMAGE_GET = USERMANAGE + "kaptcha";//获取图形验证码
    String GET_TOKEN = USERMANAGE + "getToken";//获取token
    String GET_BANKLIST = USERMANAGE + "p2pBank/selectP2pBankList";//获取银行列表
    //我的页面
    String USER_FINDSTATUS = USERMANAGE + "account/findUserstatus";//查询用户状态
    /**
     * 第5模块
     */
    String USER_INFO = USERMANAGE + "account/accountInfoDetail";//账户中心首页展示，会员信息，可用余额，冻结余额，收益等
    String USER_PRODUCT_INFO = USERMANAGE + "account/userHoldProductRecord";//用户持有产品记录，资金占比展示
    String ACCOUNT_SECURITY_INFO = USERMANAGE + "account/accountSecurity";//账户安全页面展示
    String ACCOUNT_INCOME_INFO = USERMANAGE + "account/userIncome";//用户收益
    String DEAL_RECORD_INFO = USERMANAGE + "account/findFundsDetailList";//交易记录
    String PRODUCT_FUNDS = USERMANAGE + "account/productFunds";//持有产品分类总额
    String ASSET_MANAGMENT_LIST = USERMANAGE + "account/assetManagementList";//持有产品分类总额
    String MESSAGE_LIST = USERMANAGE + "account/accountMessage";//消息列表
    String MODIFICATION_MESSAGE = USERMANAGE + "account/deleteMessage";//修改消息
    String REBIND_PHONE=USERMANAGE+"user/rebindMobile";//换绑手机
    String AUTHENTICATION = USERMANAGE + "user/authentication";//身份校验
    String RESETPASSWORDINMORE = USERMANAGE + "user/resetPasswordInMore";//重置密码
    //短信
    String REQUEST_VALIDATE_CODE = USERMANAGE + "sms/requestValidateCode";
    String SMS_SENDSMSCODE = USERMANAGE + "sms/sendSmsCode";


    //汇付接口
    String HUIFU_SMS_HUIFU = HUIFU_SH + "toSendSmsCode";//发送验证码
    String HUIFU_QUIK_BIND = HUIFU_SH + "quickBind";//绑卡
    String HUIFU_RECHARGE = HUIFU_SH + "toNetSave";//充值
    String HUIFU_WITHDRAW = HUIFU_SH + "toCash";//提现

    String HUIFU_CORP_REGISTER = HUIFU_SH + "toCorpRegister";//企业注册
    String HUIFU_REGISTER = HUIFU_SH + "toRegister";//用户注册
    String HUIFU_ACTIVATE = HUIFU_SH + "toBosAcctActivate";//账户激活
    String HUIFU_TOLOAN = HUIFU_SH + "toLoans";//放款
    String HUIFU_TRANSDETAIL = HUIFU_SH + "toQueryTransDetail";//交易明细
    String HUIFU_USERINFO = HUIFU_SH + "toQueryUsrInfo";//用户信息查询
    String HUIFU_ADDBIDINFO = HUIFU_SH + "addBidInfo";//标的信息录入
    /**
     * 第二模块接口
     */

    //首页
    String HOME = "zhongying/v1/api/product/";
    String HOME_PRODUCT = HOME + "getHomeProduct";//首页产品展示
    String HOME_ARTICLE = HOME + "getHomeArticle";//首页新闻
    String HOME_RECOMMEND = HOME + "getrecommend";//首页活动信息
    String HOME_BANNER = HOME + "getbanner";//首页轮播图
    //列表详情页
    String PRODUCT = "zhongying/v1/api/product/";
    String PRODUCT_TITLE_LIST = PRODUCT + "productTitleList";//菜单列表
    String PRODUCT_LIST = PRODUCT + "productList";//产品列表
    String PRODUCT_BASE_DETAIL = PRODUCT + "productDetailBase";//产品基础详情信息
    String PRODUCT_DETAIL = PRODUCT + "productDetail";//产品详情信息
    String INVESTMENT_RECORD = PRODUCT + "getInvestmentRecord";//投资记录
    String PRODUCT_RETURN_PLAN = PRODUCT + "productReturnPlan";//还款计划
    /**
     * 投资
     */
    String INVEST = "zhongying/v1/api/invest/";
    //计算收益
    String INVEST_EARNINGS = INVEST + "getExpectedRevenue";// 收益
    //投资
    String INVEST_BUY = INVEST + "invest";// 收益
    //p2p
    String P2P_ISBOSACCTACTIVATE = P2P + "isBosAcctActivate";//判断是否是激活用户
    String P2P_VALIDATEOLDUSER = P2P + "validateOldUser";//短信验证其他平台已开户，进行当前平台登陆用户数据复制
    String P2P_CALCULATEFEEAMOUNT = P2P + "/calculateFeeAmount";//计算手续费
    String P2P_USERBASEINFO = P2P + "/userBaseInfo";//用户银行卡信息以及资金
    String P2P_ISWITHDRAWSUCCESS = P2P + "/isWithdrawSuccess";//提现 是否成功


}
