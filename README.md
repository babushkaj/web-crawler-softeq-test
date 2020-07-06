It is an utilite, that allows you to crawl web-links and find mentions of words on web pages starting from a chosen "rootPage".

How to use...

There is an application.properties file, that contains several parameters.

- crawler.top-results-limit - number links in top result 
- crawler.max-depth - max links depth where the crawler will search your words 
- crawler.max-visited-pages - max page number which the crawler can visit
- crawler.root-url - from this url the crawler starts "digging"
- crawler.result-directory - directory, where the crawler place .csv files with results
- crawler.output-file - .csv file name to save the common result
- crawler.output-top-file  - .csv file name to save "sorted top" result
- crawler.words-to-find - array of words to find (Example: Tesla,Musk,Gigafactory,Elon Mask)


After work the crawler creates two files with results: the first for all visited pages and the second for "Top" pages (and shows this "Top" on your console, sure) 
