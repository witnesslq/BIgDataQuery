package cn.edu.bupt.springmvc.web.util;

public class GenericReturnModel<T> {
	
	private boolean result;
	private String reason;
	
	private T data;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
