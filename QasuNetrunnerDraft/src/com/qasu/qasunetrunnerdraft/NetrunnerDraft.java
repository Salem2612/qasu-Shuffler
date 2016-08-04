package com.qasu.qasunetrunnerdraft;

import android.content.Context;
import android.content.res.Resources;

import com.qasu.qasushuffler.*;

/**
 *
 * @author Samuel
 *
 */
public class NetrunnerDraft extends Game
{
    // CONSTANTS

    /**
     * Identifiers of the expansions
     */
    public static final int EXP_CYBER_WAR                   = 0 ;
    public static final int EXP_CORE_SET                    = 1 ;
    public static final int EXP_WHAT_LIES_AHEAD             = 2 ;
    public static final int EXP_TRACE_AMOUNT                = 3 ;
    public static final int EXP_CYBER_EXODUS                = 4 ;
    public static final int EXP_A_STUDY_IN_STATIC           = 5 ;
    public static final int EXP_HUMANITYS_SHADOW            = 6 ;
    public static final int EXP_FUTURE_PROOF                = 7 ;
    public static final int EXP_CREATION_AND_CONTROL        = 8 ;
    public static final int EXP_OPENING_MOVES               = 9 ;
    public static final int EXP_SECOND_THOUGHTS             = 10;
    public static final int EXP_MALA_TEMPORA                = 11;
    public static final int EXP_TRUE_COLORS                 = 12;
    public static final int EXP_FEAR_AND_LOATHING           = 13;
    public static final int EXP_DOUBLE_TIME                 = 14;
    public static final int EXP_HONOR_AND_PROFIT            = 15;
    public static final int EXP_UPSTALK                     = 16;
    public static final int EXP_THE_SPACES_BETWEEN          = 17;
    public static final int EXP_FIRST_CONTACT               = 18;
    public static final int EXP_UP_AND_OVER                 = 19;
    public static final int EXP_ALL_THAT_REMAINS            = 20;
    public static final int EXP_THE_SOURCE                  = 21;
    public static final int EXP_ORDER_AND_CHAOS             = 22;
    public static final int EXP_STIMHACK_DRAFT_CUBE         = 23;

    /**
     * Identifiers of the decks
     */
    public static final int DECK_ID_CORPO_1     = 0;
    public static final int DECK_ID_CORPO_2     = 1;
    public static final int DECK_ID_CORPO_3     = 2;
    public static final int DECK_ID_CORPO_4     = 3;
    public static final int DECK_ID_RUNNER_1    = 4;
    public static final int DECK_ID_RUNNER_2    = 5;
    public static final int DECK_ID_RUNNER_3    = 6;
    public static final int DECK_ID_RUNNER_4    = 7;

    /**
     * Criteria of the cards
     */
    public static final int CRITERIA_CARD           = 0     ;
    public static final int CRITERIA_CORPO          = 1     ;
    public static final int CRITERIA_RUNNER         = 2     ;
    public static final int CRITERIA_AGENDA         = 3     ;
    public static final int CRITERIA_ASSET          = 4     ;
    public static final int CRITERIA_UPGRADE        = 5     ;
    public static final int CRITERIA_OPERATION      = 6     ;
    public static final int CRITERIA_ICE            = 7     ;
    public static final int CRITERIA_PROGRAM        = 8     ;
    public static final int CRITERIA_ICEBREAKER     = 9     ;
    public static final int CRITERIA_HARDWARE       = 10    ;
    public static final int CRITERIA_RESOURCE       = 11    ;
    public static final int CRITERIA_EVENT          = 12    ;
    public static final int CRITERIA_IDENTITY       = 13    ;

    // MEMBERS

    // CONSTRUCTORS
    public NetrunnerDraft(Context context, int nbExpansions, int nbDecks, int nbDecksToShuffle)
    {
        super(context, nbExpansions, nbDecksToShuffle);
        Resources resources = m_context.getResources();
        Expansion exp;

        exp = new Expansion(resources.getString(R.string.exp_cyber_war), R.drawable.exp_core_set, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.accelerated_beta_test), R.drawable.accelerated_beta_test, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.access_to_globalsec), R.drawable.access_to_globalsec, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.adonis_campaign), R.drawable.adonis_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.aesops_pawnshop), R.drawable.aesops_pawnshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.aggressive_secretary), R.drawable.aggressive_secretary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.akamatsu_mem_chip), R.drawable.akamatsu_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.anonymous_tip), R.drawable.anonymous_tip, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.archer), R.drawable.archer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.archived_memories), R.drawable.archived_memories, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.armitage_codebusting), R.drawable.armitage_codebusting, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.bank_job), R.drawable.bank_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.battering_ram), R.drawable.battering_ram, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.beanstalk_royalties), R.drawable.beanstalk_royalties, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.biotic_labor), R.drawable.biotic_labor, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.breaking_news), R.drawable.breaking_news, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.chum), R.drawable.chum, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.closed_accounts), R.drawable.closed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.corporate_troubleshooter), R.drawable.corporate_troubleshooter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.corroder), R.drawable.corroder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.crash_space), R.drawable.crash_space, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.cyberfeeder), R.drawable.cyberfeeder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.data_dealer), R.drawable.data_dealer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.data_raven), R.drawable.data_raven, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.datasucker), R.drawable.datasucker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.decoy), R.drawable.decoy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.deja_vu), R.drawable.deja_vu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.demolition_run), R.drawable.demolition_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.diesel), R.drawable.diesel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.easy_mark), R.drawable.easy_mark, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.enigma), R.drawable.enigma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.experiential_data), R.drawable.experiential_data, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.femme_fatale), R.drawable.femme_fatale, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.forged_activation_order), R.drawable.forged_activation_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.ghost_branch), R.drawable.ghost_branch, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.gordian_blade), R.drawable.gordian_blade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.grimoire), R.drawable.grimoire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.hadrians_wall), R.drawable.hadrians_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hedge_fund), R.drawable.hedge_fund, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.heimdall_1_0), R.drawable.heimdall_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hostile_takeover), R.drawable.hostile_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.hunter), R.drawable.hunter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ice_carver), R.drawable.ice_carver, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_wall), R.drawable.ice_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_1_0), R.drawable.ichi_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.infiltration), R.drawable.infiltration, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inside_job), R.drawable.inside_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lemuria_codecracker), R.drawable.lemuria_codecracker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.magnum_opus), R.drawable.magnum_opus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.medium), R.drawable.medium, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.melange_mining_corp), R.drawable.melange_mining_corp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.modded), R.drawable.modded, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.net_shield), R.drawable.net_shield, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.neural_emp), R.drawable.neural_emp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.neural_katana), R.drawable.neural_katana, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ninja), R.drawable.ninja, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.nisei_mk_ii), R.drawable.nisei_mk_ii, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.pad_campaign), R.drawable.pad_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.parasite), R.drawable.parasite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.posted_bounty), R.drawable.posted_bounty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.precognition), R.drawable.precognition, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.private_security_force), R.drawable.private_security_force, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_junebug), R.drawable.project_junebug, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.rabbit_hole), R.drawable.rabbit_hole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.red_herrings), R.drawable.red_herrings, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.rototurret), R.drawable.rototurret, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sacrificial_construct), R.drawable.sacrificial_construct, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.sansan_city_grid), R.drawable.sansan_city_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.scorched_earth), R.drawable.scorched_earth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sea_source), R.drawable.sea_source, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.security_subcontract), R.drawable.security_subcontract, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shadow), R.drawable.shadow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shipment_from_mirromorph), R.drawable.shipment_from_mirromorph, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.snare), R.drawable.snare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.sneakdoor_beta), R.drawable.sneakdoor_beta, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.special_order), R.drawable.special_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sure_gamble), R.drawable.sure_gamble, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_makers_eye), R.drawable.the_makers_eye, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_personal_touch), R.drawable.the_personal_touch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_toolbox), R.drawable.the_toolbox, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.tinkering), R.drawable.tinkering, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.tollbooth), R.drawable.tollbooth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_1_0), R.drawable.viktor_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_static), R.drawable.wall_of_static, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_thorns), R.drawable.wall_of_thorns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wyldside), R.drawable.wyldside, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.wyrm), R.drawable.wyrm, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.zaibatsu_loyalty), R.drawable.zaibatsu_loyalty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.braintrust), R.drawable.braintrust, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.caduceus), R.drawable.caduceus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.draco), R.drawable.draco, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.imp), R.drawable.imp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.janus_1_0), R.drawable.janus_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mandatory_upgrades), R.drawable.mandatory_upgrades, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.morning_star), R.drawable.morning_star, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.peacock), R.drawable.peacock, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.plascrete_carapace), R.drawable.plascrete_carapace, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_helpful_ai), R.drawable.the_helpful_ai, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tmi), R.drawable.tmi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.amazon_industrial_zone), R.drawable.amazon_industrial_zone, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.chilo_city_grid), R.drawable.chilo_city_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.compromised_employee), R.drawable.compromised_employee, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.dyson_mem_chip), R.drawable.dyson_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.e3_feedback_implants), R.drawable.e3_feedback_implants, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.encryption_protocol), R.drawable.encryption_protocol, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.fetal_ai), R.drawable.fetal_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.freelancer), R.drawable.freelancer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.liberated_account), R.drawable.liberated_account, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.power_grid_overload), R.drawable.power_grid_overload, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sensei), R.drawable.sensei, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sherlock_1_0), R.drawable.sherlock_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.trick_of_light), R.drawable.trick_of_light, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.vamp), R.drawable.vamp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.chimera), R.drawable.chimera, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.commercialization), R.drawable.commercialization, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.dinosaurus), R.drawable.dinosaurus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.edge_of_world), R.drawable.edge_of_world, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.emergency_shutdown), R.drawable.emergency_shutdown, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.joshua_b), R.drawable.joshua_b, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.marked_accounts), R.drawable.marked_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.nerve_agent), R.drawable.nerve_agent, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.pop_up_window), R.drawable.pop_up_window, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.private_contracts), R.drawable.private_contracts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.project_vitruvius), R.drawable.project_vitruvius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.public_sympathy), R.drawable.public_sympathy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.test_run), R.drawable.test_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.woodcutter), R.drawable.woodcutter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.all_nighter), R.drawable.all_nighter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.crescentus), R.drawable.crescentus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.dedicated_server), R.drawable.dedicated_server, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.deus_x), R.drawable.deus_x, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.doppelganger), R.drawable.doppelganger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.false_lead), R.drawable.false_lead, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.force_of_nature), R.drawable.force_of_nature, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.government_contracts), R.drawable.government_contracts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.inside_man), R.drawable.inside_man, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.oversight_ai), R.drawable.oversight_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.scrubber), R.drawable.scrubber, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tyrant), R.drawable.tyrant, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.underworld_contact), R.drawable.underworld_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.uroboros), R.drawable.uroboros, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.bernice_mai), R.drawable.bernice_mai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.creeper), R.drawable.creeper, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.data_hound), R.drawable.data_hound, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eve_campaign), R.drawable.eve_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.foxfire), R.drawable.foxfire, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hokusai_grid), R.drawable.hokusai_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.networking), R.drawable.networking, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.pheromones), R.drawable.pheromones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.quality_time), R.drawable.quality_time, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.replicator), R.drawable.replicator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.salvage), R.drawable.salvage, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.simone_diego), R.drawable.simone_diego, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.surge), R.drawable.surge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.xanadu), R.drawable.xanadu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.burke_bugs), R.drawable.burke_bugs, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.corporate_war), R.drawable.corporate_war, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.darwin), R.drawable.darwin, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.data_leak_reversal), R.drawable.data_leak_reversal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.dedicated_response_team), R.drawable.dedicated_response_team, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.deep_thought), R.drawable.deep_thought, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.eli_1_0), R.drawable.eli_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.flare), R.drawable.flare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.midori), R.drawable.midori, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.new_angeles_city_hall), R.drawable.new_angeles_city_hall, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.project_beale), R.drawable.project_beale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.ronin), R.drawable.ronin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET)
            )
        );
        this.add(exp, EXP_CYBER_WAR);

        exp = new Expansion(resources.getString(R.string.exp_core_set), R.drawable.exp_core_set, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.accelerated_beta_test), R.drawable.accelerated_beta_test, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.access_to_globalsec), R.drawable.access_to_globalsec, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.account_siphon), R.drawable.account_siphon, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.adonis_campaign), R.drawable.adonis_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.aesops_pawnshop), R.drawable.aesops_pawnshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.aggressive_negotiation), R.drawable.aggressive_negotiation, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.aggressive_secretary), R.drawable.aggressive_secretary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.akamatsu_mem_chip), R.drawable.akamatsu_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.akitaro_watanabe), R.drawable.akitaro_watanabe, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.anonymous_tip), R.drawable.anonymous_tip, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.archer), R.drawable.archer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.archived_memories), R.drawable.archived_memories, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.armitage_codebusting), R.drawable.armitage_codebusting, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.astroscript_pilot_program), R.drawable.astroscript_pilot_program, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.aurora), R.drawable.aurora, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.bank_job), R.drawable.bank_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.battering_ram), R.drawable.battering_ram, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.beanstalk_royalties), R.drawable.beanstalk_royalties, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.biotic_labor), R.drawable.biotic_labor, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.breaking_news), R.drawable.breaking_news, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.cell_portal), R.drawable.cell_portal, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.chum), R.drawable.chum, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.closed_accounts), R.drawable.closed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.corporate_troubleshooter), R.drawable.corporate_troubleshooter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.corroder), R.drawable.corroder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.crash_space), R.drawable.crash_space, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.crypsis), R.drawable.crypsis, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cyberfeeder), R.drawable.cyberfeeder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.data_dealer), R.drawable.data_dealer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.data_mine), R.drawable.data_mine, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.data_raven), R.drawable.data_raven, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.datasucker), R.drawable.datasucker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.decoy), R.drawable.decoy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.deja_vu), R.drawable.deja_vu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.demolition_run), R.drawable.demolition_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.desperado), R.drawable.desperado, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.diesel), R.drawable.diesel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.djinn), R.drawable.djinn, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.easy_mark), R.drawable.easy_mark, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.enigma), R.drawable.enigma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.experiential_data), R.drawable.experiential_data, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.femme_fatale), R.drawable.femme_fatale, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.forged_activation_order), R.drawable.forged_activation_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.ghost_branch), R.drawable.ghost_branch, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.gordian_blade), R.drawable.gordian_blade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.grimoire), R.drawable.grimoire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.hadrians_wall), R.drawable.hadrians_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hedge_fund), R.drawable.hedge_fund, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.heimdall_1_0), R.drawable.heimdall_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hostile_takeover), R.drawable.hostile_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.hunter), R.drawable.hunter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ice_carver), R.drawable.ice_carver, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_wall), R.drawable.ice_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_1_0), R.drawable.ichi_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.infiltration), R.drawable.infiltration, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inside_job), R.drawable.inside_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lemuria_codecracker), R.drawable.lemuria_codecracker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.magnum_opus), R.drawable.magnum_opus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.matrix_analyzer), R.drawable.matrix_analyzer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.medium), R.drawable.medium, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.melange_mining_corp), R.drawable.melange_mining_corp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.mimic), R.drawable.mimic, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.modded), R.drawable.modded, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.net_shield), R.drawable.net_shield, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.neural_emp), R.drawable.neural_emp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.neural_katana), R.drawable.neural_katana, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ninja), R.drawable.ninja, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.nisei_mk_ii), R.drawable.nisei_mk_ii, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.pad_campaign), R.drawable.pad_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.parasite), R.drawable.parasite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.pipeline), R.drawable.pipeline, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.posted_bounty), R.drawable.posted_bounty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.precognition), R.drawable.precognition, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.priority_requisition), R.drawable.priority_requisition, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.private_security_force), R.drawable.private_security_force, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_junebug), R.drawable.project_junebug, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.psychographics), R.drawable.psychographics, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.rabbit_hole), R.drawable.rabbit_hole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.red_herrings), R.drawable.red_herrings, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.research_station), R.drawable.research_station, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.rototurret), R.drawable.rototurret, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sacrificial_construct), R.drawable.sacrificial_construct, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.sansan_city_grid), R.drawable.sansan_city_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.scorched_earth), R.drawable.scorched_earth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sea_source), R.drawable.sea_source, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.security_subcontract), R.drawable.security_subcontract, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shadow), R.drawable.shadow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shipment_from_kaguya), R.drawable.shipment_from_kaguya, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.shipment_from_mirromorph), R.drawable.shipment_from_mirromorph, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.snare), R.drawable.snare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.sneakdoor_beta), R.drawable.sneakdoor_beta, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.special_order), R.drawable.special_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.stimhack), R.drawable.stimhack, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sure_gamble), R.drawable.sure_gamble, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_makers_eye), R.drawable.the_makers_eye, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_personal_touch), R.drawable.the_personal_touch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_toolbox), R.drawable.the_toolbox, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.tinkering), R.drawable.tinkering, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.tollbooth), R.drawable.tollbooth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_1_0), R.drawable.viktor_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_static), R.drawable.wall_of_static, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_thorns), R.drawable.wall_of_thorns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wyldside), R.drawable.wyldside, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.wyrm), R.drawable.wyrm, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.yog_0), R.drawable.yog_0, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.zaibatsu_loyalty), R.drawable.zaibatsu_loyalty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET)
            )
        );
        this.add(exp, EXP_CORE_SET);

        // WHAT_LIES_AHEAD
        exp = new Expansion(resources.getString(R.string.exp_what_lies_ahead), R.drawable.exp_what_lies_ahead, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.ash_2x3zb9cy), R.drawable.ash_2x3zb9cy, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.braintrust), R.drawable.braintrust, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.caduceus), R.drawable.caduceus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.cortez_chip), R.drawable.cortez_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.draco), R.drawable.draco, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.imp), R.drawable.imp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.janus_1_0), R.drawable.janus_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mandatory_upgrades), R.drawable.mandatory_upgrades, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.morning_star), R.drawable.morning_star, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.peacock), R.drawable.peacock, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.plascrete_carapace), R.drawable.plascrete_carapace, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.project_atlas), R.drawable.project_atlas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.restructured_datapool), R.drawable.restructured_datapool, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.snowflake), R.drawable.snowflake, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.spinal_modem), R.drawable.spinal_modem, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_helpful_ai), R.drawable.the_helpful_ai, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tmi), R.drawable.tmi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.zu_13_key_master), R.drawable.zu_13_key_master, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER)
            )
        );
        this.add(exp, EXP_WHAT_LIES_AHEAD);

        // TRACE_AMOUNT
        exp = new Expansion(resources.getString(R.string.exp_trace_amount), R.drawable.exp_trace_amount, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.amazon_industrial_zone), R.drawable.amazon_industrial_zone, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.big_brother), R.drawable.big_brother, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.chilo_city_grid), R.drawable.chilo_city_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.compromised_employee), R.drawable.compromised_employee, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.dyson_mem_chip), R.drawable.dyson_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.e3_feedback_implants), R.drawable.e3_feedback_implants, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.encryption_protocol), R.drawable.encryption_protocol, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.executive_retreat), R.drawable.executive_retreat, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.fetal_ai), R.drawable.fetal_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.freelancer), R.drawable.freelancer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.liberated_account), R.drawable.liberated_account, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.notoriety), R.drawable.notoriety, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.power_grid_overload), R.drawable.power_grid_overload, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.satellite_uplink), R.drawable.satellite_uplink, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sensei), R.drawable.sensei, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sherlock_1_0), R.drawable.sherlock_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.snowball), R.drawable.snowball, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.trick_of_light), R.drawable.trick_of_light, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.vamp), R.drawable.vamp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT)
            )
        );
        this.add(exp, EXP_TRACE_AMOUNT);

        // CYBER_EXODUS
        exp = new Expansion(resources.getString(R.string.exp_cyber_exodus), R.drawable.exp_cyber_exodus, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.chimera), R.drawable.chimera, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.commercialization), R.drawable.commercialization, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.dinosaurus), R.drawable.dinosaurus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.edge_of_world), R.drawable.edge_of_world, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.emergency_shutdown), R.drawable.emergency_shutdown, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.joshua_b), R.drawable.joshua_b, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.marked_accounts), R.drawable.marked_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.muresh_bodysuit), R.drawable.muresh_bodysuit, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.nerve_agent), R.drawable.nerve_agent, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.personal_workshop), R.drawable.personal_workshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.pop_up_window), R.drawable.pop_up_window, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.private_contracts), R.drawable.private_contracts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.project_vitruvius), R.drawable.project_vitruvius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.public_sympathy), R.drawable.public_sympathy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.snitch), R.drawable.snitch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sunset), R.drawable.sunset, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.test_run), R.drawable.test_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.viper), R.drawable.viper, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.woodcutter), R.drawable.woodcutter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE)
            )
        );
        this.add(exp, EXP_CYBER_EXODUS);

        // A_STUDY_IN_STATIC
        exp = new Expansion(resources.getString(R.string.exp_a_study_in_static), R.drawable.exp_a_study_in_static, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.all_nighter), R.drawable.all_nighter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.bullfrog), R.drawable.bullfrog, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.crescentus), R.drawable.crescentus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.dedicated_server), R.drawable.dedicated_server, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.deus_x), R.drawable.deus_x, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.disrupter), R.drawable.disrupter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.doppelganger), R.drawable.doppelganger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.false_lead), R.drawable.false_lead, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.force_of_nature), R.drawable.force_of_nature, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.government_contracts), R.drawable.government_contracts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.green_level_clearance), R.drawable.green_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hourglass), R.drawable.hourglass, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.inside_man), R.drawable.inside_man, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.net_police), R.drawable.net_police, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.oversight_ai), R.drawable.oversight_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.scrubber), R.drawable.scrubber, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tyrant), R.drawable.tyrant, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.underworld_contact), R.drawable.underworld_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.uroboros), R.drawable.uroboros, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE)
            )
        );
        this.add(exp, EXP_A_STUDY_IN_STATIC);

        // HUMANITYS_SHADOW
        exp = new Expansion(resources.getString(R.string.exp_humanitys_shadow), R.drawable.exp_humanitys_shadow, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.bernice_mai), R.drawable.bernice_mai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.creeper), R.drawable.creeper, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.data_hound), R.drawable.data_hound, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eve_campaign), R.drawable.eve_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.foxfire), R.drawable.foxfire, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hokusai_grid), R.drawable.hokusai_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.hq_interface), R.drawable.hq_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.kati_jones), R.drawable.kati_jones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.kraken), R.drawable.kraken, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.networking), R.drawable.networking, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.pheromones), R.drawable.pheromones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.quality_time), R.drawable.quality_time, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.replicator), R.drawable.replicator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rework), R.drawable.rework, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.salvage), R.drawable.salvage, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.simone_diego), R.drawable.simone_diego, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.surge), R.drawable.surge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.whirlpool), R.drawable.whirlpool, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.xanadu), R.drawable.xanadu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_HUMANITYS_SHADOW);

        // FUTURE_PROOF
        exp = new Expansion(resources.getString(R.string.exp_future_proof), R.drawable.exp_future_proof, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.burke_bugs), R.drawable.burke_bugs, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.corporate_war), R.drawable.corporate_war, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.darwin), R.drawable.darwin, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.data_leak_reversal), R.drawable.data_leak_reversal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.dedicated_response_team), R.drawable.dedicated_response_team, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.deep_thought), R.drawable.deep_thought, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.eli_1_0), R.drawable.eli_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.faerie), R.drawable.faerie, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.flare), R.drawable.flare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.indexing), R.drawable.indexing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.midori), R.drawable.midori, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.midseason_replacements), R.drawable.midseason_replacements, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.mr_li), R.drawable.mr_li, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.new_angeles_city_hall), R.drawable.new_angeles_city_hall, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.project_beale), R.drawable.project_beale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.rd_interface), R.drawable.rd_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.retrieval_run), R.drawable.retrieval_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.ronin), R.drawable.ronin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.ruhr_valley), R.drawable.ruhr_valley, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE)
            )
        );
        this.add(exp, EXP_FUTURE_PROOF);

        // CREATION_AND_CONTROL
        exp = new Expansion(resources.getString(R.string.exp_creation_and_control), R.drawable.exp_creation_and_control, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.director_haas_pet_project), R.drawable.director_haas_pet_project, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.efficiency_committee), R.drawable.efficiency_committee, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_wotan), R.drawable.project_wotan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.sentinel_defense_program), R.drawable.sentinel_defense_program, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.alix_t4lbo7), R.drawable.alix_t4lbo7, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.cerebral_overwritter), R.drawable.cerebral_overwritter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.director_haas), R.drawable.director_haas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.haas_arcology_ai), R.drawable.haas_arcology_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.thomas_haas), R.drawable.thomas_haas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.bioroid_efficiency_research), R.drawable.bioroid_efficiency_research, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.successful_demonstration), R.drawable.successful_demonstration, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.heimdall_2_0), R.drawable.heimdall_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.howler), R.drawable.howler, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_2_0), R.drawable.ichi_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.minelayer), R.drawable.minelayer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_2_0), R.drawable.viktor_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.zed_1_0), R.drawable.zed_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.awakening_center), R.drawable.awakening_center, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.tyrs_hand), R.drawable.tyrs_hand, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.gila_hands_arcology), R.drawable.gila_hands_arcology, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.levy_university), R.drawable.levy_university, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.server_diagnostics), R.drawable.server_diagnostics, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.bastion), R.drawable.bastion, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.datapike), R.drawable.datapike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.escher), R.drawable.escher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.exploratory_romp), R.drawable.exploratory_romp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.freelance_coding_contract), R.drawable.freelance_coding_contract, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.scavenge), R.drawable.scavenge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.levy_ar_lab_access), R.drawable.levy_ar_lab_access, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.monolith), R.drawable.monolith, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.feedback_filter), R.drawable.feedback_filter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.clone_chip), R.drawable.clone_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.omni_drive), R.drawable.omni_drive, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.atman), R.drawable.atman, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cloak), R.drawable.cloak, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.dagger), R.drawable.dagger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.chakana), R.drawable.chakana, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.cyber_cypher), R.drawable.cyber_cypher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.paricia), R.drawable.paricia, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.self_modifying_code), R.drawable.self_modifying_code, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sahasrara), R.drawable.sahasrara, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.inti), R.drawable.inti, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.professional_contacts), R.drawable.professional_contacts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.borrowed_satellite), R.drawable.borrowed_satellite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_analyzer), R.drawable.ice_analyzer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.dirty_laundry), R.drawable.dirty_laundry, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.daily_casts), R.drawable.daily_casts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.same_old_thing), R.drawable.same_old_thing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.the_source), R.drawable.the_source, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_CREATION_AND_CONTROL);

        // OPENING_MOVES
        exp = new Expansion(resources.getString(R.string.exp_opening_moves), R.drawable.exp_opening_moves, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.frame_job), R.drawable.frame_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.pawn), R.drawable.pawn, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.rook), R.drawable.rook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.hostage), R.drawable.hostage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.gorman_drip_v1), R.drawable.gorman_drip_v1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.lockpick), R.drawable.lockpick, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.false_echo), R.drawable.false_echo, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.motivation), R.drawable.motivation, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.john_masanori), R.drawable.john_masanori, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.project_ares), R.drawable.project_ares, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.next_bronze), R.drawable.next_bronze, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.celebrity_gift), R.drawable.celebrity_gift, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.himitsu_bako), R.drawable.himitsu_bako, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.character_assassination), R.drawable.character_assassination, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.jackson_howard), R.drawable.jackson_howard, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.invasion_of_privacy), R.drawable.invasion_of_privacy, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.geothermal_fracking), R.drawable.geothermal_fracking, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.swarm), R.drawable.swarm, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.cyberdex_trial), R.drawable.cyberdex_trial, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.grim), R.drawable.grim, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE)
            )
        );
        this.add(exp, EXP_OPENING_MOVES);

        // SECOND_THOUGHTS
        exp = new Expansion(resources.getString(R.string.exp_second_thoughts), R.drawable.exp_second_thoughts, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.bishop), R.drawable.bishop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.scheherazade), R.drawable.scheherazade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.hard_at_work), R.drawable.hard_at_work, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.recon), R.drawable.recon, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.copycat), R.drawable.copycat, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.leviathan), R.drawable.leviathan, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.eureka), R.drawable.eureka, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.record_reconstructor), R.drawable.record_reconstructor, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.prepaid_voicepad), R.drawable.prepaid_voicepad, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.wotan), R.drawable.wotan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hellion_alpha_test), R.drawable.hellion_alpha_test, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.clone_retirement), R.drawable.clone_retirement, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.swordsman), R.drawable.swordsman, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shipment_from_sansan), R.drawable.shipment_from_sansan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.muckraker), R.drawable.muckraker, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.the_cleaners), R.drawable.the_cleaners, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.elizabeth_mills), R.drawable.elizabeth_mills, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.off_the_grid), R.drawable.off_the_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.profiteering), R.drawable.profiteering, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.restructure), R.drawable.restructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION)
            )
        );
        this.add(exp, EXP_SECOND_THOUGHTS);

        // MALA_TEMPORA
        exp = new Expansion(resources.getString(R.string.exp_mala_tempora), R.drawable.exp_mala_tempora, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.deep_red), R.drawable.deep_red, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.knight), R.drawable.knight, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.running_interference), R.drawable.running_interference, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.expert_schedule_analyzer), R.drawable.expert_schedule_analyzer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.grifter), R.drawable.grifter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.torch), R.drawable.torch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.woman_in_the_red_dress), R.drawable.woman_in_the_red_dress, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.raymond_flint), R.drawable.raymond_flint, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.isabel_mcguire), R.drawable.isabel_mcguire, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.hudson_1_0), R.drawable.hudson_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.accelerated_diagnostics), R.drawable.accelerated_diagnostics, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.unorthodox_predictions), R.drawable.unorthodox_predictions, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.sundew), R.drawable.sundew, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.city_surveillance), R.drawable.city_surveillance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.snoop), R.drawable.snoop, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ireress), R.drawable.ireress, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.power_shutdown), R.drawable.power_shutdown, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.paper_wall), R.drawable.paper_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.interns), R.drawable.interns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION)
            )
        );
        this.add(exp, EXP_MALA_TEMPORA);

        // TRUE_COLORS
        exp = new Expansion(resources.getString(R.string.exp_true_colors), R.drawable.exp_true_colors, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.keyhole), R.drawable.keyhole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.activist_support), R.drawable.activist_support, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.lawyer_up), R.drawable.lawyer_up, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.leverage), R.drawable.leverage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.garrote), R.drawable.garrote, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.llds_processor), R.drawable.llds_processor, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.sharpshooter), R.drawable.sharpshooter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.capstone), R.drawable.capstone, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.starlight_crusade_funding), R.drawable.starlight_crusade_funding, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.rex_campaign), R.drawable.rex_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.fenris), R.drawable.fenris, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.panic_button), R.drawable.panic_button, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.shock), R.drawable.shock, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.tsurugi), R.drawable.tsurugi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tgtbt), R.drawable.tgtbt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.sweeps_week), R.drawable.sweeps_week, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.rsvp), R.drawable.rsvp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.curtain_wall), R.drawable.curtain_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.punitive_counterstrike), R.drawable.punitive_counterstrike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.veterans_program), R.drawable.veterans_program, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA)
            )
        );
        this.add(exp, EXP_TRUE_COLORS);

        // FEAR_AND_LOATHING
        exp = new Expansion(resources.getString(R.string.exp_fear_and_loathing), R.drawable.exp_fear_and_loathing, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.quest_completed), R.drawable.quest_completed, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.hemorrhage), R.drawable.hemorrhage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.tallie_perrault), R.drawable.tallie_perrault, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.executive_wiretaps), R.drawable.executive_wiretaps, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.blackguard), R.drawable.blackguard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cybersolutions_mem_chip), R.drawable.cybersolutions_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.alpha), R.drawable.alpha, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.omega), R.drawable.omega, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.blackmail), R.drawable.blackmail, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.blue_level_clearance), R.drawable.blue_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.strongbox), R.drawable.strongbox, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.toshiyuki_sakai), R.drawable.toshiyuki_sakai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.yagura), R.drawable.yagura, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.restoring_face), R.drawable.restoring_face, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.market_research), R.drawable.market_research, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.wraparound), R.drawable.wraparound, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.vulcan_coverup), R.drawable.vulcan_coverup, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.grndl_refinery), R.drawable.grndl_refinery, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.subliminal_messaging), R.drawable.subliminal_messaging, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION)
            )
        );
        this.add(exp, EXP_FEAR_AND_LOATHING);

        // DOUBLE_TIME
        exp = new Expansion(resources.getString(R.string.exp_double_time), R.drawable.exp_double_time, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.singularity), R.drawable.singularity, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.queen_s_gambit), R.drawable.queen_s_gambit, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.dyson_fractal_generator), R.drawable.dyson_fractal_generator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.silencer), R.drawable.silencer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.savoir_faire), R.drawable.savoir_faire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.fall_guy), R.drawable.fall_guy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.power_nap), R.drawable.power_nap, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.paintbrush), R.drawable.paintbrush, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.lucky_find), R.drawable.lucky_find, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.gyri_labyrinth), R.drawable.gyri_labyrinth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.reclamation_order), R.drawable.reclamation_order, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.broadcast_square), R.drawable.broadcast_square, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.corporate_shuffle), R.drawable.corporate_shuffle, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.caprice_nisei), R.drawable.caprice_nisei, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.shinobi), R.drawable.shinobi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.marker), R.drawable.marker, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hive), R.drawable.hive, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.witness_tampering), R.drawable.witness_tampering, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.napd_contract), R.drawable.napd_contract, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.quandary), R.drawable.quandary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE)
            )
        );
        this.add(exp, EXP_DOUBLE_TIME);

        // HONOR_AND_PROFIT
        exp = new Expansion(resources.getString(R.string.exp_honor_and_profit), R.drawable.exp_honor_and_profit, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.house_of_knives), R.drawable.house_of_knives, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.medical_breakthrough), R.drawable.medical_breakthrough, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.philotic_entanglement), R.drawable.philotic_entanglement, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.the_future_perfect), R.drawable.the_future_perfect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.chairman_hiro), R.drawable.chairman_hiro, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.mental_health_clinic), R.drawable.mental_health_clinic, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.psychic_field), R.drawable.psychic_field, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shi_kyu), R.drawable.shi_kyu, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.tenma_line), R.drawable.tenma_line, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.cerebral_cast), R.drawable.cerebral_cast, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.medical_research_fundraiser), R.drawable.medical_research_fundraiser, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.mushin_no_shin), R.drawable.mushin_no_shin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.inazuma), R.drawable.inazuma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.komainu), R.drawable.komainu, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pup), R.drawable.pup, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shiro), R.drawable.shiro, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.susanoo_no_mikoto), R.drawable.susanoo_no_mikoto, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.neotokyo_grid), R.drawable.neotokyo_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.tori_hanzo), R.drawable.tori_hanzo, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.plan_b), R.drawable.plan_b, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.guard), R.drawable.guard, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rainbow), R.drawable.rainbow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.diversified_portfolio), R.drawable.diversified_portfolio, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.fast_track), R.drawable.fast_track, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.calling_in_favors), R.drawable.calling_in_favors, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.early_bird), R.drawable.early_bird, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.express_delivery), R.drawable.express_delivery, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.feint), R.drawable.feint, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.legwork), R.drawable.legwork, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.planned_assault), R.drawable.planned_assault, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.logos), R.drawable.logos, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.public_terminal), R.drawable.public_terminal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.unregistered_s_and_w__35), R.drawable.unregistered_s_w__35, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.window), R.drawable.window, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.alias), R.drawable.alias, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.breach), R.drawable.breach, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.bug), R.drawable.bug, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.gingerbread), R.drawable.gingerbread, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.grappling_hook), R.drawable.grappling_hook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.passport), R.drawable.passport, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.push_your_luck), R.drawable.push_your_luck, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.security_testing), R.drawable.security_testing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.theophilius_bagbiter), R.drawable.theophilius_bagbiter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tri_maf_contact), R.drawable.tri_maf_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.mass_install), R.drawable.mass_install, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.q_coherence_chip), R.drawable.q_coherence_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.overmind), R.drawable.overmind, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.oracle_may), R.drawable.oracle_may, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.donut_taganes), R.drawable.donut_taganes, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_HONOR_AND_PROFIT);

        // UPSTALK
        exp = new Expansion(resources.getString(R.string.exp_upstalk), R.drawable.exp_upstalk, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.domestic_sleepers), R.drawable.domestic_sleepers, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.next_silver), R.drawable.next_silver, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lotus_field), R.drawable.lotus_field, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mutate), R.drawable.mutate, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.primary_transmission_dish), R.drawable.primary_transmission_dish, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.midway_station_grid), R.drawable.midway_station_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.the_root), R.drawable.the_root, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.taurus), R.drawable.taurus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mother_goddess), R.drawable.mother_goddess, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.galahad), R.drawable.galahad, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.bad_times), R.drawable.bad_times, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.cyber_threat), R.drawable.cyber_threat, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lamprey), R.drawable.lamprey, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.paper_tripping), R.drawable.paper_tripping, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.power_tap), R.drawable.power_tap, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.social_engineering), R.drawable.social_engineering, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.leprechaun), R.drawable.leprechaun, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.eden_shard), R.drawable.eden_shard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_UPSTALK);

        // THE_SPACES_BETWEEN
        exp = new Expansion(resources.getString(R.string.exp_the_spaces_between), R.drawable.exp_the_spaces_between, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.enhanced_login_protocol), R.drawable.enhanced_login_protocol, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.heinlein_grid), R.drawable.heinlein_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.encrypted_portals), R.drawable.encrypted_portals, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.cerebral_static), R.drawable.cerebral_static, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.targeted_marketing), R.drawable.targeted_marketing, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.information_overload), R.drawable.information_overload, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.paywall_implementation), R.drawable.paywall_implementation, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sealed_vault), R.drawable.sealed_vault, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.eden_fragment), R.drawable.eden_fragment, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.lag_time), R.drawable.lag_time, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.will_o__the_wisp), R.drawable.will_o__the_wisp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.d4v1d), R.drawable.d4v1d, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.scrubbed), R.drawable.scrubbed, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.three_steps_ahead), R.drawable.three_steps_ahead, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.unscheduled_maintenance), R.drawable.unscheduled_maintenance, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.cache), R.drawable.cache, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.net_celebrity), R.drawable.net_celebrity, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.llds_energy_regulator), R.drawable.llds_energy_regulator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.ghost_runner), R.drawable.ghost_runner, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_THE_SPACES_BETWEEN);

        // FIRST_CONTACT
        exp = new Expansion(resources.getString(R.string.exp_first_contact), R.drawable.exp_first_contact, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.iq), R.drawable.iq, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eliza_s_toybox), R.drawable.eliza_s_toybox, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.kitsune), R.drawable.kitsune, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.port_anson_grid), R.drawable.port_anson_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.the_news_now_hour), R.drawable.the_news_now_hour, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.manhunt), R.drawable.manhunt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.wendigo), R.drawable.wendigo, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.crisium_grid), R.drawable.crisium_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.chronos_project), R.drawable.chronos_project, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.shattered_remains), R.drawable.shattered_remains, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.lancelot), R.drawable.lancelot, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.blackat), R.drawable.blackat, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.duggar_s_first_contact), R.drawable.duggar_s_first_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.box_e), R.drawable.box_e, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_supplier), R.drawable.the_supplier, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.refractor), R.drawable.refractor, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.order_of_sol), R.drawable.order_of_sol, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.hades_shard), R.drawable.hades_shard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.rachel_beckman), R.drawable.rachel_beckman, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_FIRST_CONTACT);

        // UP_AND_OVER
        exp = new Expansion(resources.getString(R.string.exp_up_and_over), R.drawable.exp_up_and_over, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.architect), R.drawable.architect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.peak_efficiency), R.drawable.peak_efficiency, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.labyrinthine_servers), R.drawable.labyrinthine_servers, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.ashigaru), R.drawable.ashigaru, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mamba), R.drawable.mamba, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.reversed_accounts), R.drawable.reversed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.universal_connectivity_fee), R.drawable.universal_connectivity_fee, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.blue_sun_powering_the_future), R.drawable.blue_sun_powering_the_future, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_IDENTITY),
                new Card(resources.getString(R.string.changeling), R.drawable.changeling, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.reuse), R.drawable.reuse, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hades_fragment), R.drawable.hades_fragment, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.docklands_crackdown), R.drawable.docklands_crackdown, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.inject), R.drawable.inject, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.origami), R.drawable.origami, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.fester), R.drawable.fester, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.autoscripter), R.drawable.autoscripter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.switchblade), R.drawable.switchblade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.trade_in), R.drawable.trade_in, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.astrolabe), R.drawable.astrolabe, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.angel_arena), R.drawable.angel_arena, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_UP_AND_OVER);

        // ALL_THAT_REMAINS
        exp = new Expansion(resources.getString(R.string.exp_all_that_remains), R.drawable.exp_all_that_remains, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.bifrost_array), R.drawable.bifrost_array, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.sagittarius), R.drawable.sagittarius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hostile_infrastructure), R.drawable.hostile_infrastructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.gemini), R.drawable.gemini, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.license_acquisition), R.drawable.license_acquisition, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.daily_business_show), R.drawable.daily_business_show, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.superior_cyberwalls), R.drawable.superior_cyberwalls, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.executive_boot_camp), R.drawable.executive_boot_camp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.lycan), R.drawable.lycan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.snatch_and_grab), R.drawable.snatch_and_grab, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.merlin), R.drawable.merlin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shell_corporation), R.drawable.shell_corporation, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.ekomind), R.drawable.ekomind, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cerberus_cuj_0_h3), R.drawable.cerberus_cuj_0_h3, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.leela_patel_trained_pragmatist), R.drawable.leela_patel_trained_pragmatist, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_IDENTITY),
                new Card(resources.getString(R.string.cerberus_rex_h2), R.drawable.cerberus_rex_h2, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.zona_sul_shipping), R.drawable.zona_sul_shipping, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.cybsoft_macrodrive), R.drawable.cybsoft_macrodrive, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cerberus_lady_h1), R.drawable.cerberus_lady_h1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.utopia_shard), R.drawable.utopia_shard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_ALL_THAT_REMAINS);

        // THE_SOURCE
        exp = new Expansion(resources.getString(R.string.exp_the_source), R.drawable.exp_the_source, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.helium_3_deposit), R.drawable.helium_3_deposit, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.errand_boy), R.drawable.errand_boy, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.it_department), R.drawable.it_department, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.markus_1_0), R.drawable.markus_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.industrial_genomics_growing_solutions), R.drawable.industrial_genomics_growing_solutions, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_IDENTITY),
                new Card(resources.getString(R.string.turtlebacks), R.drawable.turtlebacks, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shoot_the_moon), R.drawable.shoot_the_moon, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.troll), R.drawable.troll, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.virgo), R.drawable.virgo, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.utopia_fragment), R.drawable.utopia_fragment, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.excalibur), R.drawable.excalibur, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.self_destruct), R.drawable.self_destruct, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.incubator), R.drawable.incubator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.ixodidae), R.drawable.ixodidae, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.code_siphon), R.drawable.code_siphon, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.collective_consciousness), R.drawable.collective_consciousness, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sage), R.drawable.sage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.bribery), R.drawable.bribery, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.au_revoir), R.drawable.au_revoir, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.earthrise_hotel), R.drawable.earthrise_hotel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_THE_SOURCE);

        // ORDER_AND_CHAOS
        exp = new Expansion(resources.getString(R.string.exp_order_and_chaos), R.drawable.exp_order_and_chaos, nbDecks);
        exp.addAll
        (
            new Deck
            (
                    new Card(resources.getString(R.string.argus_security), R.drawable.argus_security, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.gagarin_deep_space), R.drawable.gagarin_deep_space, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.titan_transnational), R.drawable.titan_transnational, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.firmware_updates), R.drawable.firmware_updates, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                    new Card(resources.getString(R.string.glenn_station), R.drawable.glenn_station, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                    new Card(resources.getString(R.string.government_takeover), R.drawable.government_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                    new Card(resources.getString(R.string.high_risk_investment), R.drawable.high_risk_investment, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                    new Card(resources.getString(R.string.constellation_protocol), R.drawable.constellation_protocol, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                    new Card(resources.getString(R.string.mark_yale), R.drawable.mark_yale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                    new Card(resources.getString(R.string.space_camp), R.drawable.space_camp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                    new Card(resources.getString(R.string.the_board), R.drawable.the_board, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                    new Card(resources.getString(R.string.asteroid_belt), R.drawable.asteroid_belt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.wormhole), R.drawable.wormhole, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.nebula), R.drawable.nebula, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.orion), R.drawable.orion, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.builder), R.drawable.builder, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.checkpoint), R.drawable.checkpoint, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.fire_wall), R.drawable.fire_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.searchlight), R.drawable.searchlight, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                    new Card(resources.getString(R.string.housekeeping), R.drawable.housekeeping, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                    new Card(resources.getString(R.string.patch), R.drawable.patch, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                    new Card(resources.getString(R.string.traffic_accident), R.drawable.traffic_accident, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                    new Card(resources.getString(R.string.satellite_grid), R.drawable.satellite_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                    new Card(resources.getString(R.string.the_twins), R.drawable.the_twins, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                    new Card(resources.getString(R.string.sub_boost), R.drawable.sub_boost, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                    new Card(resources.getString(R.string.dedicated_technician_team), R.drawable.dedicated_technician_team, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                    new Card(resources.getString(R.string.cyberdex_virus_suite), R.drawable.cyberdex_virus_suite, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                    new Card(resources.getString(R.string.edward_kim), R.drawable.edward_kim, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.maxx), R.drawable.maxx, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.valencia_estevez), R.drawable.valencia_estevez, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_IDENTITY),
                    new Card(resources.getString(R.string.amped_up), R.drawable.amped_up, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.i_ve_had_worse), R.drawable.i_ve_had_worse, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.itinerant_protesters), R.drawable.itinerant_protesters, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.showing_off), R.drawable.showing_off, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.wanton_destruction), R.drawable.wanton_destruction, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.day_job), R.drawable.day_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.forked), R.drawable.forked, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.knifed), R.drawable.knifed, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.spooned), R.drawable.spooned, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.eater), R.drawable.eater, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                    new Card(resources.getString(R.string.gravedigger), R.drawable.gravedigger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                    new Card(resources.getString(R.string.hivemind), R.drawable.hivemind, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                    new Card(resources.getString(R.string.progenitor), R.drawable.progenitor, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                    new Card(resources.getString(R.string.archives_interface), R.drawable.archives_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                    new Card(resources.getString(R.string.chop_bot_3000), R.drawable.chop_bot_3000, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                    new Card(resources.getString(R.string.memstrips), R.drawable.memstrips, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                    new Card(resources.getString(R.string.vigil), R.drawable.vigil, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                    new Card(resources.getString(R.string.human_first), R.drawable.human_first, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                    new Card(resources.getString(R.string.investigative_journalism), R.drawable.investigative_journalism, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                    new Card(resources.getString(R.string.sacrificial_clone), R.drawable.sacrificial_clone, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                    new Card(resources.getString(R.string.stim_dealer), R.drawable.stim_dealer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                    new Card(resources.getString(R.string.virus_breeding_ground), R.drawable.virus_breeding_ground, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                    new Card(resources.getString(R.string.uninstall), R.drawable.uninstall, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                    new Card(resources.getString(R.string.qianju_pt), R.drawable.qianju_pt, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                    new Card(resources.getString(R.string.data_folding), R.drawable.data_folding, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE)
            )
        );
        this.add(exp, EXP_ORDER_AND_CHAOS);

        // STIMHACK_DRAFT_CUBE
        exp = new Expansion(resources.getString(R.string.exp_stimhack_draft_cube), R.drawable.exp_stimhack_draft_cube, nbDecks);
        exp.addAll
        (
            new Deck
            (
                new Card(resources.getString(R.string.demolition_run), R.drawable.demolition_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.diesel), R.drawable.diesel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.diesel), R.drawable.diesel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.diesel), R.drawable.diesel, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.dirty_laundry), R.drawable.dirty_laundry, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.dirty_laundry), R.drawable.dirty_laundry, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.dirty_laundry), R.drawable.dirty_laundry, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.deja_vu), R.drawable.deja_vu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.deja_vu), R.drawable.deja_vu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.easy_mark), R.drawable.easy_mark, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.easy_mark), R.drawable.easy_mark, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.easy_mark), R.drawable.easy_mark, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.emergency_shutdown), R.drawable.emergency_shutdown, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.emergency_shutdown), R.drawable.emergency_shutdown, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.escher), R.drawable.escher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.escher), R.drawable.escher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.eureka), R.drawable.eureka, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.eureka), R.drawable.eureka, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.express_delivery), R.drawable.express_delivery, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.forged_activation_order), R.drawable.forged_activation_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.forged_activation_order), R.drawable.forged_activation_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.hostage), R.drawable.hostage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.hostage), R.drawable.hostage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.indexing), R.drawable.indexing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.indexing), R.drawable.indexing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.infiltration), R.drawable.infiltration, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.infiltration), R.drawable.infiltration, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inject), R.drawable.inject, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inject), R.drawable.inject, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inside_job), R.drawable.inside_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.inside_job), R.drawable.inside_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.legwork), R.drawable.legwork, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.legwork), R.drawable.legwork, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.levy_ar_lab_access), R.drawable.levy_ar_lab_access, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.levy_ar_lab_access), R.drawable.levy_ar_lab_access, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lucky_find), R.drawable.lucky_find, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lucky_find), R.drawable.lucky_find, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.lucky_find), R.drawable.lucky_find, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.modded), R.drawable.modded, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.modded), R.drawable.modded, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.modded), R.drawable.modded, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.planned_assault), R.drawable.planned_assault, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.planned_assault), R.drawable.planned_assault, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.quality_time), R.drawable.quality_time, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.quality_time), R.drawable.quality_time, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.quality_time), R.drawable.quality_time, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.queen_s_gambit), R.drawable.queen_s_gambit, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.queen_s_gambit), R.drawable.queen_s_gambit, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.quest_completed), R.drawable.quest_completed, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.retrieval_run), R.drawable.retrieval_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.retrieval_run), R.drawable.retrieval_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.satellite_uplink), R.drawable.satellite_uplink, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.satellite_uplink), R.drawable.satellite_uplink, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.scavenge), R.drawable.scavenge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.scavenge), R.drawable.scavenge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.special_order), R.drawable.special_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.special_order), R.drawable.special_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.special_order), R.drawable.special_order, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.stimhack), R.drawable.stimhack, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.stimhack), R.drawable.stimhack, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.stimhack), R.drawable.stimhack, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sure_gamble), R.drawable.sure_gamble, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sure_gamble), R.drawable.sure_gamble, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.sure_gamble), R.drawable.sure_gamble, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.surge), R.drawable.surge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.surge), R.drawable.surge, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.test_run), R.drawable.test_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.test_run), R.drawable.test_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.test_run), R.drawable.test_run, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_makers_eye), R.drawable.the_makers_eye, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.the_makers_eye), R.drawable.the_makers_eye, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.tinkering), R.drawable.tinkering, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.tinkering), R.drawable.tinkering, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.trade_in), R.drawable.trade_in, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.vamp), R.drawable.vamp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.vamp), R.drawable.vamp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.akamatsu_mem_chip), R.drawable.akamatsu_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.akamatsu_mem_chip), R.drawable.akamatsu_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.akamatsu_mem_chip), R.drawable.akamatsu_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.astrolabe), R.drawable.astrolabe, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.astrolabe), R.drawable.astrolabe, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.blackguard), R.drawable.blackguard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.box_e), R.drawable.box_e, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.clone_chip), R.drawable.clone_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.clone_chip), R.drawable.clone_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.clone_chip), R.drawable.clone_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cyberfeeder), R.drawable.cyberfeeder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cyberfeeder), R.drawable.cyberfeeder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cyberfeeder), R.drawable.cyberfeeder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cybersolutions_mem_chip), R.drawable.cybersolutions_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.cybersolutions_mem_chip), R.drawable.cybersolutions_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.desperado), R.drawable.desperado, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dinosaurus), R.drawable.dinosaurus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dinosaurus), R.drawable.dinosaurus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.doppelganger), R.drawable.doppelganger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dyson_fractal_generator), R.drawable.dyson_fractal_generator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dyson_fractal_generator), R.drawable.dyson_fractal_generator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dyson_fractal_generator), R.drawable.dyson_fractal_generator, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dyson_mem_chip), R.drawable.dyson_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.dyson_mem_chip), R.drawable.dyson_mem_chip, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.e3_feedback_implants), R.drawable.e3_feedback_implants, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.e3_feedback_implants), R.drawable.e3_feedback_implants, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.e3_feedback_implants), R.drawable.e3_feedback_implants, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.grimoire), R.drawable.grimoire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.grimoire), R.drawable.grimoire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.hq_interface), R.drawable.hq_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.hq_interface), R.drawable.hq_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.lemuria_codecracker), R.drawable.lemuria_codecracker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.lockpick), R.drawable.lockpick, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.lockpick), R.drawable.lockpick, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.lockpick), R.drawable.lockpick, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.logos), R.drawable.logos, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.omni_drive), R.drawable.omni_drive, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.omni_drive), R.drawable.omni_drive, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.plascrete_carapace), R.drawable.plascrete_carapace, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.plascrete_carapace), R.drawable.plascrete_carapace, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rd_interface), R.drawable.rd_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rd_interface), R.drawable.rd_interface, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rabbit_hole), R.drawable.rabbit_hole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rabbit_hole), R.drawable.rabbit_hole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.rabbit_hole), R.drawable.rabbit_hole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.silencer), R.drawable.silencer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.silencer), R.drawable.silencer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.silencer), R.drawable.silencer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.spinal_modem), R.drawable.spinal_modem, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.spinal_modem), R.drawable.spinal_modem, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_personal_touch), R.drawable.the_personal_touch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_personal_touch), R.drawable.the_personal_touch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_personal_touch), R.drawable.the_personal_touch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_toolbox), R.drawable.the_toolbox, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.the_toolbox), R.drawable.the_toolbox, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.access_to_globalsec), R.drawable.access_to_globalsec, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.aesops_pawnshop), R.drawable.aesops_pawnshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.aesops_pawnshop), R.drawable.aesops_pawnshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.armitage_codebusting), R.drawable.armitage_codebusting, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.armitage_codebusting), R.drawable.armitage_codebusting, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.bank_job), R.drawable.bank_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.bank_job), R.drawable.bank_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.bank_job), R.drawable.bank_job, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_EVENT),
                new Card(resources.getString(R.string.compromised_employee), R.drawable.compromised_employee, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.compromised_employee), R.drawable.compromised_employee, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.crash_space), R.drawable.crash_space, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.crash_space), R.drawable.crash_space, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.daily_casts), R.drawable.daily_casts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.daily_casts), R.drawable.daily_casts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.daily_casts), R.drawable.daily_casts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.data_leak_reversal), R.drawable.data_leak_reversal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.data_leak_reversal), R.drawable.data_leak_reversal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.data_leak_reversal), R.drawable.data_leak_reversal, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.decoy), R.drawable.decoy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.fall_guy), R.drawable.fall_guy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.fall_guy), R.drawable.fall_guy, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ghost_runner), R.drawable.ghost_runner, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ghost_runner), R.drawable.ghost_runner, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ghost_runner), R.drawable.ghost_runner, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_analyzer), R.drawable.ice_analyzer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_analyzer), R.drawable.ice_analyzer, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_carver), R.drawable.ice_carver, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.ice_carver), R.drawable.ice_carver, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.john_masanori), R.drawable.john_masanori, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.john_masanori), R.drawable.john_masanori, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.joshua_b), R.drawable.joshua_b, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.joshua_b), R.drawable.joshua_b, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.kati_jones), R.drawable.kati_jones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.liberated_account), R.drawable.liberated_account, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.liberated_account), R.drawable.liberated_account, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.liberated_account), R.drawable.liberated_account, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.motivation), R.drawable.motivation, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.motivation), R.drawable.motivation, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.mr_li), R.drawable.mr_li, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.mr_li), R.drawable.mr_li, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.new_angeles_city_hall), R.drawable.new_angeles_city_hall, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.oracle_may), R.drawable.oracle_may, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.oracle_may), R.drawable.oracle_may, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.personal_workshop), R.drawable.personal_workshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.personal_workshop), R.drawable.personal_workshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.personal_workshop), R.drawable.personal_workshop, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.professional_contacts), R.drawable.professional_contacts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.professional_contacts), R.drawable.professional_contacts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.professional_contacts), R.drawable.professional_contacts, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.rachel_beckman), R.drawable.rachel_beckman, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.raymond_flint), R.drawable.raymond_flint, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.sacrificial_construct), R.drawable.sacrificial_construct, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_HARDWARE),
                new Card(resources.getString(R.string.same_old_thing), R.drawable.same_old_thing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.same_old_thing), R.drawable.same_old_thing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.scrubber), R.drawable.scrubber, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.scrubber), R.drawable.scrubber, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.security_testing), R.drawable.security_testing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.security_testing), R.drawable.security_testing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.security_testing), R.drawable.security_testing, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.the_helpful_ai), R.drawable.the_helpful_ai, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.the_helpful_ai), R.drawable.the_helpful_ai, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.the_source), R.drawable.the_source, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tri_maf_contact), R.drawable.tri_maf_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.tri_maf_contact), R.drawable.tri_maf_contact, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.utopia_shard), R.drawable.utopia_shard, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.wyldside), R.drawable.wyldside, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.xanadu), R.drawable.xanadu, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_RESOURCE),
                new Card(resources.getString(R.string.alias), R.drawable.alias, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.atman), R.drawable.atman, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.atman), R.drawable.atman, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.battering_ram), R.drawable.battering_ram, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.battering_ram), R.drawable.battering_ram, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.blackat), R.drawable.blackat, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.blackat), R.drawable.blackat, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.breach), R.drawable.breach, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.breach), R.drawable.breach, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cerberus_cuj_0_h3), R.drawable.cerberus_cuj_0_h3, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cerberus_lady_h1), R.drawable.cerberus_lady_h1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cerberus_lady_h1), R.drawable.cerberus_lady_h1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cerberus_rex_h2), R.drawable.cerberus_rex_h2, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.corroder), R.drawable.corroder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.corroder), R.drawable.corroder, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.creeper), R.drawable.creeper, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.crypsis), R.drawable.crypsis, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.crypsis), R.drawable.crypsis, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cyber_cypher), R.drawable.cyber_cypher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cyber_cypher), R.drawable.cyber_cypher, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.dagger), R.drawable.dagger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.dagger), R.drawable.dagger, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.darwin), R.drawable.darwin, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.darwin), R.drawable.darwin, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.darwin), R.drawable.darwin, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.deus_x), R.drawable.deus_x, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.deus_x), R.drawable.deus_x, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.faerie), R.drawable.faerie, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.faerie), R.drawable.faerie, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.femme_fatale), R.drawable.femme_fatale, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.femme_fatale), R.drawable.femme_fatale, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.garrote), R.drawable.garrote, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.gordian_blade), R.drawable.gordian_blade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.gordian_blade), R.drawable.gordian_blade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.inti), R.drawable.inti, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.inti), R.drawable.inti, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.knight), R.drawable.knight, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.knight), R.drawable.knight, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.knight), R.drawable.knight, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.mimic), R.drawable.mimic, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.mimic), R.drawable.mimic, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.morning_star), R.drawable.morning_star, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.morning_star), R.drawable.morning_star, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.ninja), R.drawable.ninja, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.ninja), R.drawable.ninja, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.overmind), R.drawable.overmind, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.passport), R.drawable.passport, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.passport), R.drawable.passport, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.peacock), R.drawable.peacock, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.sharpshooter), R.drawable.sharpshooter, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.snowball), R.drawable.snowball, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.snowball), R.drawable.snowball, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.torch), R.drawable.torch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.yog_0), R.drawable.yog_0, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.yog_0), R.drawable.yog_0, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.zu_13_key_master), R.drawable.zu_13_key_master, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.zu_13_key_master), R.drawable.zu_13_key_master, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.cloak), R.drawable.cloak, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.cloak), R.drawable.cloak, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.cloak), R.drawable.cloak, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.crescentus), R.drawable.crescentus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.crescentus), R.drawable.crescentus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.crescentus), R.drawable.crescentus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.d4v1d), R.drawable.d4v1d, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.d4v1d), R.drawable.d4v1d, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.datasucker), R.drawable.datasucker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.datasucker), R.drawable.datasucker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.datasucker), R.drawable.datasucker, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.deep_thought), R.drawable.deep_thought, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.djinn), R.drawable.djinn, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.djinn), R.drawable.djinn, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.gorman_drip_v1), R.drawable.gorman_drip_v1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.gorman_drip_v1), R.drawable.gorman_drip_v1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.gorman_drip_v1), R.drawable.gorman_drip_v1, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.grappling_hook), R.drawable.grappling_hook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.grappling_hook), R.drawable.grappling_hook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.hemorrhage), R.drawable.hemorrhage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.hemorrhage), R.drawable.hemorrhage, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.imp), R.drawable.imp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.imp), R.drawable.imp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.imp), R.drawable.imp, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.keyhole), R.drawable.keyhole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.keyhole), R.drawable.keyhole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.keyhole), R.drawable.keyhole, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.magnum_opus), R.drawable.magnum_opus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.magnum_opus), R.drawable.magnum_opus, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.medium), R.drawable.medium, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.medium), R.drawable.medium, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.medium), R.drawable.medium, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.nerve_agent), R.drawable.nerve_agent, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.nerve_agent), R.drawable.nerve_agent, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.nerve_agent), R.drawable.nerve_agent, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.paintbrush), R.drawable.paintbrush, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.paintbrush), R.drawable.paintbrush, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.parasite), R.drawable.parasite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.parasite), R.drawable.parasite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.parasite), R.drawable.parasite, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.paricia), R.drawable.paricia, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.paricia), R.drawable.paricia, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.pheromones), R.drawable.pheromones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.pheromones), R.drawable.pheromones, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.rook), R.drawable.rook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.rook), R.drawable.rook, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM, CRITERIA_ICEBREAKER),
                new Card(resources.getString(R.string.sahasrara), R.drawable.sahasrara, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sahasrara), R.drawable.sahasrara, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sahasrara), R.drawable.sahasrara, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.savoir_faire), R.drawable.savoir_faire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.savoir_faire), R.drawable.savoir_faire, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.scheherazade), R.drawable.scheherazade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.scheherazade), R.drawable.scheherazade, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.self_modifying_code), R.drawable.self_modifying_code, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.self_modifying_code), R.drawable.self_modifying_code, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.self_modifying_code), R.drawable.self_modifying_code, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sneakdoor_beta), R.drawable.sneakdoor_beta, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.sneakdoor_beta), R.drawable.sneakdoor_beta, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.snitch), R.drawable.snitch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                new Card(resources.getString(R.string.snitch), R.drawable.snitch, exp, CRITERIA_CARD, CRITERIA_RUNNER, CRITERIA_PROGRAM),
                // CORPO
                new Card(resources.getString(R.string.accelerated_beta_test), R.drawable.accelerated_beta_test, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.accelerated_beta_test), R.drawable.accelerated_beta_test, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.braintrust), R.drawable.braintrust, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.braintrust), R.drawable.braintrust, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.braintrust), R.drawable.braintrust, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.breaking_news), R.drawable.breaking_news, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.breaking_news), R.drawable.breaking_news, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.breaking_news), R.drawable.breaking_news, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.character_assassination), R.drawable.character_assassination, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.character_assassination), R.drawable.character_assassination, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.chronos_project), R.drawable.chronos_project, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.clone_retirement), R.drawable.clone_retirement, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.clone_retirement), R.drawable.clone_retirement, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.corporate_war), R.drawable.corporate_war, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.director_haas_pet_project), R.drawable.director_haas_pet_project, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.efficiency_committee), R.drawable.efficiency_committee, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.efficiency_committee), R.drawable.efficiency_committee, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.efficiency_committee), R.drawable.efficiency_committee, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.false_lead), R.drawable.false_lead, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.false_lead), R.drawable.false_lead, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.fetal_ai), R.drawable.fetal_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.fetal_ai), R.drawable.fetal_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.fetal_ai), R.drawable.fetal_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.geothermal_fracking), R.drawable.geothermal_fracking, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.geothermal_fracking), R.drawable.geothermal_fracking, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.gila_hands_arcology), R.drawable.gila_hands_arcology, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.gila_hands_arcology), R.drawable.gila_hands_arcology, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.gila_hands_arcology), R.drawable.gila_hands_arcology, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.hostile_takeover), R.drawable.hostile_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.hostile_takeover), R.drawable.hostile_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.hostile_takeover), R.drawable.hostile_takeover, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.house_of_knives), R.drawable.house_of_knives, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.house_of_knives), R.drawable.house_of_knives, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.house_of_knives), R.drawable.house_of_knives, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.market_research), R.drawable.market_research, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.market_research), R.drawable.market_research, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.napd_contract), R.drawable.napd_contract, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.napd_contract), R.drawable.napd_contract, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.nisei_mk_ii), R.drawable.nisei_mk_ii, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.nisei_mk_ii), R.drawable.nisei_mk_ii, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.nisei_mk_ii), R.drawable.nisei_mk_ii, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.philotic_entanglement), R.drawable.philotic_entanglement, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.posted_bounty), R.drawable.posted_bounty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.posted_bounty), R.drawable.posted_bounty, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.private_security_force), R.drawable.private_security_force, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.private_security_force), R.drawable.private_security_force, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.private_security_force), R.drawable.private_security_force, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.profiteering), R.drawable.profiteering, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_atlas), R.drawable.project_atlas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_atlas), R.drawable.project_atlas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_atlas), R.drawable.project_atlas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_beale), R.drawable.project_beale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_beale), R.drawable.project_beale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_beale), R.drawable.project_beale, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_vitruvius), R.drawable.project_vitruvius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_vitruvius), R.drawable.project_vitruvius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.project_vitruvius), R.drawable.project_vitruvius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.tgtbt), R.drawable.tgtbt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.tgtbt), R.drawable.tgtbt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.tgtbt), R.drawable.tgtbt, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.the_future_perfect), R.drawable.the_future_perfect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.the_future_perfect), R.drawable.the_future_perfect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.unorthodox_predictions), R.drawable.unorthodox_predictions, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.veterans_program), R.drawable.veterans_program, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_AGENDA),
                new Card(resources.getString(R.string.adonis_campaign), R.drawable.adonis_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.adonis_campaign), R.drawable.adonis_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.adonis_campaign), R.drawable.adonis_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.aggressive_secretary), R.drawable.aggressive_secretary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.aggressive_secretary), R.drawable.aggressive_secretary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.cerebral_overwritter), R.drawable.cerebral_overwritter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.director_haas), R.drawable.director_haas, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.edge_of_world), R.drawable.edge_of_world, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.eliza_s_toybox), R.drawable.eliza_s_toybox, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.eve_campaign), R.drawable.eve_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.eve_campaign), R.drawable.eve_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.executive_boot_camp), R.drawable.executive_boot_camp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.ghost_branch), R.drawable.ghost_branch, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.grndl_refinery), R.drawable.grndl_refinery, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.haas_arcology_ai), R.drawable.haas_arcology_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.hostile_infrastructure), R.drawable.hostile_infrastructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.jackson_howard), R.drawable.jackson_howard, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.jackson_howard), R.drawable.jackson_howard, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.marked_accounts), R.drawable.marked_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.marked_accounts), R.drawable.marked_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.melange_mining_corp), R.drawable.melange_mining_corp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.melange_mining_corp), R.drawable.melange_mining_corp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.mental_health_clinic), R.drawable.mental_health_clinic, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.mental_health_clinic), R.drawable.mental_health_clinic, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.pad_campaign), R.drawable.pad_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.pad_campaign), R.drawable.pad_campaign, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.primary_transmission_dish), R.drawable.primary_transmission_dish, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.project_junebug), R.drawable.project_junebug, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.project_junebug), R.drawable.project_junebug, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.psychic_field), R.drawable.psychic_field, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.reversed_accounts), R.drawable.reversed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.ronin), R.drawable.ronin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.ronin), R.drawable.ronin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shi_kyu), R.drawable.shi_kyu, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shock), R.drawable.shock, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.shock), R.drawable.shock, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.snare), R.drawable.snare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.snare), R.drawable.snare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.snare), R.drawable.snare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.sundew), R.drawable.sundew, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.sundew), R.drawable.sundew, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.the_root), R.drawable.the_root, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ASSET),
                new Card(resources.getString(R.string.akitaro_watanabe), R.drawable.akitaro_watanabe, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.ash_2x3zb9cy), R.drawable.ash_2x3zb9cy, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.ash_2x3zb9cy), R.drawable.ash_2x3zb9cy, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.bernice_mai), R.drawable.bernice_mai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.bernice_mai), R.drawable.bernice_mai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.caprice_nisei), R.drawable.caprice_nisei, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.corporate_troubleshooter), R.drawable.corporate_troubleshooter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.corporate_troubleshooter), R.drawable.corporate_troubleshooter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.crisium_grid), R.drawable.crisium_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.experiential_data), R.drawable.experiential_data, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.hokusai_grid), R.drawable.hokusai_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.midori), R.drawable.midori, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.midway_station_grid), R.drawable.midway_station_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.off_the_grid), R.drawable.off_the_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.red_herrings), R.drawable.red_herrings, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.red_herrings), R.drawable.red_herrings, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.sansan_city_grid), R.drawable.sansan_city_grid, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.shell_corporation), R.drawable.shell_corporation, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.tori_hanzo), R.drawable.tori_hanzo, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.will_o__the_wisp), R.drawable.will_o__the_wisp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_UPGRADE),
                new Card(resources.getString(R.string.anonymous_tip), R.drawable.anonymous_tip, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.archived_memories), R.drawable.archived_memories, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.archived_memories), R.drawable.archived_memories, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.bad_times), R.drawable.bad_times, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.bad_times), R.drawable.bad_times, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.bad_times), R.drawable.bad_times, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.beanstalk_royalties), R.drawable.beanstalk_royalties, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.beanstalk_royalties), R.drawable.beanstalk_royalties, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.beanstalk_royalties), R.drawable.beanstalk_royalties, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.bioroid_efficiency_research), R.drawable.bioroid_efficiency_research, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.biotic_labor), R.drawable.biotic_labor, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.biotic_labor), R.drawable.biotic_labor, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.blue_level_clearance), R.drawable.blue_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.blue_level_clearance), R.drawable.blue_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.celebrity_gift), R.drawable.celebrity_gift, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.celebrity_gift), R.drawable.celebrity_gift, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.closed_accounts), R.drawable.closed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.closed_accounts), R.drawable.closed_accounts, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.corporate_shuffle), R.drawable.corporate_shuffle, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.corporate_shuffle), R.drawable.corporate_shuffle, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.fast_track), R.drawable.fast_track, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.green_level_clearance), R.drawable.green_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.green_level_clearance), R.drawable.green_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.green_level_clearance), R.drawable.green_level_clearance, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hedge_fund), R.drawable.hedge_fund, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hedge_fund), R.drawable.hedge_fund, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.hedge_fund), R.drawable.hedge_fund, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.interns), R.drawable.interns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.interns), R.drawable.interns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.medical_research_fundraiser), R.drawable.medical_research_fundraiser, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.medical_research_fundraiser), R.drawable.medical_research_fundraiser, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.midseason_replacements), R.drawable.midseason_replacements, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.midseason_replacements), R.drawable.midseason_replacements, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.mushin_no_shin), R.drawable.mushin_no_shin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.neural_emp), R.drawable.neural_emp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.neural_emp), R.drawable.neural_emp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.neural_emp), R.drawable.neural_emp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.oversight_ai), R.drawable.oversight_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.oversight_ai), R.drawable.oversight_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.oversight_ai), R.drawable.oversight_ai, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.power_shutdown), R.drawable.power_shutdown, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.power_shutdown), R.drawable.power_shutdown, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.psychographics), R.drawable.psychographics, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.psychographics), R.drawable.psychographics, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.punitive_counterstrike), R.drawable.punitive_counterstrike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.punitive_counterstrike), R.drawable.punitive_counterstrike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.restructure), R.drawable.restructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.restructure), R.drawable.restructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.restructure), R.drawable.restructure, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.scorched_earth), R.drawable.scorched_earth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.scorched_earth), R.drawable.scorched_earth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sea_source), R.drawable.sea_source, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sea_source), R.drawable.sea_source, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.shipment_from_sansan), R.drawable.shipment_from_sansan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.shipment_from_sansan), R.drawable.shipment_from_sansan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.shipment_from_sansan), R.drawable.shipment_from_sansan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.subliminal_messaging), R.drawable.subliminal_messaging, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.subliminal_messaging), R.drawable.subliminal_messaging, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.successful_demonstration), R.drawable.successful_demonstration, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.successful_demonstration), R.drawable.successful_demonstration, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sweeps_week), R.drawable.sweeps_week, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sweeps_week), R.drawable.sweeps_week, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.sweeps_week), R.drawable.sweeps_week, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.trick_of_light), R.drawable.trick_of_light, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_OPERATION),
                new Card(resources.getString(R.string.bastion), R.drawable.bastion, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.bastion), R.drawable.bastion, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.changeling), R.drawable.changeling, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.changeling), R.drawable.changeling, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.curtain_wall), R.drawable.curtain_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eli_1_0), R.drawable.eli_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eli_1_0), R.drawable.eli_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.eli_1_0), R.drawable.eli_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.galahad), R.drawable.galahad, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.galahad), R.drawable.galahad, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.galahad), R.drawable.galahad, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hadrians_wall), R.drawable.hadrians_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hadrians_wall), R.drawable.hadrians_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.heimdall_1_0), R.drawable.heimdall_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.heimdall_1_0), R.drawable.heimdall_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.heimdall_2_0), R.drawable.heimdall_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.heimdall_2_0), R.drawable.heimdall_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.himitsu_bako), R.drawable.himitsu_bako, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.himitsu_bako), R.drawable.himitsu_bako, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hive), R.drawable.hive, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hive), R.drawable.hive, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ice_wall), R.drawable.ice_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ice_wall), R.drawable.ice_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.next_silver), R.drawable.next_silver, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.next_silver), R.drawable.next_silver, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.paper_wall), R.drawable.paper_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.paper_wall), R.drawable.paper_wall, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.snowflake), R.drawable.snowflake, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.snowflake), R.drawable.snowflake, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tmi), R.drawable.tmi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_static), R.drawable.wall_of_static, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_static), R.drawable.wall_of_static, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_thorns), R.drawable.wall_of_thorns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wall_of_thorns), R.drawable.wall_of_thorns, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wotan), R.drawable.wotan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wraparound), R.drawable.wraparound, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wraparound), R.drawable.wraparound, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.bullfrog), R.drawable.bullfrog, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.chum), R.drawable.chum, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.chum), R.drawable.chum, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.datapike), R.drawable.datapike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.datapike), R.drawable.datapike, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.enigma), R.drawable.enigma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.enigma), R.drawable.enigma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.enigma), R.drawable.enigma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.inazuma), R.drawable.inazuma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.inazuma), R.drawable.inazuma, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.iq), R.drawable.iq, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.iq), R.drawable.iq, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lotus_field), R.drawable.lotus_field, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lotus_field), R.drawable.lotus_field, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.merlin), R.drawable.merlin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.merlin), R.drawable.merlin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.merlin), R.drawable.merlin, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.next_bronze), R.drawable.next_bronze, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.next_bronze), R.drawable.next_bronze, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.next_bronze), R.drawable.next_bronze, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pop_up_window), R.drawable.pop_up_window, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pop_up_window), R.drawable.pop_up_window, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pop_up_window), R.drawable.pop_up_window, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.quandary), R.drawable.quandary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.quandary), R.drawable.quandary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.quandary), R.drawable.quandary, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rsvp), R.drawable.rsvp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rsvp), R.drawable.rsvp, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tollbooth), R.drawable.tollbooth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tollbooth), R.drawable.tollbooth, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_1_0), R.drawable.viktor_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_1_0), R.drawable.viktor_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_2_0), R.drawable.viktor_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viktor_2_0), R.drawable.viktor_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viper), R.drawable.viper, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.viper), R.drawable.viper, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.wendigo), R.drawable.wendigo, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.yagura), R.drawable.yagura, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.yagura), R.drawable.yagura, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.archer), R.drawable.archer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.archer), R.drawable.archer, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.architect), R.drawable.architect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.architect), R.drawable.architect, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.caduceus), R.drawable.caduceus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.caduceus), R.drawable.caduceus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.data_raven), R.drawable.data_raven, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.data_raven), R.drawable.data_raven, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.data_raven), R.drawable.data_raven, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.draco), R.drawable.draco, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.fenris), R.drawable.fenris, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.flare), R.drawable.flare, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.grim), R.drawable.grim, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.guard), R.drawable.guard, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hunter), R.drawable.hunter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.hunter), R.drawable.hunter, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_1_0), R.drawable.ichi_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_1_0), R.drawable.ichi_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_2_0), R.drawable.ichi_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.ichi_2_0), R.drawable.ichi_2_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.janus_1_0), R.drawable.janus_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.komainu), R.drawable.komainu, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.komainu), R.drawable.komainu, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lancelot), R.drawable.lancelot, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lancelot), R.drawable.lancelot, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lancelot), R.drawable.lancelot, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.lycan), R.drawable.lycan, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.muckraker), R.drawable.muckraker, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.neural_katana), R.drawable.neural_katana, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.neural_katana), R.drawable.neural_katana, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pup), R.drawable.pup, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.pup), R.drawable.pup, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rototurret), R.drawable.rototurret, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rototurret), R.drawable.rototurret, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sagittarius), R.drawable.sagittarius, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shadow), R.drawable.shadow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shadow), R.drawable.shadow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.sherlock_1_0), R.drawable.sherlock_1_0, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.shinobi), R.drawable.shinobi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.susanoo_no_mikoto), R.drawable.susanoo_no_mikoto, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.swordsman), R.drawable.swordsman, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.taurus), R.drawable.taurus, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tsurugi), R.drawable.tsurugi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.tsurugi), R.drawable.tsurugi, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.rainbow), R.drawable.rainbow, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.chimera), R.drawable.chimera, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.chimera), R.drawable.chimera, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.data_mine), R.drawable.data_mine, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.kitsune), R.drawable.kitsune, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE),
                new Card(resources.getString(R.string.mother_goddess), R.drawable.mother_goddess, exp, CRITERIA_CARD, CRITERIA_CORPO, CRITERIA_ICE)
            )
        );
        this.add(exp, EXP_STIMHACK_DRAFT_CUBE);
    }

    // ACCESSORS

    // MUTATORS

    // METHODS
}
