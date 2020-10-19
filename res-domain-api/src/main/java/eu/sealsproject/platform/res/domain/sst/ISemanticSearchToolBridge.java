package eu.sealsproject.platform.res.domain.sst;

import eu.sealsproject.platform.res.tool.api.IToolBridge;
import eu.sealsproject.platform.res.tool.api.ToolBridgeException;
import eu.sealsproject.platform.res.tool.api.ToolException;
import java.net.URL;

public abstract interface ISemanticSearchToolBridge
        extends IToolBridge {

    public abstract boolean loadOntology(URL paramURL, String paramString1, String paramString2)
            throws ToolBridgeException, ToolException;

    public abstract void showGUI(boolean paramBoolean)
            throws ToolBridgeException, ToolException;

    public abstract boolean isResultSetReady()
            throws ToolBridgeException, ToolException;

    public abstract URL getResults()
            throws ToolBridgeException, ToolException;

    public abstract boolean executeQuery(String paramString)
            throws ToolBridgeException, ToolException;

    public abstract String getInternalQuery()
            throws ToolBridgeException, ToolException;
}
