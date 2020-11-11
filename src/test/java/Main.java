import java.io.IOException;

class Main {
        public static void main(String[] args) throws IOException {
            LazyInitializedSingleton l = LazyInitializedSingleton.getInstance();
            l.writeToFile("C://Users//Lena//IdeaProjects//ClassSev7//src//test//java//log.txt");
        }
    }



