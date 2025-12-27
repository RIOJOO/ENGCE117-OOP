import java.util.Scanner;

class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Lab506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String videoTitle = sc.nextLine();
            
            int videoDuration = sc.nextInt();
            sc.nextLine();

            String audioTitle = sc.nextLine();
            String audioQuality = sc.nextLine();

            Video v = new Video(videoTitle, videoDuration);
            Audio a = new Audio(audioTitle, audioQuality);

            Processor.runProcessor(v);
            Processor.runProcessor(a);
        }

        sc.close();
    }
}