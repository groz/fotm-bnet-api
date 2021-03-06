package info.fotm.api.models

/*
{
    "rows": [{
        "ranking": 1,
        "rating": 3015,
        "name": "Avilove",
        "realmId": 1301,
        "realmName": "Outland",
        "realmSlug": "outland",
        "raceId": 4,
        "classId": 5,
        "specId": 256,
        "factionId": 0,
        "genderId": 1,
        "seasonWins": 206,
        "seasonLosses": 111,
        "weeklyWins": 0,
        "weeklyLosses": 0
    }, {

 */
case class Leaderboard(rows: List[LeaderboardRow]) {
  override def toString = s"Leaderboard(size: ${rows.size})"
}

case class LeaderboardRow(
  ranking: Int,
  rating: Int,
  name: String,
  realmId: Int,
  realmName: String,
  realmSlug: String,
  raceId: Int,
  classId: Int,
  specId: Int,
  factionId: Int,
  genderId: Int,
  seasonWins: Int,
  seasonLosses: Int,
  weeklyWins: Int,
  weeklyLosses: Int
) {
  def seasonTotal = seasonWins + seasonLosses
  def weeklyTotal = weeklyWins + weeklyLosses
}
