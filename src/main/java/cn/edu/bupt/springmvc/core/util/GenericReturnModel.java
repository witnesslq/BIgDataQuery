package cn.edu.bupt.springmvc.core.util;

public class GenericReturnModel<T> {
	
	private boolean result;
	private String reason;
	
	private T datum;

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

	public T getDatum() {
		return datum;
	}

	public void setDatum(T data) {
		this.datum = data;
	}
	
	
	
}
