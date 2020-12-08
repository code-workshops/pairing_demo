# Pair Programming Demo

Rehearse as needed before class. Its a super simple demo but even 1 practice session will go a long way.

## Code Snippets

For expedience, here are the snippets needed to get all the tests to pass. Any modifications should be rehearsed!

```java
public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public Number plus(Number num) {
        return new Number(5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        Number number = (Number) o;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
```