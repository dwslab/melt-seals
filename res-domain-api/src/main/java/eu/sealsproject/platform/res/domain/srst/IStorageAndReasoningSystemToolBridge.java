package eu.sealsproject.platform.res.domain.srst;

import eu.sealsproject.platform.res.tool.api.IToolBridge;
import eu.sealsproject.platform.res.tool.api.ToolBridgeException;
import eu.sealsproject.platform.res.tool.api.ToolException;
import java.net.URL;

public abstract interface IStorageAndReasoningSystemToolBridge
        extends IToolBridge {

    public abstract void loadOntology(URL paramURL)
            throws ToolBridgeException, ToolException;

    public abstract URL saveOntology(URL paramURL)
            throws ToolBridgeException, ToolException;

    public abstract boolean isSatisfiable(URL paramURL)
            throws ToolBridgeException, ToolException;

    public abstract boolean isSatisfiableOWLClass(URL paramURL1, URL paramURL2)
            throws ToolBridgeException, ToolException;

    public abstract URL classifyOntology(URL paramURL)
            throws ToolBridgeException, ToolException;

    public abstract boolean entails(URL paramURL1, URL paramURL2)
            throws ToolBridgeException, ToolException;
}
