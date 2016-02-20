package main

object EpochTime {

  private[EpochTime] case object SinceEpoch
  type SinceEpoch = SinceEpoch.type

  implicit class ToEpochTime(l: Long) {
    def toEpochTime: Time[SinceEpoch] = Time(l, SinceEpoch)
  }
}
