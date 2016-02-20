package main

import DayTime._
import EpochTime._

object Example extends App {

  // anywhere we type against Time[OfDay] we are guaranteed it came from
  // the DayTime object
  val dayTime: Time[OfDay] = 3L.toDayTime

  // anywhere we type against Time[SinceEpoch] we are guaranteed it
  // came from the EpochTime object
  val epochTime: Time[SinceEpoch] = 10L.toEpochTime

  // this would not compile
  //val cheatEpochTime: Time[SinceEpoch] = Time[SinceEpoch](1L, SinceEpoch)

  println(dayTime)
  println(epochTime)
}
