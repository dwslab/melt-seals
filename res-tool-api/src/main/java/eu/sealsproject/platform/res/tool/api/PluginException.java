package eu.sealsproject.platform.res.tool.api;

public class PluginException
        extends Exception {

    private static final long serialVersionUID = -8845163254920778330L;

    public PluginException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginException(String message) {
        super(message);
    }
}
