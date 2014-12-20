/*
 * AntiCheat for Bukkit.
 * Copyright (C) 2012-2014 AntiCheat Team | http://gravitydevelopment.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package net.gravitydevelopment.anticheat.util;

import org.bukkit.Material;

public enum BlockHardness {
    ACACIA_DOOR(3.00D),
    ACACIA_FENCE(2.00D),
    ACACIA_FENCE_GATE(2.00D),
    ACACIA_STAIRS(2.00D),
    ACTIVATOR_RAIL(0.70D),
    ANVIL(5.00D),
    BARRIER(-1.00D),
    BEACON(3.00D),
    BED(0.20D),
    BED_BLOCK(0.20D),
    BIRCH_DOOR(3.00D),
    BIRCH_FENCE(2.00D),
    BIRCH_FENCE_GATE(2.00D),
    BIRCH_WOOD_STAIRS(2.00D),
    BOOKSHELF(1.50D),
    BREWING_STAND(0.50D),
    BRICK(2.00D),
    BRICK_STAIRS(2.00D),
    BROWN_MUSHROOM(0.00D),
    BURNING_FURNACE(3.50D),
    CACTUS(0.40D),
    CAKE_BLOCK(0.50D),
    CARPET(0.10D),
    CARROT(0.00D),
    CAULDRON(2.00D),
    CHEST(2.50D),
    CLAY(0.60D),
    COAL_BLOCK(5.00D),
    COAL_ORE(3.00D),
    COBBLE_WALL(2.00D),
    COBBLESTONE(2.00D),
    COBBLESTONE_STAIRS(2.00D),
    COCOA(0.20D),
    COMMAND(0.00D),
    CROPS(0.00D),
    DARK_OAK_DOOR(3.00D),
    DARK_OAK_FENCE(2.00D),
    DARK_OAK_FENCE_GATE(2.00D),
    DARK_OAK_STAIRS(2.00D),
    DAYLIGHT_DETECTOR(0.20D),
    DAYLIGHT_DETECTOR_INVERTED(0.20D),
    DEAD_BUSH(0.00D),
    DETECTOR_RAIL(0.70D),
    DIAMOND_BLOCK(5.00D),
    DIAMOND_ORE(3.00D),
    DIODE_BLOCK_OFF(0.00D),
    DIODE_BLOCK_ON(0.00D),
    DIRT(0.50D),
    DISPENSER(3.50D),
    DOUBLE_PLANT(0.00D),
    DOUBLE_STEP(2.00D),
    DOUBLE_STONE_SLAB2(2.00D),
    DRAGON_EGG(3.00D),
    DROPPER(3.50D),
    EMERALD_BLOCK(5.00D),
    EMERALD_ORE(3.00D),
    ENCHANTMENT_TABLE(5.00D),
    ENDER_CHEST(22.50D),
    ENDER_PORTAL(-1.00D),
    ENDER_PORTAL_FRAME(-1.00D),
    ENDER_STONE(3.00D),
    FENCE(2.00D),
    FENCE_GATE(2.00D),
    FIRE(0.00D),
    FLOWER_POT(0.00D),
    FURNACE(3.50D),
    GLASS(0.30D),
    GLOWING_REDSTONE_ORE(3.00D),
    GLOWSTONE(0.30D),
    GOLD_BLOCK(3.00D),
    GOLD_ORE(3.00D),
    GOLD_PLATE(0.50D),
    GRASS(0.60D),
    GRAVEL(0.60D),
    HARD_CLAY(1.25D),
    HAY_BLOCK(0.50D),
    HOPPER(2.00D),
    HUGE_MUSHROOM_1(0.20D),
    HUGE_MUSHROOM_2(0.20D),
    ICE(0.50D),
    IRON_BLOCK(5.00D),
    IRON_DOOR_BLOCK(5.00D),
    IRON_FENCE(5.00D),
    IRON_ORE(3.00D),
    IRON_PLATE(0.50D),
    IRON_TRAPDOOR(3.00D),
    JACK_O_LANTERN(1.00D),
    JUKEBOX(2.00D),
    JUNGLE_DOOR(3.00D),
    JUNGLE_FENCE(2.00D),
    JUNGLE_FENCE_GATE(2.00D),
    JUNGLE_WOOD_STAIRS(2.00D),
    LADDER(0.40D),
    LAPIS_BLOCK(3.00D),
    LAPIS_ORE(3.00D),
    LAVA(0.00D),
    LEAVES(0.20D),
    LEAVES_2(0.20D),
    LEVER(0.50D),
    LOCKED_CHEST(0.00D),
    LOG(2.00D),
    LOG_2(2.00D),
    LONG_GRASS(0.00D),
    MELON_BLOCK(1.00D),
    MELON_STEM(0.00D),
    MOB_SPAWNER(5.00D),
    MONSTER_EGGS(0.750D),
    MOSSY_COBBLESTONE(2.00D),
    MYCEL(0.60D),
    NETHER_BRICK(2.00D),
    NETHER_BRICK_STAIRS(2.00D),
    NETHER_FENCE(2.00D),
    NETHER_WARTS(0.00D),
    NETHERRACK(0.40D),
    NOTE_BLOCK(0.80D),
    OBSIDIAN(50.00D),
    PACKED_ICE(0.50D),
    PISTON_BASE(0.70D),
    PISTON_EXTENSION(0.70D),
    PISTON_MOVING_PIECE(0.70D),
    PISTON_STICKY_BASE(0.70D),
    PORTAL(-1.00D),
    POTATO(0.00D),
    POWERED_RAIL(0.70D),
    PRISMARINE(1.50D),
    PUMPKIN(1.00D),
    PUMPKIN_STEM(0.00D),
    QUARTZ_BLOCK(0.80D),
    QUARTZ_ORE(3.00D),
    QUARTZ_STAIRS(0.80D),
    RAILS(0.70D),
    RED_MUSHROOM(0.00D),
    RED_ROSE(0.00D),
    RED_SANDSTONE(0.80D),
    RED_SANDSTONE_STAIRS(0.80D),
    REDSTONE_BLOCK(5.00D),
    REDSTONE_COMPARATOR_OFF(0.00D),
    REDSTONE_COMPARATOR_ON(0.00D),
    REDSTONE_LAMP_OFF(0.30D),
    REDSTONE_LAMP_ON(0.30D),
    REDSTONE_ORE(3.00D),
    REDSTONE_TORCH_OFF(0.00D),
    REDSTONE_TORCH_ON(0.00D),
    REDSTONE_WIRE(0.00D),
    SAND(0.50D),
    SANDSTONE(0.80D),
    SANDSTONE_STAIRS(0.80D),
    SAPLING(0.00D),
    SEA_LANTERN(0.30D),
    SIGN_POST(1.00D),
    SKULL(1.00D),
    SLIME_BLOCK(0.00D),
    SMOOTH_BRICK(1.50D),
    SMOOTH_STAIRS(1.50D),
    SNOW(0.10D),
    SNOW_BLOCK(0.20D),
    SOIL(0.60D),
    SOUL_SAND(0.50D),
    SPONGE(0.60D),
    SPRUCE_DOOR(3.00D),
    SPRUCE_FENCE(2.00D),
    SPRUCE_FENCE_GATE(2.00D),
    SPRUCE_WOOD_STAIRS(2.00D),
    STAINED_CLAY(1.25D),
    STAINED_GLASS(0.30D),
    STAINED_GLASS_PANE(0.30D),
    STANDING_BANNER(0.00D),
    STATIONARY_LAVA(100.00D),
    STATIONARY_WATER(100.00D),
    STEP(2.00D),
    STONE(1.50D),
    STONE_BUTTON(0.50D),
    STONE_PLATE(0.50D),
    STONE_SLAB2(2.00D),
    SUGAR_CANE_BLOCK(0.00D),
    THIN_GLASS(0.30D),
    TNT(0.00D),
    TORCH(0.00D),
    TRAP_DOOR(3.00D),
    TRAPPED_CHEST(2.50D),
    TRIPWIRE(0.00D),
    TRIPWIRE_HOOK(0.00D),
    VINE(0.20D),
    WALL_BANNER(0.00D),
    WALL_SIGN(1.00D),
    WATER(100.00D),
    WATER_LILY(0.00D),
    WEB(4.00D),
    WOOD(2.00D),
    WOOD_BUTTON(0.50D),
    WOOD_DOUBLE_STEP(2.00D),
    WOOD_PLATE(0.50D),
    WOOD_STAIRS(2.00D),
    WOOD_STEP(2.00D),
    WOODEN_DOOR(3.00D),
    WOOL(0.80D),
    WORKBENCH(2.50D),
    YELLOW_FLOWER(0.00D);

    private final double hardness;
    private final Material mat;

    private BlockHardness(double hardness) {
        this.mat = Material.getMaterial(name());
        this.hardness = hardness;
    }

    public static double getBlockHardness(Material m) {
        BlockHardness h = getHardness(m);
        return h == null ? 0D : h.hardness;
    }

    public static BlockHardness getHardness(Material m) {
        for (BlockHardness e : BlockHardness.values()) {
            if (e.mat == null) {
                throw new NullPointerException("Could not find mat for " + e);
            }
            if (e.mat.equals(m)) {
                return e;
            }
        }
        return null;
    }

    public static boolean hasBlockHardness(Material m) {
        return getHardness(m) != null;
    }

}
