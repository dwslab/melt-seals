package eu.sealsproject.platform.res.tool.api;

public class ToolBridgeException
        extends PluginException {

    private static final long serialVersionUID = -3651148129040726490L;

    public ToolBridgeException(String message) {
        super(message);
    }

    public ToolBridgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
