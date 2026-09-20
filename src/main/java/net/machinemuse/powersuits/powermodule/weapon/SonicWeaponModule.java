package net.machinemuse.powersuits.powermodule.weapon;

import java.util.List;

import net.machinemuse.api.IModularItem;
import net.machinemuse.api.moduletrigger.IRightClickModule;
import net.machinemuse.powersuits.powermodule.PowerModuleBase;
import net.machinemuse.utils.MuseCommonStrings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SonicWeaponModule extends PowerModuleBase implements IRightClickModule {

    public static final String MODULE_SONIC_WEAPON = "Sonic Weapon";

    public SonicWeaponModule(List<IModularItem> validItems) {
        super(validItems);
    }

    @Override
    public String getCategory() {
        return MuseCommonStrings.CATEGORY_WEAPON;
    }

    @Override
    public String getDataName() {
        return MODULE_SONIC_WEAPON;
    }

    @Override
    public String getUnlocalizedName() {
        return "sonicWeapon";
    }


    @Override
    public String getTextureFile() {
        return "soundweapon";
    }

    @Override
    public void onRightClick(EntityPlayer playerClicking, World world, ItemStack item) {}

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        return false;
    }

    @Override
    public boolean onItemUseFirst(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        return false;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int par4) {}
}
