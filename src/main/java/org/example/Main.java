package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(LocatorsStrategies.baseURL);

        //printAskQuestionButton(driver);
        //printSearchBox(driver);
        //printFirstPostTitle(driver);
        //printFirstFivePosts(driver);

        printRespondedPostTitles(driver);

        driver.quit();
    }

    public static void printAskQuestionButton(WebDriver driver) {
        WebElement askQuestion = driver.findElement(LocatorsStrategies.ASKQUESTION);
        System.out.println("Ask a Question button text: " + askQuestion.getText());
    }

    public static void printSearchBox(WebDriver driver){
        WebElement searchInput = driver.findElement(LocatorsStrategies.SEARCH_INPUT);
        System.out.println("Search placeholder: " + searchInput.getAttribute("placeholder"));
    }

    public static void printFirstPostTitle(WebDriver driver) {
        WebElement firstPost = driver.findElement(LocatorsStrategies.FIRST_POST);
        WebElement titleElement = firstPost.findElement(By.cssSelector("h2.forum--question-item-heading > a"));
        String postTitle = titleElement.getText();
        System.out.println("First Post Title: " + postTitle);
    }

    public static void printFirstFivePosts(WebDriver driver){
        List<WebElement> FivePosts = driver.findElements(LocatorsStrategies.FIRST_5_POSTS);
        System.out.println("Titles of the first 5 posts:");
        for (int i = 0; i < FivePosts.size(); i++) {
            WebElement titleElement = FivePosts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
            String title = titleElement.getText();
            System.out.println((i + 1) + ". " + title);
        }
    }

    public static void printRespondedPostTitles(WebDriver driver) {
        List<WebElement> respondedPosts = driver.findElements(LocatorsStrategies.RESPONDED_POSTS);

        System.out.println("Titles of posts that have responses:");
        for (int i = 0; i < respondedPosts.size(); i++) {
            try {
                WebElement titleElement = respondedPosts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
                String title = titleElement.getText();
                System.out.println((i + 1) + ". " + title);
            } catch (NoSuchElementException e) {
                System.out.println((i + 1) + ". [No title found]");
            }
        }
    }












}