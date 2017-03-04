package com.wetjens.powergrid.map

class Path(val connections: List<Connection>) {
    val cost = connections.fold(0, { sum, connection -> sum + connection.cost })
}