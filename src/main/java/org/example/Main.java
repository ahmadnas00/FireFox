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


        //printRespondedPostTitles(driver);

        //printLongTitlePosts(driver);

        //printPostsWithQuestionMark(driver);

        //printPostsWithNoReplies(driver);

        printPostsTitleStartsWithP(driver);


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

    public static void printLongTitlePosts(WebDriver driver) {
        List<WebElement> posts = driver.findElements(LocatorsStrategies.TITLE_LENGTH_14_PLUS);

        System.out.println("Posts with titles length >= 14:");
        for (int i = 0; i < posts.size(); i++) {
            try {
                WebElement titleElement = posts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
                String title = titleElement.getText();
                System.out.println((i + 1) + ". " + title + " (length: " + title.length() + ")");
            } catch (NoSuchElementException e) {
                System.out.println((i + 1) + ". [Title not found]");
            }
        }
    }


    public static void printPostsWithQuestionMark(WebDriver driver) {
        List<WebElement> posts = driver.findElements(LocatorsStrategies.QUESTION_MARK_TITLES);
        System.out.println("Posts with '?' in the title:");
        for (int i = 0; i < posts.size(); i++) {
            WebElement titleElement = posts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
            System.out.println((i + 1) + ". " + titleElement.getText());
        }
    }

    public static void printPostsWithNoReplies(WebDriver driver) {
        List<WebElement> posts = driver.findElements(LocatorsStrategies.NO_REPLIES_POSTS);
        System.out.println("Posts without replies (0 replies):");
        for (int i = 0; i < posts.size(); i++) {
            WebElement titleElement = posts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
            System.out.println((i + 1) + ". " + titleElement.getText() + " (0 replies)");
        }
    }


    public static void printPostsTitleStartsWithP(WebDriver driver) {
        List<WebElement> posts = driver.findElements(LocatorsStrategies.TITLE_STARTS_WITH_P);
        System.out.println("Posts with title starting with 'P' or 'p':");
        for (int i = 0; i < posts.size(); i++) {
            WebElement titleElement = posts.get(i).findElement(By.cssSelector("h2.forum--question-item-heading > a"));
            System.out.println((i + 1) + ". " + titleElement.getText());
        }
    }

















}