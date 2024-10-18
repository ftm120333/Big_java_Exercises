//package org.examples.polymorphism;
//
//
// enum Note {
//    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
//} ///:~
//
//
//class Instrument {
//    public void play(Note n) {
//        System.out.println("Instrument.play()");
//    }
//}
//
//
//class Wind extends Instrument {
//    // Redefine interface method:
//    public void play(Note n) {
//        System.out.println("Wind.play() " + n);
//    }
//}
// class Music {
//    public static void tune(Instrument i) {
//
//        i.play(Note.MIDDLE_C);
//    }
//    public static void main(String[] args) {
//        Wind flute = new Wind();
//        tune(flute); // Upcasting
//    }
//}
//
//class Stringed extends Instrument {
//    public void play(Note n) {
//        System.out.println("Stringed.play() " + n);
//    }
//}
//class Brass extends Instrument {
//    public void play(Note n) {
//        System.out.println("Brass.play() " + n);
//    }
//}
//
//class Music2 {
//    public static void tune(Wind i) {
//        i.play(Note.MIDDLE_C);
//    }
//    public static void tune(Stringed i) {
//        i.play(Note.MIDDLE_C);
//    }
//    public static void tune(Brass i) {
//        i.play(Note.MIDDLE_C);
//    }
//    public static void main(String[] args) {
//        Wind flute = new Wind();
//        Stringed violin = new Stringed();
//        Brass frenchHorn = new Brass();
//        tune(flute); // No upcasting
//        tune(violin);
//        tune(frenchHorn);
//    }
//}