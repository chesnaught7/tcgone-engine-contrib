package tcgwars.logic.impl.gen3;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum TeamRocketReturns implements CardInfo {
	
	AZUMARILL_1 ("Azumarill", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DARK_AMPHAROS_2 ("Dark Ampharos", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_CROBAT_3 ("Dark Crobat", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_ELECTRODE_4 ("Dark Electrode", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_HOUNDOOM_5 ("Dark Houndoom", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_HYPNO_6 ("Dark Hypno", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_MAROWAK_7 ("Dark Marowak", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_OCTILLERY_8 ("Dark Octillery", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_SLOWKING_9 ("Dark Slowking", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_STEELIX_10 ("Dark Steelix", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	JUMPLUFF_11 ("Jumpluff", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	KINGDRA_12 ("Kingdra", 12, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	PILOSWINE_13 ("Piloswine", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	TOGETIC_14 ("Togetic", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DARK_DRAGONITE_15 ("Dark Dragonite", 15, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_MUK_16 ("Dark Muk", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_RATICATE_17 ("Dark Raticate", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_SANDSLASH_18 ("Dark Sandslash", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_TYRANITAR_19 ("Dark Tyranitar", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_TYRANITAR_20 ("Dark Tyranitar", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	DELIBIRD_21 ("Delibird", 21, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	FURRET_22 ("Furret", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	LEDIAN_23 ("Ledian", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	MAGBY_24 ("Magby", 24, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
	MISDREAVUS_25 ("Misdreavus", 25, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	QUAGSIRE_26 ("Quagsire", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	QWILFISH_27 ("Qwilfish", 27, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	YANMA_28 ("Yanma", 28, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	DARK_ARBOK_29 ("Dark Arbok", 29, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_ARIADOS_30 ("Dark Ariados", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_DRAGONAIR_31 ("Dark Dragonair", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_DRAGONAIR_32 ("Dark Dragonair", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_FLAAFFY_33 ("Dark Flaaffy", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_GOLBAT_34 ("Dark Golbat", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_GOLDUCK_35 ("Dark Golduck", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_GYARADOS_36 ("Dark Gyarados", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_HOUNDOOM_37 ("Dark Houndoom", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_MAGCARGO_38 ("Dark Magcargo", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_MAGNETON_39 ("Dark Magneton", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_PUPITAR_40 ("Dark Pupitar", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_PUPITAR_41 ("Dark Pupitar", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DARK_WEEZING_42 ("Dark Weezing", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	HERACROSS_43 ("Heracross", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	MAGMAR_44 ("Magmar", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	MANTINE_45 ("Mantine", 45, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	ROCKET_S_MEOWTH_46 ("Rocket's Meowth", 46, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
	ROCKET_S_WOBBUFFET_47 ("Rocket's Wobbuffet", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
	SEADRA_48 ("Seadra", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	SKIPLOOM_49 ("Skiploom", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TOGEPI_50 ("Togepi", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	CUBONE_51 ("Cubone", 51, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DRATINI_52 ("Dratini", 52, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	DRATINI_53 ("Dratini", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	DROWZEE_54 ("Drowzee", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	EKANS_55 ("Ekans", 55, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	GRIMER_56 ("Grimer", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	HOPPIP_57 ("Hoppip", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	HORSEA_58 ("Horsea", 58, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	HOUNDOUR_59 ("Houndour", 59, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	HOUNDOUR_60 ("Houndour", 60, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	KOFFING_61 ("Koffing", 61, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	LARVITAR_62 ("Larvitar", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	LARVITAR_63 ("Larvitar", 63, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	LEDYBA_64 ("Ledyba", 64, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MAGIKARP_65 ("Magikarp", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAGNEMITE_66 ("Magnemite", 66, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MAREEP_67 ("Mareep", 67, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MARILL_68 ("Marill", 68, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	ONIX_69 ("Onix", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PSYDUCK_70 ("Psyduck", 70, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	RATTATA_71 ("Rattata", 71, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	RATTATA_72 ("Rattata", 72, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	REMORAID_73 ("Remoraid", 73, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SANDSHREW_74 ("Sandshrew", 74, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SENTRET_75 ("Sentret", 75, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SLOWPOKE_76 ("Slowpoke", 76, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SLUGMA_77 ("Slugma", 77, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	SPINARAK_78 ("Spinarak", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SWINUB_79 ("Swinub", 79, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	VOLTORB_80 ("Voltorb", 80, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	WOOPER_81 ("Wooper", 81, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	ZUBAT_82 ("Zubat", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	COPYCAT_83 ("Copycat", 83, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_RETRIEVER_84 ("Pokémon Retriever", 84, Rarity.UNCOMMON, [TRAINER]),
	POW__HAND_EXTENSION_85 ("Pow! Hand Extension", 85, Rarity.UNCOMMON, [TRAINER]),
	ROCKET_S_ADMIN__86 ("Rocket's Admin.", 86, Rarity.UNCOMMON, [TRAINER]),
	ROCKET_S_HIDEOUT_87 ("Rocket's Hideout", 87, Rarity.UNCOMMON, [TRAINER]),
	ROCKET_S_MISSION_88 ("Rocket's Mission", 88, Rarity.UNCOMMON, [TRAINER]),
	ROCKET_S_POKE_BALL_89 ("Rocket's Poké Ball", 89, Rarity.UNCOMMON, [TRAINER]),
	ROCKET_S_TRICKY_GYM_90 ("Rocket's Tricky Gym", 90, Rarity.UNCOMMON, [STADIUM, TRAINER]),
	SURPRISE__TIME_MACHINE_91 ("Surprise! Time Machine", 91, Rarity.UNCOMMON, [TRAINER]),
	SWOOP__TELEPORTER_92 ("Swoop! Teleporter", 92, Rarity.UNCOMMON, [TRAINER]),
	VENTURE_BOMB_93 ("Venture Bomb", 93, Rarity.UNCOMMON, [TRAINER]),
	DARK_METAL_ENERGY_94 ("Dark Metal Energy", 94, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	R_ENERGY_95 ("R Energy", 95, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	ROCKET_S_ARTICUNO_EX_96 ("Rocket's Articuno ex", 96, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_ENTEI_EX_97 ("Rocket's Entei ex", 97, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_HITMONCHAN_EX_98 ("Rocket's Hitmonchan ex", 98, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_MEWTWO_EX_99 ("Rocket's Mewtwo ex", 99, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_MOLTRES_EX_100 ("Rocket's Moltres ex", 100, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_SCIZOR_EX_101 ("Rocket's Scizor ex", 101, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_SCYTHER_EX_102 ("Rocket's Scyther ex", 102, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_SNEASEL_EX_103 ("Rocket's Sneasel ex", 103, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_SNORLAX_EX_104 ("Rocket's Snorlax ex", 104, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_SUICUNE_EX_105 ("Rocket's Suicune ex", 105, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	ROCKET_S_ZAPDOS_EX_106 ("Rocket's Zapdos ex", 106, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_, EX]),
	MUDKIP_STAR_107 ("Mudkip Star", 107, Rarity.ULTRARARE, [BASIC, POKEMON, _WATER_]),
	TORCHIC_STAR_108 ("Torchic Star", 108, Rarity.ULTRARARE, [BASIC, POKEMON, _FIRE_]),
	TREECKO_STAR_109 ("Treecko Star", 109, Rarity.ULTRARARE, [BASIC, POKEMON, _GRASS_]),
	CHARMELEON_110 ("Charmeleon", 110, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	HERE_COMES_TEAM_ROCKET__111 ("Here Comes Team Rocket!", 111, Rarity.HOLORARE, [TRAINER]);
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	TeamRocketReturns(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
		this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
		this.name = name;
		this.rarity = rarity;
		this.collectionLineNo = collectionLineNo;
	}

	@Override
	public CardTypeSet getCardTypes() {
		return cardTypes;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Rarity getRarity() {
		return rarity;
	}

	@Override
	public int getCollectionLineNo() {
		return collectionLineNo;
	}

	@Override
	public tcgwars.logic.card.Collection getCollection() {
		return tcgwars.logic.card.Collection.TEAM_ROCKET_RETURNS;
	}

	@Override
	public String toString() {
		return String.format("%s:%s", this.name(), this.getCollection().name());
	}

    @Override
    public String getEnumName() {
        return name();
    }

	@Override
	public Card getImplementation() {
		switch (this) {
			case AZUMARILL_1:
			return evolution (this, from:"Marill", hp:HP080, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokePower "Froth", {
					text "Once during your turn, when you play Azumarill from your hand to evolve 1 of your Active Pokémon, you may use this power. Each Defending Pokémon is now Paralyzed."
					actionA {
					}
				}
				move "Water Punch", {
					text "20+ damage. Flip a coin for each [W] Energy attached to Azumarill. This attack does 20 damage plus 20 more damage for each heads."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_AMPHAROS_2:
			return evolution (this, from:"Dark Flaaffy", hp:HP120, type:[DARKNESS, LIGHTNING], retreatCost:2) {
				weakness FIGHTING
				pokeBody "Darkest Impulse", {
					text "As long as Dark Ampharos is in play, whenever your opponent plays an Evolution card from his or her hand to evolve 1 of his or her Pokémon, put 2 damage counters on that Pokémon. You can’t use more than 1 Darkest Impulse Poké-Body each turn."
					delayedA {
					}
				}
				move "Ram", {
					text "30 damage"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shock Bolt", {
					text "70 damage. Discard all [L] Energy attached to Dark Ampharos."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_CROBAT_3:
			return evolution (this, from:"Dark Golbat", hp:HP090, type:[DARKNESS, GRASS], retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokePower "Black Beam", {
					text "Once during your turn (before your attack), if Dark Crobat is your Active Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. This power can’t be used if Dark Crobat is affected by a Special Condition."
					actionA {
					}
				}
				move "Dark Drain", {
					text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Remove from Dark Crobat a number of damage counters equal to the number of your opponent’s Pokémon in play."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Skill Dive", {
					text "Does 30 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_ELECTRODE_4:
			return evolution (this, from:"Voltorb", hp:HP070, type:[DARKNESS, LIGHTNING], retreatCost:1) {
				weakness FIGHTING
				pokePower "Darkness Navigation", {
					text "Once during your turn (before your attack), if Dark Electrode has no Energy attached to it, you may search your deck for a [D] or Dark Metal Energy and attach it to Dark Electrode. Shuffle your deck afterward. This power can’t be used if Dark Electrode is affected by a Special Condition."
					actionA {
					}
				}
				move "Energy Bomb", {
					text "30 damage. You may move all Energy cards attached to Dark Electrode to your Benched Pokémon in any way you like."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_HOUNDOOM_5:
			return evolution (this, from:"Houndour", hp:HP070, type:[DARKNESS, FIRE], retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Shakedown", {
					text "20 damage. Choose a card from your opponent’s hand without looking and discard it."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dark Fire", {
					text "40+ damage. You may discard a [R] Energy or [D] Energy attached to Dark Houndoom. If you do, this attack does 40 damage plus 20 more damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_HYPNO_6:
			return evolution (this, from:"Drowzee", hp:HP070, type:[DARKNESS, PSYCHIC], retreatCost:1) {
				weakness PSYCHIC
				move "Dark Link", {
					text "Flip a coin. If heads, choose an attack on 1 of your Pokémon in play that has Dark in its name (excluding this one). Dark Link copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Dark Hypno’s type is still .) Dark Hypno performs that attack."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Black Magic", {
					text "20× damage. Does 20 damage times the number of your opponent’s Benched Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MAROWAK_7:
			return evolution (this, from:"Cubone", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:1) {
				weakness GRASS
				move "Brick Smash", {
					text "30 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hard Bone", {
					text "70 damage. Discard a Basic Pokémon or Evolution card from your hand or this attack does nothing."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_OCTILLERY_8:
			return evolution (this, from:"Remoraid", hp:HP070, type:[DARKNESS, WATER], retreatCost:1) {
				weakness LIGHTNING
				move "Black Suction Cups", {
					text "Does 10 damage to each Defending Pokémon. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ink Blast", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to Dark Octillery but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_SLOWKING_9:
			return evolution (this, from:"Slowpoke", hp:HP080, type:[DARKNESS, PSYCHIC], retreatCost:1) {
				weakness GRASS
				pokePower "Cunning", {
					text "Once during your turn (before your attack), you may look at the top card of your opponent’s deck. Then, you may shuffle his or her deck. This power can’t be used if Dark Slowking is affected by a Special Condition."
					actionA {
					}
				}
				move "Litter", {
					text "20+ damage. You may discard a combination of up to 2 Pokémon Tool cards and Rocket’s Secret Machine cards from your hand. If you do, this attack does 20 damage plus 30 more damage for each card you discarded."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_STEELIX_10:
			return evolution (this, from:"Onix", hp:HP110, type:[DARKNESS, METAL], retreatCost:4) {
				weakness FIRE
				resistance GRASS, MINUS30
				move "Energy Link", {
					text "20 damage. Search your discard pile for an Energy card and attach it to Dark Steelix."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Impact", {
					text "60 damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JUMPLUFF_11:
			return evolution (this, from:"Skiploom", hp:HP090, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance WATER, MINUS30
				pokeBody "Buffer", {
					text "If Jumpluff would be Knocked Out by an opponent’s attack, flip a coin. If heads, Jumpluff is not Knocked Out and its remaining HP becomes 10 instead."
					delayedA {
					}
				}
				move "Energy Crush", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to all of your opponent’s Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KINGDRA_12:
			return evolution (this, from:"Seadra", hp:HP120, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				pokeBody "Dragon Veil", {
					text "As long as Kingdra is in play, each of your Active Pokémon has no Weakness."
					delayedA {
					}
				}
				move "Hyper Whirlpool", {
					text "20 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Sonic", {
					text "50 damage. This attack’s damage is not affected by Resistance."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PILOSWINE_13:
			return evolution (this, from:"Swinub", hp:HP100, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				move "Sheer Cold", {
					text "20 damage. Flip a coin. If heads, each Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tonnage", {
					text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Piloswine does 30 damage to itself."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOGETIC_14:
			return evolution (this, from:"Togepi", hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Holy Shield", {
					text "Prevent all effects of attacks, including damage, done to Togetic by your opponent’s Pokémon that has Dark in its name."
					delayedA {
					}
				}
				move "Dive", {
					text "30 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rainbow Moves", {
					text "Choose 1 of your opponent’s Benched Pokémon’s attacks. Rainbow Moves copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Togetic’s type is still [C].) Togetic performs that attack."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DRAGONITE_15:
			return evolution (this, from:"Dark Dragonair", hp:HP120, type:DARKNESS, retreatCost:2) {
				weakness COLORLESS
				resistance FIGHTING
				pokePower "Dark Trance", {
					text "As often as you like during your turn (before your attack), you may move a [D] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Dark Dragonite is affected by a Special Condition."
					actionA {
					}
				}
				move "Double Wing Attack", {
					text "Does 30 damage to each Defending Pokémon."
					energyCost W, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Claw Swipe", {
					text "50 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MUK_16:
			return evolution (this, from:"Grimer", hp:HP080, type:[DARKNESS, GRASS], retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Sticky Goo", {
					text "As long as Dark Muk is your Active Pokémon, your opponent pays [C][C] more to retreat his or her Active Pokémon."
					delayedA {
					}
				}
				move "Slimy Water", {
					text "10× damage. Does 10 damage times the number of [C] Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Acidic Poison", {
					text "10 damage. The Defending Pokémon is now Burned and Poisoned."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_RATICATE_17:
			return evolution (this, from:"Rattata", hp:HP070, type:DARKNESS, retreatCost:0) {
				weakness FIGHTING
				move "Dark Seed", {
					text "The Defending Pokémon can’t retreat during your opponent’s next turn. Put 5 damage counters on the Defending Pokémon at the end of your opponent’s next turn."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spread Poison", {
					text "10 damage. The Defending Pokémon is now Poisoned. This attack does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_SANDSLASH_18:
			return evolution (this, from:"Sandshrew", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:0) {
				weakness GRASS
				pokeBody "Poison Payback", {
					text "If Dark Sandslash is your Active Pokémon and is damaged by an opponent’s attack (even if Dark Sandslash is Knocked Out), the Attacking Pokémon is now Poisoned."
					delayedA {
					}
				}
				move "Swift", {
					text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_TYRANITAR_19:
			return evolution (this, from:"Dark Pupitar", hp:HP120, type:DARKNESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Grind", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Dark Tyranitar."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spinning Tail", {
					text "Does 20 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite Off", {
					text "70+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 70 damage plus 50 more damage."
					energyCost D, D, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_TYRANITAR_20:
			return evolution (this, from:"Dark Pupitar", hp:HP120, type:[DARKNESS, FIGHTING], retreatCost:3) {
				weakness GRASS
				pokeBody "Sand Damage", {
					text "As long as Dark Tyranitar is your Active Pokémon, put 1 damage counter on each of your opponent’s Benched Basic Pokémon between turns. You can’t use more than 1 Sand Damage Poké-Body between turns."
					delayedA {
					}
				}
				move "Second Strike", {
					text "50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 20 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DELIBIRD_21:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness METAL
				pokePower "Gift Exchange", {
					text "Once during your turn (before your attack), if Delibird is your Active Pokémon, you may shuffle 1 card from your hand into your deck. Then, draw a card. This power can’t be used if Delibird is affected by a Special Condition."
					actionA {
					}
				}
				move "Souvenir", {
					text "Flip 3 coins. If 1 of them is heads, put 4 damage counters on the Defending Pokémon. If 2 of them are heads, remove 1 damage counter from the Defending Pokémon. If all of them are heads, put 10 damage counters on the Defending Pokémon. If all of them are tails, remove all damage counters from the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FURRET_22:
			return evolution (this, from:"Sentret", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Quick Change", {
					text "Choose up to 3 cards in your hand and put them on top of your deck. Then, search your deck for that many cards and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Tail Smash", {
					text "30 damage. Before doing damage, you may flip a coin. If heads, this attack does 80 damage instead. If tails, this attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LEDIAN_23:
			return evolution (this, from:"Ledyba", hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				pokeBody "Powder Protection", {
					text "Any damage done to Ledian by attacks from Pokémon that has an owner in its name is reduced by 40."
					delayedA {
					}
				}
				move "Split Spiral Punch", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tackle", {
					text "50 damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGBY_24:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				pokePower "Baby Evolution", {
					text "Once during your turn (before your attack), you may put Magmar from your hand onto Magby (this counts as evolving Magby), and remove all damage counters from Magby."
					actionA {
					}
				}
				move "Detour", {
					text "If you have a Supporter card in play, use the effect on that card as the effect of this attack."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MISDREAVUS_25:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				resistance FIGHTING, MINUS30
				pokePower "Dark Spell", {
					text "Once during your turn (before your attack), if Misdreavus is your Active Pokémon, you may flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. This power can’t be used if Misdreavus is affected by a Special Condition or if your other Active Pokémon is not Misdreavus."
					actionA {
					}
				}
				move "Hide in Shadows", {
					text "20 damage. Switch Misdreavus with 1 of your Benched Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QUAGSIRE_26:
			return evolution (this, from:"Wooper", hp:HP080, type:WATER, retreatCost:2) {
				weakness GRASS
				pokeBody "Saturation", {
					text "When you attach a [W] Energy card from your hand to Quagsire, remove all Special Conditions and 2 damage counters from Quagsire."
					delayedA {
					}
				}
				move "Hyper Pump", {
					text "20+ damage. Does 20 damage plus 20 more damage for each basic Energy card attached to Quagsire but not used to pay for this attack’s Energy cost. You can’t add more than 60 damage in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QWILFISH_27:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Spiny", {
					text "If Qwilfish is your Active Pokémon and is damaged by an opponent’s attack (even if Qwilfish is Knocked Out), flip a coin until you get tails. For each heads, put 1 damage counter on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Stun Poison", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMA_28:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Quick Charge", {
					text "Search your deck for up to 4 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_ARBOK_29:
			return evolution (this, from:"Ekans", hp:HP090, type:[DARKNESS, GRASS], retreatCost:1) {
				weakness PSYCHIC
				move "Swallow Up", {
					text "10+ damage. Before doing damage, count the remaining HP of the Defending Pokémon and Dark Arbok. If the Defending Pokémon has fewer remaining HP than Dark Arbok’s, this attack does 10 damage plus 30 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Extra Poison", {
					text "30 damage. If the Defending Pokémon is Pokémon-ex, the Defending Pokémon is now Asleep and Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_ARIADOS_30:
			return evolution (this, from:"Spinarak", hp:HP070, type:[DARKNESS, GRASS], retreatCost:1) {
				weakness FIRE
				move "Super Poison Breath", {
					text "Each Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Breaking Impact", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage for each [C] Energy in that Pokémon’s Retreat Cost (after applying effects to the Retreat Cost). (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DRAGONAIR_31:
			return evolution (this, from:"Dratini", hp:HP070, type:DARKNESS, retreatCost:1) {
				weakness COLORLESS
				resistance FIGHTING
				pokePower "Evolutionary Light", {
					text "Once during your turn (before your attack), if Dark Dragonair is your Active Pokémon, you may search your deck for an Evolution card. Show it to your opponent and put it into your hand. Shuffle your deck afterward. This power can’t be used if Dark Dragonair is affected by a Special Condition."
					actionA {
					}
				}
				move "Dragon Rage", {
					text "30 damage."
					energyCost W, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DRAGONAIR_32:
			return evolution (this, from:"Dratini", hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness COLORLESS
				resistance FIGHTING
				move "Double Tackle", {
					text "Does 20 damage to each Defending Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Crushing Blow", {
					text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_FLAAFFY_33:
			return evolution (this, from:"Mareep", hp:HP080, type:[DARKNESS, LIGHTNING], retreatCost:1) {
				weakness FIGHTING
				move "Thunder Slash", {
					text "10 damage. If the Defending Pokémon is a Basic Pokémon, the Defending Pokémon is now Paralyzed. Dark Flaaffy can’t use Thunder Slash during your next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Headbutt", {
					text "20 damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GOLBAT_34:
			return evolution (this, from:"Zubat", hp:HP070, type:[DARKNESS, GRASS], retreatCost:0) {
				weakness PSYCHIC
				move "Night Ambush", {
					text "Does 30 damage to 1 of your opponent’s Pokémon. Dark Golbat can’t attack during your next turn. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GOLDUCK_35:
			return evolution (this, from:"Psyduck", hp:HP070, type:[DARKNESS, WATER], retreatCost:1) {
				weakness LIGHTNING
				move "Darkness Shield", {
					text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to each of your Active Pokémon during your opponent’s next turn."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cold Crush", {
					text "40 damage. You may discard an Energy card attached to Dark Golduck. If you do, discard an Energy attached to the Defending Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GYARADOS_36:
			return evolution (this, from:"Magikarp", hp:HP080, type:[DARKNESS, WATER], retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Dark Scale", {
					text "If Dark Gyarados is your Active Pokémon and is Knocked Out by an opponent’s attack, put 3 damage counters on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Sharp Fang", {
					text "30 damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dark Streak", {
					text "40 damage. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_HOUNDOOM_37:
			return evolution (this, from:"Houndour", hp:HP070, type:[DARKNESS, FIRE], retreatCost:1) {
				weakness WATER
				pokePower "Fire Breath", {
					text "Once during your turn (before your attack), if Dark Houndoom is your Active Pokémon, you may flip a coin. If heads, the Defending Pokémon (choose 1 if there are 2) is now Burned. This power can’t be used if Dark Houndoom is affected by a Special Condition."
					actionA {
					}
				}
				move "Fire Payback", {
					text "40+ damage. If you have less Benched Pokémon than your opponent, this attack does 40 damage plus 20 more damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MAGCARGO_38:
			return evolution (this, from:"Slugma", hp:HP080, type:[DARKNESS, FIRE], retreatCost:2) {
				weakness WATER
				move "Energy Press", {
					text "10+ damage. Does 10 damage plus 10 more damage for each basic Energy card attached to all of your Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MAGNETON_39:
			return evolution (this, from:"Magnemite", hp:HP070, type:[DARKNESS, LIGHTNING], retreatCost:1) {
				weakness FIGHTING
				move "Magnetic Lines", {
					text "20 damage. If your opponent has at least 2 Pokémon in play, move a basic Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Pulse", {
					text "40 damage. The Defending Pokémon is now Poisoned."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_PUPITAR_40:
			return evolution (this, from:"Larvitar", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:1) {
				weakness GRASS
				move "Explosive Evolution", {
					text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance.) Then, search your deck for a card that evolves from Dark Pupitar and put it on Dark Pupitar. (This counts as evolving Dark Pupitar.) Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Tackle", {
					text "Does 20 damage to each Defending Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_PUPITAR_41:
			return evolution (this, from:"Larvitar", hp:HP080, type:[DARKNESS, FIGHTING], retreatCost:2) {
				weakness GRASS
				move "Dark Streak", {
					text "20 damage. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rock Tumble", {
					text "40 damage. This attack’s damage is not affected by Resistance."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_WEEZING_42:
			return evolution (this, from:"Koffing", hp:HP080, type:[DARKNESS, GRASS], retreatCost:2) {
				weakness PSYCHIC
				pokeBody "Methane Leak", {
					text "As long as Dark Weezing is your Active Pokémon, put 1 damage counter on each Pokémon that remains Poisoned between turns."
					delayedA {
					}
				}
				move "Smog", {
					text "The Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Darkness Charge", {
					text "50 damage. Put 2 damage counters on Dark Weezing."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERACROSS_43:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Crust", {
					text "Any damage done to Heracross by attacks from your opponent’s Basic Pokémon is reduced by 20 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Get Even", {
					text "20+ damage. If you have more Prize cards left than your opponent, this attack does 20 damage plus 10 more damage for each Prize card more than your opponent."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMAR_44:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Dump and Draw", {
					text "Discard up to 2 Energy cards from your hand. Then, draw 2 cards for each Energy card you discarded."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flame Tail", {
					text "40 damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANTINE_45:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokePower "Ripples", {
					text "Once during your turn (before your attack), you may remove 1 damage counter from 1 of your Pokémon (excluding Mantine). This power can’t be used if Mantine is affected by a Special Condition."
					actionA {
					}
				}
				move "Aqua Slash", {
					text "30 damage. Mantine can’t attack during your next turn."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_MEOWTH_46:
			return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				move "Snatch and Run", {
					text "Search your deck for a Pokémon Tool card or Rocket’s Secret Machine card, show it to your opponent, and put it into your hand. If you do, you may switch Rocket’s Meowth with 1 of your Benched Pokémon. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Miraculous Comeback", {
					text "10× damage. Flip a coin for each Pokémon in play (both yours and your opponent’s). This attack does 10 damage times the number of heads. Rocket’s Meowth does 10 damage times the number of tails to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_WOBBUFFET_47:
			return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
				weakness PSYCHIC
				move "Dark Aid", {
					text "Search your discard pile for Pokémon Tool cards and Rocket’s Secret Machine cards. You may show either 1 Pokémon Tool card or Rocket’s Secret Machine card to your opponent and put it into your hand, or show a combination of 3 Pokémon Tool cards or Rocket’s Secret Machine cards to your opponent and shuffle them into your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Amnesia", {
					text "10 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEADRA_48:
			return evolution (this, from:"Horsea", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Confuse Ray", {
					text "10 damage. The Defending Pokémon is now Confused."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Trick", {
					text "30 damage. Move 1 Energy card attached to the Defending Pokémon to 1 of your opponent’s Benched Pokémon. If your opponent has no Benched Pokémon, this effect does nothing."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKIPLOOM_49:
			return evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance WATER, MINUS30
				pokeBody "Buffer", {
					text "If Skiploom would be Knocked Out by an opponent’s attack, flip a coin. If heads, Skiploom is not Knocked Out and its remaining HP becomes 10 instead."
					delayedA {
					}
				}
				move "Miracle Powder", {
					text "10 damage. Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOGEPI_50:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Yawn", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mini-Metronome", {
					text "Flip a coin. If heads, choose 1 of the Defending Pokémon’s attacks. Mini-Metronome copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Togepi’s type is still [C].) Togepi performs that attack."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CUBONE_51:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Look for Friends", {
					text "Reveal cards from your deck until you reveal a Basic Pokémon. Show that card to your opponent and put it into your hand. Shuffle the other revealed cards into your deck. (If you don’t reveal a Basic Pokémon, shuffle all the revealed cards back into your deck.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bonemerang", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRATINI_52:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				move "Pound", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRATINI_53:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness COLORLESS
				resistance FIGHTING
				move "Dragon Song", {
					text "Each Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Strike", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost W, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DROWZEE_54:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Insomnia", {
					text "Drowzee can’t be Asleep."
					actionA {
					}
				}
				move "Soothing Wave", {
					text "10 damage. Flip a coin. If heads, each Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EKANS_55:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Tail Wrap", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRIMER_56:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Taunt", {
					text "Choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spit Poison", {
					text "10 damage. The Defending Pokémon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOPPIP_57:
			return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
				weakness FIRE
				resistance WATER, MINUS30
				pokeBody "Buffer", {
					text "If Hoppip would be Knocked Out by an opponent’s attack, flip a coin. If heads, Hoppip is not Knocked Out and its remaining HP becomes 10 instead."
					delayedA {
					}
				}
				move "Miracle Powder", {
					text "Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HORSEA_58:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Water Plant", {
					text "Search your discard pile for up to 2 [W] Energy cards, show them to your opponent, and put them into your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "30 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOUNDOUR_59:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Rear Kick", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smokescreen", {
					text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOUNDOUR_60:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				pokeBody "Dark Lift", {
					text "If Houndour has any [D] Energy attached to it, the Retreat Cost for Houndour is 0."
					delayedA {
					}
				}
				move "Firebreathing", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING_61:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Knockout Gas", {
					text "If Koffing is your Active Pokémon and is Knocked Out by an opponent’s attack, the Attacking Pokémon is now Confused and Poisoned."
					delayedA {
					}
				}
				move "Gnaw", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LARVITAR_62:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Fury Attack", {
					text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LARVITAR_63:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Light Punch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dig Drain", {
					text "20 damage. Remove 1 damage counter from Larvitar."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LEDYBA_64:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Call for Family", {
					text "Search your deck for a [G] Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Beat", {
					text "20 damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP_65:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Call for Friends", {
					text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEMITE_66:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Sonicboom", {
					text "10 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAREEP_67:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Minor Errand-Running", {
					text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MARILL_68:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Minor Errand-Running", {
					text "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ONIX_69:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
				weakness WATER
				move "Horn Rush", {
					text "10 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Granite Head", {
					text "20 damage. During your opponent’s next turn, any damage done to Onix by attacks is reduced by 10 (after applying Weakness and Resistance)."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PSYDUCK_70:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Gentle Slap", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Headache", {
					text "Flip a coin. If heads, your opponent can’t play a Trainer card from his or her hand until the end of your opponent’s next turn."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA_71:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				pokeBody "Scramble", {
					text "As long as your opponent has any Pokémon-ex as his or her Active Pokémon, the Retreat Cost for Rattata is 0."
					delayedA {
					}
				}
				move "Fury Swipes", {
					text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA_72:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Snarl", {
					text "Flip a coin. If heads, this attack does 10 damage to the Defending Pokémon. If tails, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case REMORAID_73:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Energy Draw", {
					text "Flip a coin. If heads, search your deck for a basic Energy card and attach it to Remoraid. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Fin", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SANDSHREW_74:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Rear Kick", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SENTRET_75:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Friend Search", {
					text "Look at the top 5 cards of your deck. Choose a Basic Pokémon or Evolution card you find there, show it to your opponent, and put it into your hand. Put the other 4 cards back on top of your deck. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Surprise Attack", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWPOKE_76:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Dense", {
					text "Any damage done to Slowpoke by attacks from your opponent’s Evolved Pokémon is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLUGMA_77:
			return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Singe", {
					text "Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heat Tackle", {
					text "30 damage. Slugma does 10 damage to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPINARAK_78:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rising Lunge", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWINUB_79:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rest", {
					text "Remove all Special Conditions and all damage counters from Swinub. Swinub is now Asleep."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB_80:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Psycho Waves", {
					text "Discard an Energy card attached to Voltorb. The Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Wave", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WOOPER_81:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness GRASS
				pokeBody "Saturation", {
					text "When you attach a [W] Energy card from your hand to Wooper, remove all Special Conditions and 1 damage counter from Wooper."
					delayedA {
					}
				}
				move "Wave Splash", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZUBAT_82:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Dark Streak", {
					text "Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ambush", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case COPYCAT_83:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, count the number of cards in your opponent’s hand and draw that many cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_RETRIEVER_84:
			return basicTrainer (this) {
				text "Search your discard pile for Basic Pokémon and Evolution cards. You may either show 1 Basic Pokémon or Evolution card to your opponent and put it into your hand, or show a combination of 3 Basic Pokémon or Evolution cards to your opponent and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case POW__HAND_EXTENSION_85:
			return basicTrainer (this) {
				text "You may use this card only if you have more Prize cards left than your opponent.\nMove 1 Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon. Or, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKET_S_ADMIN__86:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player shuffles his or her hand into his or her deck. Then, each player counts his or her Prize cards left and draws up to that many cards. (You draw your cards first.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKET_S_HIDEOUT_87:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play.\nEach Pokémon in play with Dark or Rocket’s in its name (both yours and your opponent’s) gets +20 HP."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKET_S_MISSION_88:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDiscard a card from your hand. Then, draw 3 cards. If you discarded a Pokémon that has Dark or Rocket’s in its name, draw 4 cards instead."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKET_S_POKE_BALL_89:
			return basicTrainer (this) {
				text "Search your deck for a Pokémon that has Dark in its name, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKET_S_TRICKY_GYM_90:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play.\nEach Pokémon with Dark or Rocket’s in its name (both yours and your opponent’s) can use attacks on this card instead of its own.\n[C] Feint Attack: Does 20 damage to 1 of your opponent’s Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case SURPRISE__TIME_MACHINE_91:
			return basicTrainer (this) {
				text "Choose 1 of your Evolved Pokémon, remove the highest Stage Evolution card from it, and shuffle it into your deck (this counts as devolving that Pokémon). If that Pokémon remains in play, search your deck for an Evolution card that evolves from that Pokémon and put it onto that Pokémon (this counts as evolving that Pokémon). Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWOOP__TELEPORTER_92:
			return basicTrainer (this) {
				text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and switch it with 1 of your Basic Pokémon (excluding Pokémon-ex) in play. (Any cards attached to that Pokémon, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Place the first Basic Pokémon in the discard pile. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case VENTURE_BOMB_93:
			return basicTrainer (this) {
				text "Flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. If tails, put 1 damage counter on 1 of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARK_METAL_ENERGY_94:
			return specialEnergy (this, [[C]]) {
				text "Attach Dark Metal Energy to 1 of your Pokémon. While in play, Dark Metal Energy provides [D] Energy and [M] Energy, but provides only 1 Energy at a time. (Doesn’t count as a basic Energy card when not in play and has no effect other than providing Energy.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case R_ENERGY_95:
			return specialEnergy (this, [[C]]) {
				text "R Energy can be attached only to a Pokémon that have Dark or Rocket’s in its name. While in play, R Energy provides 2 [D] Energy. (Doesn’t count as a basic Energy card.) If the Pokémon R Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). When your turn ends, discard R Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case ROCKET_S_ARTICUNO_EX_96:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness METAL
				pokeBody "Darkness Veil", {
					text "As long as Rocket’s Articuno ex has any [D] Energy attached to it, prevent all effects, except damage, by an opponent’s attack done to Rocket’s Articuno ex."
					delayedA {
					}
				}
				move "Freeze Solid", {
					text "10 damage. Search your discard pile for a [W] Energy card and attach it to Rocket’s Articuno ex."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ice Wing", {
					text "50 damage."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_ENTEI_EX_97:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness WATER
				pokeBody "Dark Condition", {
					text "As long as Rocket’s Entei ex has any [D] Energy attached to it, Rocket’s Entei ex has no Weakness."
					delayedA {
					}
				}
				move "Energy Link", {
					text "10 damage. Search your discard pile for an Energy card and attach it to Rocket’s Entei ex."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Volcanic Ash", {
					text "Discard 2 Energy attached to Rocket’s Entei ex and then choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_HITMONCHAN_EX_98:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Strikes Back", {
					text "If Rocket’s Hitmonchan ex is your Active Pokémon and is damaged by an opponent’s attack (even if Rocket’s Hitmonchan ex is Knocked Out), put 2 damage counters on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Mach Punch", {
					text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnum Punch", {
					text "60 damage."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_MEWTWO_EX_99:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
				weakness PSYCHIC
				move "Darkness Switch", {
					text "Discard an Energy card attached to Rocket’s Mewtwo ex, and then switch all damage counters on Rocket’s Mewtwo ex with those on the Defending Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hypnoblast", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psyburn", {
					text "70 damage."
					energyCost P, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_MOLTRES_EX_100:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
				weakness WATER
				pokeBody "Dark Lift", {
					text "If Rocket’s Moltres ex has any [D] Energy attached to it, the Retreat Cost for Rocket’s Moltres ex is 0."
					delayedA {
					}
				}
				move "Fire Dance", {
					text "30 damage. Search your discard pile for a [R] Energy card and attach it to 1 of your Pokémon."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "50 damage."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_SCIZOR_EX_101:
			return evolution (this, from:"Rocket's Scyther Ex", hp:HP120, type:DARKNESS, retreatCost:1) {
				weakness FIRE
				resistance GRASS, MINUS30
				pokeBody "Dual Armor", {
					text "As long as Rocket’s Scizor ex has any [M] Energy attached to it, Rocket’s Scizor ex is both [M] and [D] type."
					delayedA {
					}
				}
				move "Rotating Claws", {
					text "50 damage. You may discard an Energy card attached to Rocket’s Scizor ex. If you do, search your discard pile for an Energy card (excluding the one you just discarded) and attach it to Rocket’s Scizor ex."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_SCYTHER_EX_102:
			return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				pokeBody "Dual Armor", {
					text "As long as Rocket’s Scyther ex has any [G] Energy attached to it, Rocket’s Scyther ex is both [G] and [D] type."
					delayedA {
					}
				}
				move "Bounce", {
					text "10 damage. After your attack, you may switch Rocket’s Scyther ex with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slashing Strike", {
					text "40 damage. Rocket’s Scyther ex can’t use Slashing Strike during your next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_SNEASEL_EX_103:
			return basic (this, hp:HP090, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Drag Off", {
					text "10 damage. Before doing damage, you may switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon. If you do, this attack does 10 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dark Ring", {
					text "30+ damage. Does 30 damage plus 10 more damage for each of your [D] Pokémon in play."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_SNORLAX_EX_104:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:3) {
				weakness FIGHTING
				pokeBody "Dark Healer", {
					text "As long as Rocket’s Snorlax ex has any [D] Energy attached to it, remove 1 damage counter from Rocket’s Snorlax ex between turns."
					delayedA {
					}
				}
				move "Poison Claws", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Collapse", {
					text "60 damage. Rocket’s Snorlax ex is now Asleep."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_SUICUNE_EX_105:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Dark and Clear", {
					text "As long as Rocket’s Suicune ex has any [D] Energy attached to it, Rocket’s Suicune ex can’t be affected by any Special Conditions."
					delayedA {
					}
				}
				move "Icy Wind", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Splash", {
					text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 50 damage plus 40 more damage."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_ZAPDOS_EX_106:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Darkness Guard", {
					text "As long as Rocket’s Zapdos ex has any [D] Energy attached to it, damage done to Rocket’s Zapdos ex by an opponent’s attack is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Plasma", {
					text "10 damage. Search your discard pile for a [L] Energy card and attach it to Rocket’s Zapdos ex."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Raging Thunder", {
					text "60 damage. This attack does 30 damage to 1 of your Pokémon."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MUDKIP_STAR_107:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Whirlpool", {
					text "Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spring Back", {
					text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Asleep."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TORCHIC_STAR_108:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Fireworks", {
					text "20 damage. Flip a coin. If tails, discard a [R] Energy card attached to Torchic."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spring Back", {
					text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Confused."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TREECKO_STAR_109:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				resistance WATER, MINUS30
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spring Back", {
					text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMELEON_110:
			return evolution (this, from:"Charmander", hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fireworks", {
					text "40 damage. Flip a coin. If tails, discard a [R] Energy card attached to Charmeleon."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERE_COMES_TEAM_ROCKET__111:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player plays with his or her Prize cards face up for the rest of the game."
				onPlay {
				}
				playRequirement{
				}
			};
				default:
			return null;
		}
	}
	
}