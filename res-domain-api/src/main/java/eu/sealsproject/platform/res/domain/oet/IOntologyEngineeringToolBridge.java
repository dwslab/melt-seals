package eu.sealsproject.platform.res.domain.oet;

import eu.sealsproject.platform.res.tool.api.IToolBridge;
import eu.sealsproject.platform.res.tool.api.ToolBridgeException;
import eu.sealsproject.platform.res.tool.api.ToolException;
import java.net.URL;

public abstract interface IOntologyEngineeringToolBridge
        extends IToolBridge {

    public abstract URL importExportOntology(URL paramURL, String paramString)
            throws ToolBridgeException, ToolException;
}
