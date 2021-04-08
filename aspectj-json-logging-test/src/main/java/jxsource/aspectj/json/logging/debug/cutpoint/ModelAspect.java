package jxsource.aspectj.json.logging.debug.cutpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import jxsource.aspectj.json.logging.debug.util.AspectUtil;

@Aspect
@Component
public class ModelAspect extends AspectUtil {
	private final String pointcut = "execution(* jxsource.aspectj.json.logging.debug.model..*(..))";
	@AfterReturning(pointcut = pointcut, returning = "obj")
	public Object afterReturning(JoinPoint jp, Object obj) {
		return super.afterReturning(jp, obj);
	}

	@AfterThrowing(pointcut = pointcut, throwing = "ex")
	public void exception(JoinPoint jp, Exception ex) {
		super.exception(jp, ex);
	}

	@Before(pointcut)
	public void before(JoinPoint jp) throws Throwable {
		super.before(jp);
	}
}
