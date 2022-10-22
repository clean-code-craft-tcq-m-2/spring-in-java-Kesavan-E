package statisticker;

import java.util.List;

class StatsChecker {
	float maxThreshold;
	IAlerter iAlerter[];

	public StatsChecker(float maxThreshold, IAlerter iAlerter[]) {
		this.maxThreshold = maxThreshold;
		this.iAlerter = iAlerter;
	}

	public void checkAndAlert(List<Float> numberList) {
		Statistics.Stats s = Statistics.getStatistics(numberList);
		if (s.max > maxThreshold) {
			iAlerter[0].emailSent = true;
			iAlerter[1].ledGlows = true;
		}
	}
}
