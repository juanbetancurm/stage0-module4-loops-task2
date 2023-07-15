package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int index = 0;
        String phrase = "";

        while (index < chars.length) {
            phrase += chars[index];
            index++;
        }

        System.out.print(phrase);
    }
}