package com.seven.web.util;

import java.util.List;

import com.seven.sp01.pojo.Item;

public class JsonResult<T> {
	/** 成功 */
	public static final int SUCCESS = 200;

	/** 没有登录 */
	public static final int NOT_LOGIN = 400;

	/** 发生异常 */
	public static final int EXCEPTION = 401;

	/** 系统错误 */
	public static final int SYS_ERROR = 402;

	/** 参数错误 */
	public static final int PARAMS_ERROR = 403;

	/** 不支持或已经废弃 */
	public static final int NOT_SUPPORTED = 410;

	/** AuthCode错误 */
	public static final int INVALID_AUTHCODE = 444;

	/** 太频繁的调用 */
	public static final int TOO_FREQUENT = 445;

	/** 未知的错误 */
	public static final int UNKNOWN_ERROR = 499;
	
	private int code;
	private String msg;
	private T data;
	private String err;
	
	public JsonResult(int code, String msg, T data, String err) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.err = err;
	}
	public String getErr() {
		return err;
	}
	public void setErr(String err) {
		this.err = err;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static int getSuccess() {
		return SUCCESS;
	}
	public static int getNotLogin() {
		return NOT_LOGIN;
	}
	public static int getException() {
		return EXCEPTION;
	}
	public static int getSysError() {
		return SYS_ERROR;
	}
	public static int getParamsError() {
		return PARAMS_ERROR;
	}
	public static int getNotSupported() {
		return NOT_SUPPORTED;
	}
	public static int getInvalidAuthcode() {
		return INVALID_AUTHCODE;
	}
	public static int getTooFrequent() {
		return TOO_FREQUENT;
	}
	public static int getUnknownError() {
		return UNKNOWN_ERROR;
	}
	@Override
	public String toString() {
		return "JsonResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	public JsonResult(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public JsonResult() {
	
	}
	}



