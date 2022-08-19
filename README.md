# Автоматизация тестирования приложений на Android:  <img width="6%" title="Android Studio" src="images/logo/Wikipedia.png"> Wikipedia
> Википедия - общедоступная универсальная интернет-энциклопедия со свободным контентом. 

# <a name="Содержание">Содержание:</a>
+ [Описание](#Описание)
+ [Используемые технологии](#Используемые технологии)
+ [Реализация проверок](#Реализация проверок)
+ [Запуск тестов](#Запуск тестов)
  + [Запуск тестов локально из терминала](#Запуск тестов локально из терминала)
  + [Запуск тестов из TestOps](#Запуск тестов из TestOps)
  + [Файлы с параметрами](#Файлы с параметрами)
  + [Запуск тестов из Jenkins](#Запуск тестов из Jenkins)
+ [Оповещение в Telegram](#Оповещение в Telegram)
+ [Отчет о результатах прохождения тестов в Allure Report](#Отчет о результатах прохождения тестов в Allure Report)
+ [Интеграция с Allure TestOps](#Интеграция с Allure TestOps)
  + [Список тестовых случаев в проекте](#Список тестовых случаев в проекте)
  + [Запуск Jenkins задач из TestOps](#Запуск Jenkins задач из TestOp)
  + [Dashboards](#Dashboards)
+ [Интеграция с Jira](#Интеграция с Jira)
+ [Видео о прохождении тестов](#Видео о прохождении тестов)

## Используемые технологии

<p align="center">
<img width="6%" title="IntelliJ" src="images/logo/IntelliJ.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="GitHub" src="images/logo/github.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Allure TestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Allure Report" src="images/logo/AllureReport.svg">
<img width="6%" title="Jira Cloud" src="images/logo/Jira.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Browserstack" src="images/logo/Browserstack.svg">
<img width="6%" title="Appium" src="images/logo/Appium.svg">
<img width="6%" title="Android Studio" src="images/logo/AndroidStudio.svg">
</p>















## :arrow_forward: _Команда запуска тестов локально в IntelliJ в терминале_

```bash
gradle clean android -DdeviceHost=browserstack
```

```bash
gradle clean android -DdeviceHost=emulation
```

```bash
gradle clean android -DdeviceHost=real
```

## :arrow_forward: _Команда запуска тестов удаленно в Jenkins_

```bash
clean android -DdeviceHost=${DEVICEHOST}
```