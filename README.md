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
  → Locate by ID and tag structure

- **First post** title and posted time  
  → Use relative XPath and text node extraction

- **All posts with replies (> 0)**  
  → Filter using numeric conditions

- **All posts without replies (= 0)**  
  → Find posts that contain 0 in the replies field

- **All titles that contain a question mark `?`**  
  → Use XPath `contains()` function

- **Titles starting with 'P' or 'p'**  
  → Use `starts-with()` and translate to handle case-insensitive match

- **Titles that are 14 characters or longer**  
  → Use `string-length()` condition

---

## 🧪 Sample XPath Examples

```xpath
//article[.//span[@class='forum--meta-val' and number(text()) > 0]]
