package org.example;

import org.openqa.selenium.By;

public class LocatorsStrategies {

    public static final String baseURL = "https://support.mozilla.org/en-US/questions/firefox?show=all";

    public static final By ASKQUESTION = By.xpath("//a[text()='Ask a Question']");
    public static final By SEARCH_INPUT = By.xpath("//input[@id='search-q' and contains(@placeholder, 'Search questions')]");
    public static final By FIRST_POST = By.xpath("//div[@id='questions-list']/section/article[1]");
    public static final By FIRST_5_POSTS = By.xpath("//div[@id='questions-list']/section/article[position() <= 5]");
    public static final By FIRST_POST_TIME = By.xpath("(//div[@id='questions-list']//article)[1]//div[@class='forum--user-meta']/p[@class='user-meta-asked-by']/text()[2]");
    public static final By RESPONDED_POSTS = By.xpath("//div[@id='questions-list']//article[.//li[span[@class='forum--meta-key']/preceding-sibling::span[@class='forum--meta-val' and number(text()) > 0]]]");
    public static final By ONE_HOUR_POSTS = By.xpath("//div[@id='questions-list']//article[.//p[@class='user-meta-asked-by']/text()[2][contains(., '1 hour ago')]]");
    public static final By QUESTION_MARK_TITLES = By.xpath("//div[@id='questions-list']//article[.//h2[@class='forum--question-item-heading']/a[contains(text(), '?')]]");
    public static final By AUTHOR_STARTS_WITH_D = By.xpath("//div[@id='questions-list']//article[.//p[@class='user-meta-asked-by']//a[starts-with(normalize-space(text()),'D') or starts-with(normalize-space(text()), 'd')]]");
    public static final By MORE_THAN_2_REPLIES = By.xpath("//div[@id='questions-list']//article[.//li[span[@class='forum--meta-key']/preceding-sibling::span[@class='forum--meta-val' and number(text()) > 2]]]");
    public static final By TITLE_STARTS_WITH_P = By.xpath("//div[@id='questions-list']//article[.//h2[@class='forum--question-item-heading']/a[starts-with(normalize-space(text()),'P') or starts-with(normalize-space(text()), 'p')]]");
    public static final By TITLE_LENGTH_14_PLUS = By.xpath("//div[@id='questions-list']//article[string-length(.//h2[@class='forum--question-item-heading']/a/text()) > 14]");
    public static final By WINDOWS_11_TAG = By.xpath("//div[@id='questions-list']//article[.//ul[@class='tag-list push-right']/li/a[contains(text(), 'Windows 11')]]");
    public static final By NO_REPLIES_POSTS = By.xpath("//div[@id='questions-list']//article[.//dl[contains(@class, 'forum--meta-details')]//li[span[@class='forum--meta-key' and normalize-space(text()) = 'replies'] and span[@class='forum--meta-val' and normalize-space(text()) = '0']]]");
}
