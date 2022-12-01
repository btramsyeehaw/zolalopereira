package eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty;

import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.IncorrectDoorCodeException;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.Door;

public abstract class ThirdPartyDoorAdaper extends ThirdPartyDoor implements Door{
    private boolean open;

    @Override
    public void open(String code) throws IncorrectDoorCodeException {
        // try the code
        if (this.code.equals(code)) {
            this.open = true;
        } else {
            throw new IncorrectDoorCodeException();
        }

    }

    @Override
    public void close() {
        this.open = false;
    }
}
