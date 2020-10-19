package eu.sealsproject.platform.res.tool.api;

import java.io.File;

public abstract interface ICapability
        extends IPlugin {

    public abstract CapabilityType getType();

    public abstract void execute(File paramFile)
            throws CapabilityException;
}
