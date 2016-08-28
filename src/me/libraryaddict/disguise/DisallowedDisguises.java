package me.libraryaddict.disguise;

import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;

public class DisallowedDisguises
{

    public static boolean dragonAllowed = false;
    public static boolean playerAllowed = false;
    public static boolean giantAllowed = false;
    public static boolean ghastAllowed = false;
    public static boolean witherAllowed = false;
    public static boolean slimeAllowed = false;
    public static boolean magmaAllowed = false;
    public static boolean effectCloudAllowed = false;
    public static boolean enderCrystalAllowed = false;
    public static boolean disabled = false;

    public static boolean isAllowed(Disguise disguise)
    {
        return isAllowed(disguise.getType());

    }

    public static boolean isAllowed(DisguiseType type)
    {
        if (type.equals(DisguiseType.ENDER_DRAGON))
        {
            return dragonAllowed;
        }
        if (type.equals(DisguiseType.PLAYER))
        {
            return playerAllowed;
        }
        if (type.equals(DisguiseType.GIANT))
        {
            return giantAllowed;
        }
        if (type.equals(DisguiseType.GHAST))
        {
            return ghastAllowed;
        }
        if (type.equals(DisguiseType.WITHER))
        {
            return witherAllowed;
        }
        if (type.equals(DisguiseType.SLIME))
        {
            return slimeAllowed;
        }

        if (type.equals(DisguiseType.MAGMA_CUBE))
        {
            return magmaAllowed;
        }

        if (type.equals(DisguiseType.AREA_EFFECT_CLOUD))
        {
            return effectCloudAllowed;
        }

        if (type.equals(DisguiseType.ENDER_CRYSTAL))
        {
            return enderCrystalAllowed;
        }
        
            return true;
            
    }
}
