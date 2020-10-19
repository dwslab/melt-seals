package eu.sealsproject.platform.res.tool.api;

public abstract interface IToolBridge
        extends IPlugin {

    public abstract boolean canExecute();

    public abstract ToolType getType();
}
