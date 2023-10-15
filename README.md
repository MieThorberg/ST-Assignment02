# Assignment #2

## 1 Reflections

---

### 1.1 Computer mouse 🐭
Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.

> I would perform the following types of test on a computer mouse:
>
> - **Unit testing:** I would test the individual parts of the mouse to ensure that they work as intended. For example ensure that the scroll or buttons function well.
>
>
> - **Integration testing:** I would test that the individual parts of the mouse work together as intended. For example that the scroll and buttons functions works well together.
>
>
> - **System testing:** I would test that the mouse as a whole works as intended and works well with the computer.
>
>
> - **Acceptance testing:** I would test that the mouse are acceptable for the user and meets the user's requirements.

### 1.2 Catastrophic failure ✈️
Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?

> **The story:**
> Boeing 737 max 8 crash in 2018 and 2019 due to a software error in the MCAS (Maneuvering Characteristics Augmentation System) system.
[(Link to the story).](https://www.fierceelectronics.com/electronics/killer-software-4-lessons-from-deadly-737-max-crashes)
>

> **What happened:**
>
> The MCAS system was designed to prevent the plane from stalling. The system was designed to use the angle of attack sensor to determine if the plane was stalling. If the sensor detected that the plane was stalling, the system would automatically push the nose of the plane down.
>
>The problem was that the system would only use one of the two angle of attack sensors. If the sensor was faulty, the system would push the nose of the plane down even if the plane was not stalling. This caused the plane to crash.


> **A test that would have prevented it:**
>
> The software engineers should have tested the MCAS system with both angle of attack sensors to make sure that the system would not push the nose of the plane down if only one of the sensors was faulty.
>
>Unit testing, integration testing and also system testing could have been used to test the system to prevent this. For example test the system with both sensors, and also test the system with only one of the sensors to test the system's reaction to a faulty sensor.

## 2 Two Katas

---

### 2.1 String utility ✏️
Use BDD to create a string utility with the following methods: `reverse string`, `capitalize string` and `lowercase string`.

> See the three methods `reverse(String s)`, `capitalize(String s)` and `lowercase(String s)` in the class-file: `src/main/java/utility/StringConverter.java`
>
> See the feature files: `reverse.feature`, `capitalize.feature` and `lowercase.feature` in the folder: `src/test/resources/org/katas/utility`
>
> See the test implementations in the files: `ReverseDefinitions.java`,`CapitalizeDefinitions.java` and `LowercaseDefinitions.java`. Located in the folder: `src/test/java/org/katas/utility`



### 2.2 Bowling game kata 🎳
Complete the bowling game kata using BDD.

> See the class-file: `src/main/java/bowling/Game.java` to see the implementation of the bowling game.
>
> I have made three features for the bowling game: `game.feature`, `spare.feature` and `strike.feature`. The features are located in the  folder: `src/test/resources/org/katas/bowling`.
>
> See the test-files `GameDefinitions.java`, `SpareDefinitions.java` and `StrikeDefinitions.java` to see the tests for the scenarios. The test-files are located in the folder: `src/test/java/org/katas/bowling`.


## 3 Investigation of tools

--- 

### 3.1 JUnit 5 🧐
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful

>`@Tag`
>
> The `@Tag` annotation is used to tag test methods with a name. It can be used to filter the tests. It can be useful when we only want to certain test then we can use tags to groups these tests.

>`@Disabled`
>
> The `@Disabled` annotation can be used both on a test class and a test method. It is used to disable the test methods. It can be useful in situations when we want to keep the test method but not run it.

>`@RepeatedTest`
>
> The `@RepeatedTest` annotation is used for a test method to repeat the test. It takes a parameter for the number of repetitions. It can be useful when we want to test a method multiple times for example to test if the method is stable.

>`@BeforeEach`, and `@AfterEach`
>
> The `@BeforeEach` and `@AfterEach` are annotations used to run a method before and after a method. We can use them to clean up after each test.

>`@BeforeAll`, and `@AfterAll`
> 
> The `@BeforeAll` and `@AfterAll` are annotations used to run a method before and after all the test methods. We can use them to clean up after all the tests are run.

>`@DisplayName`
> 
> The `@DisplayName` annotation is used to give a test method a custom name. It can be useful when we want to give our test methods a more descriptive name.

> `@Nested`
>
> The `@Nested` annotation is used to create a nested test class. This can be used to group tests together. It is useful when we want to test a class with multiple methods and get the test class to be more readable for the reader.

>`assumeFalse` and `assumeTrue`
> 
> The `assumeFalse` and `assumeTrue` methods are used to assume that a condition is true or false. For example if the condition is false then the test will be aborted. It can be useful in situation when we want to test a method but only if a condition is true or false.


### 3.2 Mocking frameworks 🤔
Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)

> #### *What are their similarities?*
> 
>  Mockito and MockMVC are both mocking frameworks for Java. We use both to mock objects to prevent us from having to use the real objects in our tests.
>

> #### *What are their differences?*
> Overall, Mockito is used to mock objects in unit tests, while MockMVC is used to mock objects in integration tests.
> 
> With Mockito we can mock single objects to test the individual parts of our application. We can also mock multiple objects to test the interaction between the objects.
>
> With MockMVC framework we focus on the web layer of our application. The MockMVC extends the Mockito framework and adds the ability to send HTTP requests and responses. This means that we can use it to mock the HTTP requests and responses. [See examples with integration test with MockMVC here.](https://www.baeldung.com/integration-testing-in-spring)
>

> #### *Which one would you prefer, if any, and why?*
> It depends on the situation. I would prefer to use Mockito when working with unit tests, and MockMVC when working with integration tests.
> The two frameworks are similar but have different purposes and therefor I would use them in different situations.
> 