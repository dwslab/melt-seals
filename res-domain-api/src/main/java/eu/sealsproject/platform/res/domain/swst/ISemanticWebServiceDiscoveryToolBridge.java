package eu.sealsproject.platform.res.domain.swst;

import eu.sealsproject.platform.res.domain.swst.results.DiscoveryResult;
import eu.sealsproject.platform.res.tool.api.IToolBridge;
import eu.sealsproject.platform.res.tool.api.ToolBridgeException;
import eu.sealsproject.platform.res.tool.api.ToolException;
import java.net.URI;
import java.util.List;

public abstract interface ISemanticWebServiceDiscoveryToolBridge
        extends IToolBridge {

    public abstract DiscoveryResult discover(URI paramURI)
            throws ToolBridgeException, ToolException;

    public abstract void loadServices(List<URI> paramList)
            throws ToolBridgeException, ToolException;

    public abstract void init()
            throws ToolBridgeException, ToolException;
}
