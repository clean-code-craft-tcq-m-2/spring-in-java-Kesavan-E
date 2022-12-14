package statisticker;

import java.util.*;

public class Statistics 
{
    static class Stats
    {
        public Float min = Float.NaN;
        public Float max = Float.NaN;
        public Float average = Float.NaN;
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        
        Statistics.Stats s = new Stats();
        
        if(numbers.isEmpty())
        {
            return(s);
        }
        Float sum = 0f;
        s.min = Collections.min(numbers);
        s.max = Collections.max(numbers);
        for(Float n:numbers)
        {
            sum+=n;
        }    
        s.average = sum/(numbers.size());
        return(s);
    }
}
