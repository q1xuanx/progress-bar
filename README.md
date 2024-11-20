# Progress bar console in java 
![progress](https://github.com/user-attachments/assets/f3512370-7fcd-4b27-8c78-3444445c44df)

This project demonstrates how to create and use a simple progress bar in the console using Java. 
## 🖱️ Usage 
To use the progress bar in your Java application, follow these steps: 
### ♾️ Initialize the Progress Bar 
Create an instance of the `ProgressBar` class by specifying the total number of steps (`maxInternal`) and the desired length of the bar (`lengthOfBar`). 
### 🔄 Update the Progress Bar 
Use a loop to simulate progress and update the progress bar for each step. 
### 🚀 Example Here is an example of how to implement the progress bar in your main method:
```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int maxInternal = 1000; // Set maxium process
        int lengthOfBar = 50; // Set length of progress bar
        ProgressBar pb = new ProgressBar(maxInternal, lengthOfBar);
        for (int i = 1; i <= maxInternal; i++) {
            pb.makeProgress(i);
        }
    }
}
```
## 📥Dowload file jar here:
- Get the latest version of the progress bar JAR file: [Progress bar](https://drive.google.com/file/d/18PmvS8LOqWZZYfJbCW_rd9P_t5d3YQ4U/view?usp=sharing)
