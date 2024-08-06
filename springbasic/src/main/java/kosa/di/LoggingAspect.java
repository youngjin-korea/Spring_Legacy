package kosa.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//������ɻ���
public class LoggingAspect {
	// �ٽɰ��ɻ��� insertService() �Բ� ȣ��
	// Ÿ�̸� ���� -> Ÿ�̸� �۵� -> ���� �޼��� ȣ�� -> Ÿ�̸� ���� -> �α� ���
	private Log log = LogFactory.getLog(getClass());

	// ������ɻ� ȣ�� around
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("�α׽���");
		StopWatch stopWatch = new StopWatch();
		try {
			stopWatch.start();

			Object obj = joinPoint.proceed();
			return obj;
		} catch (Exception e) {
			throw e;
		} finally {
			stopWatch.stop();
			log.info(joinPoint.getSignature().getName() + "�޼��� �ǽ�: " + stopWatch.getTotalTimeMillis());
		}
	}
}
