# XPath Showcase Project – Forum Data Extraction with Selenium

🎯 **Goal**:  
This project demonstrates advanced **XPath skills** by using Selenium WebDriver in Java to extract specific data from a forum-style webpage.

---

## 🧠 Focus of the Project

> This project is **not** about Java or programming logic.  
> It is meant to **showcase the use of complex and dynamic XPath expressions** to locate and filter web elements accurately.

---

## 🔍 What This Project Extracts Using XPath

Each XPath expression is written to handle real HTML structure challenges such as nested elements, text nodes, and conditional logic.

### ✅ Elements and Conditions

- **Ask a Question** button  
  `//a[text()='Ask a Question']`

- **Search box input**  
  `//input[@id='search-q' and contains(@placeholder, 'Search Support')]`

- **First post title and posted time**  
  `//div[@id='questions-list']/section/article[1]`  
  `(//div[@id='questions-list']//article)[1]//div[@class='forum--user-meta']/p[@class='user-meta-asked-by']/text()[2]`

- **First 5 posts**  
  `//div[@id='questions-list']/section/article[position() <= 5]`

- **All posts with replies (> 0)**  
  `//div[@id='questions-list']//article[.//li[span[@class='forum--meta-key']/preceding-sibling::span[@class='forum--meta-val' and number(text()) > 0]]]`

- **All posts without replies (= 0)**  
  `//div[@id='questions-list']//article[.//dl[contains(@class, 'forum--meta-details')]//li[span[@class='forum--meta-key' and normalize-space(text()) = 'replies'] and span[@class='forum--meta-val' and normalize-space(text()) = '0']]]`

- **All titles that contain a question mark `?`**  
  `//div[@id='questions-list']//article[.//h2[@class='forum--question-item-heading']/a[contains(text(), '?')]]`

- **All posts published exactly "1 hour ago"**  
  `//div[@id='questions-list']//article[.//p[@class='user-meta-asked-by']/text()[2][contains(., '1 hour ago')]]`

- **All posts where author's name starts with D or d**  
  `//div[@id='questions-list']//article[.//p[@class='user-meta-asked-by']//a[starts-with(normalize-space(text()),'D') or starts-with(normalize-space(text()), 'd')]]`

- **All posts with more than 2 replies**  
  `//div[@id='questions-list']//article[.//li[span[@class='forum--meta-key']/preceding-sibling::span[@class='forum--meta-val' and number(text()) > 2]]]`

- **Titles starting with 'P' or 'p'**  
  `//div[@id='questions-list']//article[.//h2[@class='forum--question-item-heading']/a[starts-with(normalize-space(text()),'P') or starts-with(normalize-space(text()), 'p')]]`

- **Titles that are 14 characters or longer**  
  `//div[@id='questions-list']//article[string-length(.//h2[@class='forum--question-item-heading']/a/text()) > 14]`

- **All posts with a "Windows 11" tag**  
  `//div[@id='questions-list']//article[.//ul[@class='tag-list push-right']/li/a[contains(text(), 'Windows 11')]]`

---

## 🧪 Sample XPath Examples

```xpath
//article[.//span[@class='forum--meta-val' and number(text()) > 0]]
