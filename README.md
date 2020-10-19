# melt-seals
Simple provisioning of the following modules via maven central for the [MELT project](https://github.com/dwslab/melt/):
- `eu.sealsproject.platform.res.domain`
- `eu.sealsproject.platform.res.tool.api`
- `eu.sealsproject.platform.res.tool.impl`

## Usage
```xml
<dependencies>
    <dependency>
        <groupId>de.uni-mannheim.informatik.dws.melt</groupId>
        <artifactId>res-tool-api</artifactId>
        <version>1.1.1</version>
    </dependency>
    <dependency>
        <groupId>de.uni-mannheim.informatik.dws.melt</groupId>
        <artifactId>res-domain-api</artifactId>
        <version>1.1.1</version>
    </dependency>
    <dependency>
        <groupId>de.uni-mannheim.informatik.dws.melt</groupId>
        <artifactId>res-tool-impl</artifactId>
        <version>1.1.1</version>
    </dependency>
</dependencies>
```
