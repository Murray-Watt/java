package org.mwatt.tutorial.classes;

public enum ProfessionType {
    ACTOR("Actor"),
    ARCHITECT("Architect"),
    ARMOURER("Armourer"),
    BAKER("Baker"),
    BASKET_MAKER("Basket Maker"),
    BEE_KEEPER("Bee Keeper"),
    BLACKSMITH("Blacksmith"),
    BOWYER("Bowyer"),
    BREWER("Brewer"),
    BRICKLAYER("Bricklayer"),
    BRICK_MAKER("Brick Maker"),
    BUILDER("Builder"),
    BUTCHER("Butcher"),
    CABINET_MAKER("Cabinet Maker"),
    CARPENTER("Carpenter"),
    CHANDLER("Chandler"),
    COMIC("Comic"),
    COOPER("Cooper"),
    DISTILLER("Distiller"),
    ENGINEER("Engineer"),
    EXPLORER("Explorer"),
    GLACIER("Glacier"),
    GLASSBLOWER("Glassblower"),
    GOLDSMITH("Goldsmith"),
    LUMBERJACK("Lumberjack"),
    HERBALIST("Herbalist"),
    HERDER("Herder"),
    JEWELER("Jeweler"),
    MUSICIAN("Musician"),
    FARMER("Farmer"),
    FISHERMAN("Fisherman"),
    HUNTER("Hunter"),
    MINER("Miner"),
    PAINTER("Painter"),
    PAPER_MAKER("Paper Maker"),
    POTTER("Potter"),
    ROOFER("Roofer"),
    SOAP_MAKER("Soap Maker"),
    SADDLERS("Saddlers"),
    SCULPTOR("Sculptor"),
    SHEPHERD("Shepherd"),
    SPINNER("Spinner"),
    SURVEYORS("Surveyors"),
    TRAPPER("Trapper"),
    TANNER("Tanner"),
    TAILOR("Tailor"),
    WEAVER("Weaver"),
    WHEELWRIGHT("Wheelwright"),
    WELL_DIGGERS("Well Diggers"),
    ;

    ProfessionType(String name) {
    }
    public String getName() {
        return name();
    }
    @Override
    public String toString() {
        return getName();
    }
}
