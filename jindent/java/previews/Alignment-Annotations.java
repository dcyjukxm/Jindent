
public @interface RequestForEnhancement {

    int id();             // no default
    String synopsis() default "nothing";
    
    // some comment
    String nameOfEngineer() default "[unassigned]";
    String date()           default "[unimplemented]";
    String a() default "[thisIsAVeryLongStringWhichMayExceedsLineLength][thisIsAVeryLongStringWhichMayExceedsLineLength][thisIsAVeryLongStringWhichMayExceedsLineLength]";
    String b()           default "b";
    String c()           default "c";
}


