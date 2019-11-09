package me.teamrocket.uno.card;

public class Card
{
    public enum Type
    {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        SKIP,
        REVERSE,
        PLUS2,
        PLUS4,
        WILD
    }

    public enum Color
    {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        WILD
    }

    private Card.Type type;
    private Card.Color color;

    public Card(Type type, Color color)
    {
        this.type = type;
        this.color = color;
    }

    public Type getType()
    {
        return type;
    }

    public Color getColor()
    {
        return color;
    }
}