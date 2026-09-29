package repro;

public final class ComponentDefinition {
    private final String mPackageName;
    private final String mClassName;
    private final String mPermission;

    public ComponentDefinition(String packageName, String className, String permission) {
        this.mPackageName = packageName == null ? "" : packageName;
        this.mClassName = className == null ? "" : className;
        this.mPermission = permission == null ? "" : permission;
    }

    public String getPackageName() { return mPackageName; }
    public String getClassName() { return mClassName; }
    public String getPermission() { return mPermission; }
}
