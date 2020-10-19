package eu.sealsproject.platform.res.tool.api;

public class CapabilityException
        extends PluginException {

    private static final long serialVersionUID = -6691945662117885660L;

    private final boolean executed;

    private final String processOutput;

    private final String processErrorOutput;

    public CapabilityException(String message, Throwable t, String processOutput, String processErrorOutput) {
        super(message, t);
        this.processOutput = processOutput;
        this.processErrorOutput = processErrorOutput;
        this.executed = ((processOutput != null) || (processErrorOutput != null));
    }

    public CapabilityException(String message) {
        this(message, null, null, null);
    }

    public CapabilityException(String message, Throwable e) {
        this(message, e, null, null);
    }

    public CapabilityException(String message, String processOutput, String processErrorOutput) {
        this(message, null, processOutput, processErrorOutput);
    }

    public boolean isExecuted() {
        return this.executed;
    }

    public String getProcessOutput() {
        return this.processOutput;
    }

    public String getProcessErrorOutput() {
        return this.processErrorOutput;
    }
}
