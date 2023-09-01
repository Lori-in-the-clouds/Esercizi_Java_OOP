package oop.basic;

public class Letter {
    String from;
    String to;

    StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
        lines.append("Dear "+to+":"+"\n");
    }

    public void addLine(String line) {
        lines.append("\n");
        lines.append(line);
    }
    public String getText() {
        lines.append("\n\n");
        lines.append("Sincerely,");
        lines.append("\n\n");
        lines.append(from);
        return lines.toString();
    }
}
