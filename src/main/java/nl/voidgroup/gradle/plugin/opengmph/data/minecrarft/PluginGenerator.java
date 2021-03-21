package nl.voidgroup.gradle.plugin.opengmph.data.minecrarft;

import nl.voidgroup.gradle.plugin.opengmph.data.YMLObject;

public abstract class PluginGenerator {
    public abstract YMLObject generate();
    public String getFileName() {
        return "plugin.yml";
    }
}
