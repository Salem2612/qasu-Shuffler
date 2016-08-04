package com.qasu.qasunetrunnerdraft;

import com.qasu.qasushuffler.Constraint;
import com.qasu.qasushuffler.DeckConstraint;
import com.qasu.qasushuffler.GenericTabActivity;

/**
 *
 * @author Samuel
 *
 */
public class NetrunnerDraftTabActivity extends GenericTabActivity
{
    // CONSTANTS

    // MEMBERS

    // CONSTRUCTORS

    // METHODS
    /**
     *
     */
    @Override
    protected void initializeGame()
    {
        // Retrieve the number of decks per expansion and the number of expansions from the specific resources
    	int nbDecksPerExpansion = 1;
        int nbDecksToShuffle = getResources().getInteger(R.integer.nb_decks);
        int nbExpansions = getResources().getInteger(R.integer.nb_expansions);

        // Create the specific game
        m_game = new NetrunnerDraft(this, nbExpansions, nbDecksPerExpansion, nbDecksToShuffle);

        // Create the specific icons of the tabs of the decks
        m_deckImgIds = new int[nbDecksToShuffle];
        m_deckImgIds[NetrunnerDraft.DECK_ID_CORPO_1 ] = R.drawable.tab_deck_0;
        m_deckImgIds[NetrunnerDraft.DECK_ID_CORPO_2 ] = R.drawable.tab_deck_1;
        m_deckImgIds[NetrunnerDraft.DECK_ID_CORPO_3 ] = R.drawable.tab_deck_2;
        m_deckImgIds[NetrunnerDraft.DECK_ID_CORPO_4 ] = R.drawable.tab_deck_3;
        m_deckImgIds[NetrunnerDraft.DECK_ID_RUNNER_1] = R.drawable.tab_deck_4;
        m_deckImgIds[NetrunnerDraft.DECK_ID_RUNNER_2] = R.drawable.tab_deck_5;
        m_deckImgIds[NetrunnerDraft.DECK_ID_RUNNER_3] = R.drawable.tab_deck_6;
        m_deckImgIds[NetrunnerDraft.DECK_ID_RUNNER_4] = R.drawable.tab_deck_7;

        // Create the specific constraints of the Corpo decks
        int nbDecksCorpo    = 4;
        DeckConstraint[] corpoDeckConstraints = new DeckConstraint[nbDecksCorpo];
        for (int iDeck = 0; iDeck < nbDecksCorpo; iDeck++)
        {
            corpoDeckConstraints[iDeck] = new DeckConstraint
            (
                new Constraint(10, 10,  NetrunnerDraft.CRITERIA_CARD),
                new Constraint(10, 10,  NetrunnerDraft.CRITERIA_CORPO),
                new Constraint(1, 2,    NetrunnerDraft.CRITERIA_AGENDA),
                new Constraint(0, 3,    NetrunnerDraft.CRITERIA_ASSET),
                new Constraint(0, 2,    NetrunnerDraft.CRITERIA_UPGRADE),
                new Constraint(1, 3,    NetrunnerDraft.CRITERIA_OPERATION),
                new Constraint(3, 6,    NetrunnerDraft.CRITERIA_ICE),
                new Constraint(0, 0,    NetrunnerDraft.CRITERIA_IDENTITY)
            );
        }

        // Create the specific constraints of the Runner decks
        int nbDecksRunner   = 4;
        DeckConstraint[] runnerDeckConstraints = new DeckConstraint[nbDecksRunner];
        for (int iDeck = 0; iDeck < nbDecksRunner; iDeck++)
        {
            runnerDeckConstraints[iDeck] = new DeckConstraint
            (
                new Constraint(10, 10,  NetrunnerDraft.CRITERIA_CARD),
                new Constraint(10, 10,  NetrunnerDraft.CRITERIA_RUNNER),
                new Constraint(3, 4,    NetrunnerDraft.CRITERIA_PROGRAM),
                new Constraint(1, 3,    NetrunnerDraft.CRITERIA_ICEBREAKER),
                new Constraint(1, 4,    NetrunnerDraft.CRITERIA_HARDWARE),
                new Constraint(0, 5,    NetrunnerDraft.CRITERIA_RESOURCE),
                new Constraint(1, 4,    NetrunnerDraft.CRITERIA_EVENT),
                new Constraint(0, 0,    NetrunnerDraft.CRITERIA_IDENTITY)
            );
        }

        // Merge the specific constraints of the Corpo and Runner decks in the main specific constraints
        m_deckConstraints = new DeckConstraint[]
        {
            corpoDeckConstraints[0],
            corpoDeckConstraints[1],
            corpoDeckConstraints[2],
            corpoDeckConstraints[3],
            runnerDeckConstraints[0],
            runnerDeckConstraints[1],
            runnerDeckConstraints[2],
            runnerDeckConstraints[3]
        };
    }

}
