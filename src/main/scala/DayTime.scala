package main

object DayTime {

  private[DayTime] case object OfDay
  type OfDay = OfDay.type

  implicit class ToDayTime(l: Long) {
    def toDayTime: Time[OfDay] = Time(l, OfDay)
  }
}
