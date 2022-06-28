package com.qaprosoft.carina.myfp.utils.enums;

public enum GoalsEnum {
    //*GOALS BUTTONS
    LOSE_WEIGHT("Lose Weight"),
    MAINTAIN_WEIGHT("Maintain Weight"),
    GAIN_WEIGHT("Gain weight"),
    GAIN_MUSCLE("Gain Muscle"),
    MODIFY_MY_DIET("Modify My Diet"),
    MANAGE_STRESS("Manage Stress"),
    INCREASE_MY_STEP_COUNT("Increase My Step Count"),

    //*GAIN WEIGHT BUTTON
    COMPETITIVE_SPORT_PERFORMANCE("Competitive sport performance"),
    GAIN_MUSCLE_FOR_GENERAL_FITNESS("Gain muscle for general fitness"),
    I_AM_UNDERWEIGHT("I am underweight "),
    MY_HEALTHCARE_PROVIDER_RECOMMENDED_IT("My healthcare provider recommended it"),
    OTHER("Other"),

    //*GAIN MUSCLE BUTTON
    TONE_UP("Tone up - you want visible muscles with as little mass as possible, with a low body fat percentage"),
    BULK_UP("Bulk up - you want large, well-defined muscles, with a low percentage of body fat"),
    GET_STRONG("Get strong - you want to lift the maximum amount of weight and are not concerned with body fat or muscle definition"),

    //*INCREASE MY STEP COUNT BUTTON
    LESS_THAN_1000("Less than 1,000"),
    ONE_THOUSAND_TO_THREE_THOUSAND("1,000 to 3,000"),
    THREE_THOUSAND_TO_SEVEN_THOUSAND("3,000 to 7,000"),
    MORE_THAN_SEVEN_THOUSAND("More than 7,000"),
    I_DONT_KNOW("I don't know"),

    //*MAINTAIN WEIGHT/LOSE WEIGHT BUTTONS
    LACK_OF_TIME("Lack of time"),
    THE_REGIMEN_WAS_HARD_TO_FOLLOW("The regimen was hard to follow"),
    HEALTHY_DIETS_LACK_VERIETY("Healthy diets lack variety"),
    STRESS_AROUND_FOOD_CHOICES("Stress around food choices"),
    HOLIDAYS_VACATION_SOCIAL_EVENTS("Holidays/Vacation/Social Events"),
    FOOD_CRAVINGS("Food cravings"),
    LACK_OF_PROGRESS("Lack of progress"),
    HEALTHY_FOOD_DOESNT_TASTE_FOOD("Healthy food doesn't taste good"),
    HEALTHY_FOOD_IS_TOO_EXPENSIVE("Healthy food is too expensive"),
    COOKING_WAS_TOO_HARD_OR_TIME_CONSUMING("Cooking was too hard or time-consuming"),
    I_DID_NOT_EXPERIENCE_BERIES("I did not experience barriers"),

    //*MODIFY MY DIET BUTTON
    TRACK_MACROS("Track macros"),
    EAT_VEGAN("Eat vegan"),
    EAT_PESCETARIAN("Eat pescetarian"),
    LESS_SUGAR("Less sugar"),
    LESS_PROTEIN("Less protein"),
    LESS_DIARY("Less dairy"),
    FEVER_CARBS("Fewer carbs"),
    LESS_FAT("Less fat"),
    MORE_PROTEIN("More protein"),
    MORE_FAT("More fat"),
    MORE_FRUITS_AND_VEGETABLES("More fruits and vegetables"),
    OTHER_FOOD("Other"),

    // *MANAGE STRESS BUTTON
    WALK("Walk"),
    RUN("Run"),
    DO_A_STRENGTH_WORKOUT("Do a strength workout"),
    GO_ON_A_BIKE_RIDE("Go on a bike ride"),
    DO_YOGA_OR_OTHER_FITNESS_CLASS("Do yoga or other fitness class"),
    STRETCH("Stretch"),
    WATCH_READ_OR_LISTEN_TO_SOMETHING_MOTIVATIONAL("Watch, read, or listen to something motivational"),
    MEDITATE_PRACTICE_MINDFULNESS("Meditate/Practice mindfulness"),
    LISTEN_TO_MUSIC("Listen to music"),
    DO_SOMETHING_ELSE("Do something else"),
    NOTHING_HELPS_ME_RELIEVE_STRESS("Nothing helps me relieve stress");

    private String name;

    GoalsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
