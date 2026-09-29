package repro;

public final class Case21_MJ_OBJ_012 {
    private final ComponentDefinition mReceiver;

    public Case21_MJ_OBJ_012(ComponentDefinition receiver) {
        if (receiver == null) {
            throw new IllegalArgumentException("receiver");
        }
        this.mReceiver = receiver;
    }

    public ComponentDefinition getReceiver() {
        return mReceiver;
    }
}
