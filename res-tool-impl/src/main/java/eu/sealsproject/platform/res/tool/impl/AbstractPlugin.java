package eu.sealsproject.platform.res.tool.impl;

import eu.sealsproject.platform.res.tool.api.IPlugin;

public abstract class AbstractPlugin
        implements IPlugin {

    private String id;
    private String version;

    public AbstractPlugin() {
        this.id = null;
        this.version = null;
    }

    public final String getId() throws IllegalStateException {
        if (this.id == null) {
            throw new IllegalStateException("Field 'id' has not been defined.");
        }
        return this.id;
    }

    public final void setId(String id) {
        if (this.id != null) {
            throw new IllegalStateException("Field 'id' has already been initialized.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Object 'id' cannot be null.");
        }
        this.id = id;
    }

    public final String getVersion() {
        if (this.version == null) {
            throw new IllegalStateException("Field 'version' has not been defined.");
        }
        return this.version;
    }

    public final void setVersion(String version) {
        if (this.version != null) {
            throw new IllegalStateException("Field 'version' has already been initialized.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Object 'version' cannot be null.");
        }
        this.version = version;
    }
}
