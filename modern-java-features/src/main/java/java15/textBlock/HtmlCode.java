package java15.textBlock;

public class HtmlCode {
    String getHtml() {
        // implement here
        // rewrite using text block

        return """
                <!DOCTYPE html>
                <html>
                  <head>
                    <meta charset="utf-8">
                    <title>My test page</title>
                  </head>
                  <body>
                    <img src="images/firefox-icon.png" alt="My test image">
                  </body>
                </html>
                """;
    }
}
