package com.wetjens.powergrid

class StartAuctionPhaseAction : Action {

    override fun apply(powerGrid: PowerGrid): PowerGrid {
        return powerGrid.redeterminePlayerOrder().copy(
                round = powerGrid.round + 1,
                phase = AuctionPhase(auctioningPlayers = powerGrid.playerOrder))
    }

}