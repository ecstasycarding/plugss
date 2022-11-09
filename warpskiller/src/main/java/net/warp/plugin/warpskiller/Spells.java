package net.warp.plugin.warpskiller;

import lombok.Getter;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@Getter
public enum Spells
{
    LOW_ALCH("Low Alch", SpellBook.Standard.LOW_LEVEL_ALCHEMY, 554, 561),
    HIGH_ALCH("High Alch", SpellBook.Standard.HIGH_LEVEL_ALCHEMY, 554 ,561),
    SUPERHEAT("Superheat", SpellBook.Standard.SUPERHEAT_ITEM, 554 ,561);

    private final String spellName;
    private final Spell spellType;
    private final int[] runeID;

    Spells(String spellName, Spell spellType, int... runeID)
    {
        this.spellName = spellName;
        this.spellType = spellType;
        this.runeID = runeID;
    }
}
