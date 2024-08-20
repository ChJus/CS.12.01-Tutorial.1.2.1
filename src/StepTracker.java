public class StepTracker {
  private int goal;             // stores the target number of steps to be achieved in a day
  private int activeDays;       // stores the number of days at or exceeding the goal
  private int days;             // stores the number of days recorded
  private int cumulativeSteps;  // stores the total number of steps taken

  // Constructor that accepts one parameter: the daily step count goal
  public StepTracker(int goal) {
    this.goal = goal;
  }

  // Returns number of days recorded
  int getDays() {
    return days;
  }

  // Returns daily step goal
  int getStepsForActiveDay() {
    return goal;
  }

  // Returns total number of steps recorded
  int getTotalSteps() {
    return cumulativeSteps;
  }

  // Returns number of active days (exceeding daily step goal)
  int getActiveDays() {
    return activeDays;
  }

  // Calculate average number of steps taken as:
  // total number of steps / number of days recorded.
  // Note that if there were no entries, return 0 (prevent divide by zero)
  double averageSteps() {
    return days == 0 ? 0 : (cumulativeSteps / (double) days);
  }

  // Add a new entry
  void addDailySteps(int steps) {
    cumulativeSteps += steps;         // increment total steps taken
    days++;                           // increment number of days recorded
    if (steps >= goal) activeDays++;  // if the step count exceeds the goal, increment active days
  }
}
