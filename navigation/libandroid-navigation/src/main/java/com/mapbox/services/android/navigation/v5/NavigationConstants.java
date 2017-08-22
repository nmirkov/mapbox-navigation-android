package com.mapbox.services.android.navigation.v5;

import com.mapbox.services.Experimental;
import com.mapbox.services.android.navigation.v5.offroute.OffRouteListener;

/**
 * Navigation constants
 */

public class NavigationConstants {

  @Experimental
  public static final int DEPARTURE_MILESTONE = 1;
  @Experimental
  public static final int NEW_STEP_MILESTONE = 2;
  @Experimental
  public static final int IMMINENT_MILESTONE = 3;
  @Experimental
  public static final int URGENT_MILESTONE = 4;
  @Experimental
  public static final int ARRIVAL_MILESTONE = 5;

  /**
   * Threshold user must be in within to count as completing a step. One of two heuristics used to know when a user
   * completes a step, see `RouteControllerManeuverZoneRadius`. The users `heading` and the `finalHeading` are
   * compared. If this number is within `RouteControllerMaximumAllowedDegreeOffsetForTurnCompletion`, the user has
   * completed the step.
   */
  @Experimental
  static final int MAXIMUM_ALLOWED_DEGREE_OFFSET_FOR_TURN_COMPLETION = 30;

  /**
   * Radius in meters the user must enter to count as completing a step. One of two heuristics used to know when a user
   * completes a step, see `RouteControllerMaximumAllowedDegreeOffsetForTurnCompletion`.
   */
  @Experimental
  static final int MANEUVER_ZONE_RADIUS = 40;

  /**
   * Maximum number of meters the user can travel away from step before the
   * {@link OffRouteListener}'s called.
   */
  @Experimental
  static final double MAXIMUM_DISTANCE_BEFORE_OFF_ROUTE = 50;

  /**
   * Seconds used before a reroute occurs.
   */
  static final int SECONDS_BEFORE_REROUTE = 3;

  /**
   * Accepted deviation excluding horizontal accuracy before the user is considered to be off route.
   */
  static final double USER_LOCATION_SNAPPING_DISTANCE = 10;

  /**
   * When calculating whether or not the user is on the route, we look where the user will be given their speed and
   * this variable.
   */
  @Experimental
  static final double DEAD_RECKONING_TIME_INTERVAL = 1.0;

  /**
   * Maximum angle the user puck will be rotated when snapping the user's course to the route line.
   */
  @Experimental
  static final int MAX_MANIPULATED_COURSE_ANGLE = 25;

  // Step Maneuver Types
  public static final String STEP_MANEUVER_TYPE_TURN = "turn";
  public static final String STEP_MANEUVER_TYPE_NEW_NAME = "new name";
  public static final String STEP_MANEUVER_TYPE_DEPART = "depart";
  public static final String STEP_MANEUVER_TYPE_ARRIVE = "arrive";
  public static final String STEP_MANEUVER_TYPE_MERGE = "merge";
  public static final String STEP_MANEUVER_TYPE_ON_RAMP = "on ramp";
  public static final String STEP_MANEUVER_TYPE_OFF_RAMP = "off ramp";
  public static final String STEP_MANEUVER_TYPE_FORK = "fork";
  public static final String STEP_MANEUVER_TYPE_END_OF_ROAD = "end of road";
  public static final String STEP_MANEUVER_TYPE_CONTINUE = "continue";
  public static final String STEP_MANEUVER_TYPE_ROUNDABOUT = "roundabout";
  public static final String STEP_MANEUVER_TYPE_ROTARY = "rotary";
  public static final String STEP_MANEUVER_TYPE_ROUNDABOUT_TURN = "roundabout turn";
  public static final String STEP_MANEUVER_TYPE_NOTIFICATION = "notification";

  // Step Maneuver Modifiers
  public static final String STEP_MANEUVER_MODIFIER_UTURN = "uturn";
  public static final String STEP_MANEUVER_MODIFIER_SHARP_RIGHT = "sharp right";
  public static final String STEP_MANEUVER_MODIFIER_RIGHT = "right";
  public static final String STEP_MANEUVER_MODIFIER_SLIGHT_RIGHT = "slight right";
  public static final String STEP_MANEUVER_MODIFIER_STRAIGHT = "straight";
  public static final String STEP_MANEUVER_MODIFIER_SLIGHT_LEFT = "slight left";
  public static final String STEP_MANEUVER_MODIFIER_LEFT = "left";
  public static final String STEP_MANEUVER_MODIFIER_SHARP_LEFT = "sharp left";

  // Turn Lane Indication
  public static final String TURN_LANE_INDICATION_LEFT = "left";
  public static final String TURN_LANE_INDICATION_SHARP_LEFT = "sharp left";
  public static final String TURN_LANE_INDICATION_SLIGHT_LEFT = "slight left";
  public static final String TURN_LANE_INDICATION_STRAIGHT = "straight";
  public static final String TURN_LANE_INDICATION_NONE = "none";
  public static final String TURN_LANE_INDICATION_RIGHT = "right";
  public static final String TURN_LANE_INDICATION_SHARP_RIGHT = "sharp right";
  public static final String TURN_LANE_INDICATION_SLIGHT_RIGHT = "slight right";
  public static final String TURN_LANE_INDICATION_UTURN = "uturn";
}
