package com.company.behavioral.iterator;

public class JavaDeveloper implements Collection{
    private String name;
    private String[] skills;
    private Iterator iterator;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    private class DeveloperIterator implements Iterator{
        private int currentIndex;

        @Override
        public boolean hasNext() {
            if(currentIndex < skills.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[currentIndex++];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Iterator getIterator() {
        return new DeveloperIterator();
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }
}
