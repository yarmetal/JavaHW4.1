public class BonusMilesService {
    public int calculate(int cost) {
        int bonusRange = 20;
        int bonusMile = cost / bonusRange;
        return bonusMile;
    }
}
