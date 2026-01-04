package pixel.academy.setter_injection.common;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pompdoro with fresh tomatoes and basil!";
    }
}
