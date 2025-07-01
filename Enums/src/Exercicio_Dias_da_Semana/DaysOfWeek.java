package Exercicio_Dias_da_Semana;

public enum DaysOfWeek {
    Saturday(null),
    Friday(Saturday),
    Thursday(Friday),
    Wednesday(Thursday),
    Tuesday(Wednesday),
    Monday(Tuesday),
    Sunday(Monday);

    private final DaysOfWeek next;

    DaysOfWeek(DaysOfWeek next) {
        this.next = next;
    }

    public DaysOfWeek next() {
        return this.next == null ? Sunday : this.next;
    }
}
