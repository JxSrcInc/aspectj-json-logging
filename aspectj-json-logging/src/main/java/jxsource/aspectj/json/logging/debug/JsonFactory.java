package jxsource.aspectj.json.logging.debug;

public interface JsonFactory<T extends Object> {
	public T createCallBefore(CallLog callLog);
	public T createCallAfter(CallLog callLog);
	public T createCallException(CallLog callLog);
}
