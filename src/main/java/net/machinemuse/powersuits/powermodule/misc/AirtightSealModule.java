package net.machinemuse.powersuits.powermodule.misc;

import java.util.List;

import net.machinemuse.api.IModularItem;
import net.machinemuse.powersuits.powermodule.PowerModuleBase;
import net.machinemuse.utils.MuseCommonStrings;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class AirtightSealModule extends PowerModuleBase {

    public static final String AIRTIGHT_SEAL_MODULE = "Airtight Seal";

    public AirtightSealModule(List<IModularItem> validItems) {
        super(validItems);
        addInstallCost(new ItemStack(Blocks.glass));
    }

    @Override
    public String getCategory() {
        return MuseCommonStrings.CATEGORY_ENVIRONMENTAL;
    }

    @Override
    public String getDataName() {
        return AIRTIGHT_SEAL_MODULE;
    }

    @Override
    public String getUnlocalizedName() {
        return "airtightSeal";
    }


    @Override
    public String getTextureFile() {
        return "glasspane";
    }
}
