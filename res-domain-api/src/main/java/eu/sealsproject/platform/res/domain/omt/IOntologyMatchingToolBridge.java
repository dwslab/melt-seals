package eu.sealsproject.platform.res.domain.omt;

import eu.sealsproject.platform.res.tool.api.IToolBridge;
import eu.sealsproject.platform.res.tool.api.ToolBridgeException;
import eu.sealsproject.platform.res.tool.api.ToolException;
import java.net.URL;

public abstract interface IOntologyMatchingToolBridge
        extends IToolBridge {

    public abstract URL align(URL paramURL1, URL paramURL2)
            throws ToolBridgeException, ToolException;

    public abstract URL align(URL paramURL1, URL paramURL2, URL paramURL3)
            throws ToolBridgeException, ToolException;
}
