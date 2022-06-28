package com.qaprosoft.carina.myfp.utils.enums;

public enum YouPageEnum {
    MALE ("Male"),
    FEMALE ("Female"),
    UKRAINE ("Ukraine"),
    UGANDA ("Uganda"),
    URUGUAY("Uruguay"),
    VANUATU("Vanuatu"),
    VENEZUELA("Venezuela"),
    VIETNAM("Vietnam"),
    VIRGIN_ISLANDS_US("Virgin Islands, US"),
    YEMEN("Yemen"),
    ZAMBIA("Zambia"),
    ZIMBABWE("Zimbabwe"),
    KILOGRAMS("Kilograms"),
    POUNDS("Pounds"),
    STONE("Stone"),
    FEET_INCHES("Feet & Inches"),
    CENTIMETERS("Centimeters"),
    LOSE_ONE_POINT_TWENTY_FIVE_KG_PER_WEEK("Lose 0.25 kg per week"),
    LOSE_ZERO_POINT_FIVE_KG_PER_WEEK("Lose 0.5 kg per week (Recommended)"),
    LOSE_ZERO_POINT_SEVENTY_FIVE_KG_PER_WEEK("Lose 0.75 kg per week"),
    LOSE_ONE_KG_PER_WEEK("Lose 1 kg per week"),
    LOSE_ZERO_POINT_FIVE_LBS_PER_WEEK("Lose 0.5 lbs per week"),
    LOSE_ONE_POINT_ZERO_LBS_PER_WEEK("Lose 1.0 kg lbs week (Recommended)"),
    LOSE_ONE_POINT_FIVE_LBS_PER_WEEK("Lose 1.5 lbs per week"),
    LOSE_TWO_LBS_PER_WEEK("Lose 2 lbs per week");

    private String name;
    YouPageEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
