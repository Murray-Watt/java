package org.mwatt.tutorial.classes;

public class ProfessionImpl implements Profession {
    private final ProfessionType professionType;

    @Override
    public ProfessionType getProfessionType() {
        return professionType;
    }

    public ProfessionImpl(ProfessionType professionType) {
       this.professionType = professionType;
    }

    @Override
    public long getExperience() {
        return 0;
    }

    @Override
    public void addExperience(long experience) {

    }

    @Override
    public void currentLevel() {

    }

    @Override
    public boolean canAdvance() {
        return false;
    }

    @Override
    public void advance() {

    }
}
