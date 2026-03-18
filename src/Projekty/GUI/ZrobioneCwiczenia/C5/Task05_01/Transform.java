package FinalneMarcinaIMoje.Task05_01;

@FunctionalInterface
interface Transform<T, R> {
    R apply(T s);
}