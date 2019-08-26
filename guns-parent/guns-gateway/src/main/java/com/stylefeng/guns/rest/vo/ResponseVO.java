package com.stylefeng.guns.rest.vo;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/26 下午11:34
 * @description: No Description
 */
public class ResponseVO<M> {

    //返回状态 0成功 1 失败 999异常
    private int status;
    //返回信息
    private String msg;
    //返回实体
    private M date;

    private ResponseVO(){}

    public static<M> ResponseVO success(M m){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setDate(m);
        return responseVO;
    }

    public static<M> ResponseVO serviceFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(1);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public static<M> ResponseVO appFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(999);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public M getDate() {
        return date;
    }

    public void setDate(M date) {
        this.date = date;
    }
}
