package pixel.academy.setter_injection.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FrenchChef implements Chef {

    public FrenchChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Preparez un Beuf Bourguignon avec vin rouge et herbes";
    }
}
