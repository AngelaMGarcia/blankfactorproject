#author: Angela Maria Muñoz Garcia

Feature: open hipertextual page
  As a web user
  I want to browse the page and search for an article
  to subscribe to the newsletter


  Background:
    Given that Angela open the page


  @test1
  Scenario: Search for a publication
    When she search for steve jobs
    Then she should read the post

  @test2
  Scenario: Subscribe to the newsletter
    When she enter the newsletter option
    Then she should subscribe to the newsletter



