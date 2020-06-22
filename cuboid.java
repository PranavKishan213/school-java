package com.company;

public class cuboid {
    static void function(float length, float width, float height)
    {
        float volume = length * height * width;
        float surface_area = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("The volume is: " + volume + " and the surface area is: " + surface_area);

    }
    public static void main(String[] args) {
        function(12, 5, 6);

    }
}

