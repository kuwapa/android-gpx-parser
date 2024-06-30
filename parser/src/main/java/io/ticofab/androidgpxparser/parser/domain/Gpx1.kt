package io.ticofab.androidgpxparser.parser.domain

import org.joda.time.DateTime

data class Gpx(
        val version: String? = null,
        val creator: String? = null,
        val metadata: Metadata? = null,
        val wayPoints: List<WayPoint>? = null,
        val routes: List<Route>? = null,
        val tracks: List<Track>? = null
)

data class Author(var name: String? = null,
                  var email: Email? = null,
                  var link: Link? = null)

data class Bounds(
        val minLat: Double? = null,
        val minLon: Double? = null,
        val maxLat: Double? = null,
        val maxLon: Double? = null)

data class Copyright(val author: String? = null,
                     val year: Int? = null,
                     val license: String? = null)

data class Email(val id: String? = null,
                 val domain: String? = null)

data class Link(val linkHref: String? = null,
                val linkText: String? = null,
                val linkType: String? = null)

data class Metadata(
        val name: String? = null,
        val Desc: String? = null,
        val author: Author? = null,
        val copyright: Copyright? = null,
        val link: Link? = null,
        val time: DateTime? = null,
        val keywords: String? = null,
        val bounds: Bounds? = null,
        val extensions: String? = null
)

abstract class Point(
        val latitude: Double? = null,
        val longitude: Double? = null,
        val elevation: Double? = null,
        val time: DateTime? = null,
        val name: String? = null,
        val desc: String? = null,
        val type: String? = null
)

class RoutePoint : Point()

class TrackPoint : Point()

class WayPoint : Point()

data class Route(
        val routePoints: List<RoutePoint>? = null,
        val routeName: String? = null,
        val routeDesc: String? = null,
        val routeCmt: String? = null,
        val routeSrc: String? = null,
        val routeNumber: Int? = null,
        val routeLink: Link? = null,
        val routeType: String? = null
)

data class Track(
        val trackName: String? = null,
        val trackSegments: List<TrackSegment>? = null,
        val trackDesc: String? = null,
        val trackCmt: String? = null,
        val trackSrc: String? = null,
        val trackNumber: Int? = null,
        val trackLink: Link? = null,
        val trackType: String? = null
)

data class TrackSegment(val trackPoints: List<TrackPoint>? = null)
