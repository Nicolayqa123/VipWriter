package com;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class test404Url extends WebDriverSettings {

    String urlCheck = "https://pro-papers.com/argumentative-essay-writing";



    @Test
    public void TestLinks () {

        String[] page = {
        "/assignment-writing-service",
        "/dissertation-writing-services",
        "/homework-help-online",
        "/thesis-writing-services",
        "/contact",
        "/disputePolicy",
        "/guarantees",
        "/howItWorks",
        "/prices",
        "/research-papers-writing-service",
        "/terms",
        "/essay-help",
        "/pay-for-essay",
        "/write-my-essay",
        "/algebra-homework-help",
        "/argumentative-essay-writing",
        "/business-papers-writing-service",
        "/buy-analytical-essay",
        "/buy-cause-and-effect-essay",
        "/buy-comparative-essay",
        "/buy-compare-and-contrast-essay",
        "/buy-critical-analysis",
        "/buy-definition-essay",
        "/buy-descriptive-essay",
        "/buy-exploratory-essay",
        "/buy-expository-essay",
        "/buy-literary-essay",
        "/buy-mba-essay",
        "/buy-military-essay",
        "/buy-narrative-essay",
        "/buy-persuasive-essay",
        "/buy-reflective-essay",
        "/buy-response-essay",
        "/buy-scholarship-essay",
        "/buy-short-essay",
        "/college-admission-essay-writing",
        "/college-homework-help",
        "/coursework-writing",
        "/cover-letter-writing-services",
        "/cv-writing-services",
        "/english-homework-help",
        "/math-assignment-help",
        "/report-writing-service",
        "/resume-writing-service",
        "/review-paper-writing-service",
        "/school-homework-help",
        "/science-homework-help",
        "/term-paper-writing",
        "/research-paper-help",
        "/accounting-writing-service",
        "/ama-formatting-style-guides",
        "/annotated-bibliography-writing",
        "/anthropology-writing-service",
        "/apa-formatting-style-guides",
        "/application-letter-writing",
        "/archaeology-writing-service",
        "/architecture-writing-service",
        "/art-history-writing-service",
        "/article-review-writing",
        "/asa-formatting-style-guides",
        "/astronomy-writing-service",
        "/aviation-writing-service",
        "/biochemistry-writing-service",
        "/biography-writing",
        "/biology-writing-service",
        "/bluebook-citation-formatting-style-guides",
        "/book-review-writing",
        "/botany-writing-service",
        "/business-writing-service",
        "/buy-academic-cv",
        "/buy-analytical-thesis-statement",
        "/buy-book-critique",
        "/buy-business-school-application-essay",
        "/buy-capstone-project",
        "/buy-chronological-resume",
        "/buy-cold-contact-cover-letter",
        "/buy-combination-resume",
        "/buy-critical-review",
        "/buy-deductive-essay",
        "/buy-dissertation-discussion",
        "/buy-engineering-report",
        "/buy-entry-level-resume",
        "/buy-executive-cv",
        "/buy-experience-report",
        "/buy-feasibility-report",
        "/buy-formal-report",
        "/buy-functional-resume",
        "/buy-grad-school-application-essay",
        "/buy-grant-proposal-paper",
        "/buy-informal-essay",
        "/buy-internship-cover-letter",
        "/buy-internship-cv",
        "/buy-internship-resume",
        "/buy-investigation-report",
        "/buy-investor-business-plan",
        "/buy-journal-critique",
        "/buy-lab-report",
        "/buy-law-school-application-essay",
        "/buy-literature-essay",
        "/buy-mba-admission-essay",
        "/buy-med-school-application-essay",
        "/buy-military-cover-letter",
        "/buy-military-cv",
        "/buy-military-resume",
        "/buy-peer-review",
        "/buy-policy-report",
        "/buy-progress-report",
        "/buy-reaction-paper",
        "/buy-referral-cover-letter",
        "/buy-research-outline",
        "/buy-research-report",
        "/buy-science-report",
        "/buy-short-report",
        "/buy-speech",
        "/buy-startup-business-plan",
        "/buy-study-abroad-application-essay",
        "/buy-systematic-review",
        "/buy-technical-report",
        "/buy-workplace-report",
        "/case-study-writing",
        "/cbe-citation-formatting-style-guides",
        "/chemistry-writing-service",
        "/civics-writing-service",
        "/cms-formatting-style-guides",
        "/cognitive-science-writing-service",
        "/college-assignment-help",
        "/creative-writing",
        "/creditRefundPolicy",
        "/criminal-law-writing-service",
        "/criminology-writing-service",
        "/critical-appraisal-paper",
        "/culture-writing-service",
        "/custom-article-writing",
        "/disclaimer",
        "/dissertation-abstract-writing",
        "/dissertation-chapter-writing",
        "/dissertation-conclusion-writing",
        "/dissertation-hypothesis-writing",
        "/dissertation-introduction-writing",
        "/dissertation-methodology-writing",
        "/dissertation-proposal-writing",
        "/dissertation-results-writing",
        "/drama-writing-service",
        "/ecology-writing-service",
        "/economics-writing-service",
        "/education-writing-service",
        "/engineering-writing-service",
        "/english-literature-writing-service",
        "/english-writing-service",
        "/environmental-writing-service",
        "/FAQ",
        "/film-studies-writing-service",
        "/finance-writing-service",
        "/formatting-style-guides",
        "/gender-equality-writing-service",
        "/genetics-writing-service",
        "/geography-writing-service",
        "/geology-writing-service",
        "/health-writing-service",
        "/history-writing-service",
        "/hrm-writing-service",
        "/investment-writing-service",
        "/journalism-writing-service",
        "/law-writing-service",
        "/legal-and-policies",
        "/literature-review-writing",
        "/literature-writing-service",
        "/management-writing-service",
        "/marketing-writing-service",
        "/maths-homework-help",
        "/mc-gill-formatting-style-guides",
        "/medicine-writing-service",
        "/meta-analysis-writing",
        "/mla-formatting-style-guides",
        "/movie-review-writing",
        "/multiple-choice-questions",
        "/music-writing-service",
        "/nursing-writing-service",
        "/ourServices",
        "/our-subjects",
        "/oxford-formatting-style-guides",
        "/personal-statement-writing",
        "/philosophy-writing-service",
        "/physics-writing-service",
        "/plagiarism-checker",
        "/poetry-writing-service",
        "/political-science-writing-service",
        "/powerpoint-presentation",
        "/privacyPolicy",
        "/problem-solution-essay-writing",
        "/psychology-writing-service",
        "/referralProgram",
        "/religious-studies-writing-service",
        "/research-proposal-writing",
        "/revisionPolicy",
        "/school-assignment-help",
        "/shakespeare-writing-service",
        "/sitemap",
        "/sociology-writing-service",
        "/technology-writing-service",
        "/testimonials",
        "/theater-studies-writing-service",
        "/thesis-proposal-writing",
        "/thesis-statement-writing",
        "/university-assignment-help",
        "/urban-studies-writing-service",
        "/vancouver-formatting-style-guides",
        "/verification",
        "/world-affairs-writing-service",
        "/world-literature-writing-service",
        "/write-critical-thinking",
        "/write-report"};


        for (int x = 0; x < 212; x++) {



            /*Random r = new Random();
            int x = r.nextInt(2) + 1;*/

            // driver.get("asd");





           // String pages = page[x];
            driver.get("https://client.urgentpapers.org" + page[x]);
            String Title = driver.getTitle();
            if (Title.contains("Whoops! There was an error." ) || (Title.contains("404 Page Not Found - Pro-papers" ))){
                System.out.println(driver.getCurrentUrl() + "  ---  " + Title);
            } else {


                List<WebElement> links = driver.findElements(By.tagName("link"));


                System.out.println("Total links are " + links.size());

                for (int i = 0; i < links.size(); i++) {

                    WebElement ele = links.get(i);

                    String url = ele.getAttribute("href");

                    verifyLinkActive(url);


                }
            }
       // driver.close();
        }

    }
    public static void verifyLinkActive(String linkUrl)
    {

        try
        {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==404)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==500)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }

        } catch (Exception e) {

        }

    }



}


