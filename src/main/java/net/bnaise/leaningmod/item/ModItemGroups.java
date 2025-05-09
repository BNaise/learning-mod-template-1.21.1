package net.bnaise.leaningmod.item;

import net.bnaise.leaningmod.LearningMod;
import net.bnaise.leaningmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_TTEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LearningMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.learningmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                    })

                    .build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LearningMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.learningmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                    })

                    .build());

    public static void registerItemGroups() {

        LearningMod.LOGGER.info("Registering Item Groups for" + LearningMod.MOD_ID);

    }
}
