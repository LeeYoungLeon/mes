package com.qcadoo.plugin;

public interface PersistentPlugin {

    String getIdentifier();

    PluginState getPluginState();

    Version getVersion();

    boolean hasState(PluginState expectedState);

}