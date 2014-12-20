package net.gravitydevelopment.anticheat.manage;

import net.gravitydevelopment.anticheat.AntiCheat;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;

public class PacketManager {

    private ProtocolManager protocolManager;
    private AntiCheat plugin;
    // private AntiCheatManager manager; // dmulloy2

    public PacketManager(ProtocolManager protocolManager, AntiCheat plugin, AntiCheatManager manager) {
        this.protocolManager = protocolManager;
        this.plugin = plugin;
        // this.manager = manager; // dmulloy2
        addListeners();
    }

    // dmulloy2 start - rewrite method
    private void addListeners() {
        // Arm Animation
        protocolManager.addPacketListener(new PacketAdapter(plugin, PacketType.Play.Client.ARM_ANIMATION) {

            @Override
            public void onPacketReceiving(PacketEvent event) {
                if (event.getPacketType() == PacketType.Play.Client.ARM_ANIMATION) {
                    // TODO: Add some functionality here
                }
            }

        });
    }
    // dmulloy2 end
}
