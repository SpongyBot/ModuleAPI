package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.manager.NetworkManager;

public interface Client {

    String getId();

    NetworkManager getNetworkManager();

}