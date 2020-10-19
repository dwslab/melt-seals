package eu.sealsproject.platform.res.tool.api;

public class ToolException
        extends ToolBridgeException {

    private static final long serialVersionUID = -3651148129040726490L;

    public ToolException(String message) {
        super(message);
    }

    public ToolException(String message, Throwable cause) {
        super(message, cause);
    }
}
