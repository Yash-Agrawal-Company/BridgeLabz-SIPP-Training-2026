public class AIInterviewBot {
    static class InterviewBot {
        private String botName;
        private String technology;

        public InterviewBot(String botName, String technology) {
            this.botName = botName;
            this.technology = technology;
        }

        public void conductInterview() {
            System.out.println("Bot [" + botName + "] is now conducting an interview on topic: " + technology);
        }
    }

    public static void main(String[] args) {
        InterviewBot bot1 = new InterviewBot("PyBot", "Python & ML");
        InterviewBot bot2 = new InterviewBot("JavaCoreBot", "Java Microservices");
        InterviewBot bot3 = new InterviewBot("ReactBot", "Frontend Development");

        bot1.conductInterview();
        bot2.conductInterview();
        bot3.conductInterview();
    }
}