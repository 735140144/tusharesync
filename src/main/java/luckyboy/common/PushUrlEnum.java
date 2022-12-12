package luckyboy.common;

public enum PushUrlEnum {

    FAKELOGIN(1001,AshareConfig.PushDeerSelf+"login/fake","GET","模拟登陆"),
    USERINFO(1002,AshareConfig.PushDeerSelf+"user/info","POST","获取当前用户"),
    REGDEVICE(1003,AshareConfig.PushDeerSelf+"device/reg","POST","注册设备"),
    LISTDEVICE(1004,AshareConfig.PushDeerSelf+"device/list","POST","设备列表"),
    REMOVEDEVICE(1005,AshareConfig.PushDeerSelf+"device/remove","POST","删除已注册的设备"),
    RENAMEDEVICE(1006,AshareConfig.PushDeerSelf+"device/rename","POST","重命名设备"),
    KEYGEN(1007,AshareConfig.PushDeerSelf+"key/gen","POST","生成新KEY"),
    KEYREGEN(1008,AshareConfig.PushDeerSelf+"key/regen","POST","重置KEY"),
    KEYLIST(1009,AshareConfig.PushDeerSelf+"key/list","POST","重命名KEY"),
    KEYREMOVE(1010,AshareConfig.PushDeerSelf+"key/remove","POST","KEY列表"),
    PUSH(1011,AshareConfig.PushDeerSelf+"message/push","POST","推送消息"),
    LIST(1011,AshareConfig.PushDeerSelf+"message/list","POST","消息列表"),
    REMOVE(1011,AshareConfig.PushDeerSelf+"message/remove","POST","删除消息");




    private Integer code;
    private String url;
    private String methon;
    private String dictContext;

    PushUrlEnum(Integer code, String url, String methon, String dictContext) {
        this.code = code;
        this.url = url;
        this.methon = methon;
        this.dictContext = dictContext;
    }

    public Integer getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }

    public String getMethon() {
        return methon;
    }

    public String getDictContext() {
        return dictContext;
    }
}
