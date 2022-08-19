# Автоматизация тестирования приложений на Android:  <img width="6%" title="Android Studio" src="images/logo/Wikipedia.png"> Wikipedia
> Википедия - общедоступная универсальная интернет-энциклопедия со свободным контентом. 

# <a name="Содержание">Содержание:</a>
+ [Описание](#Описание)
+ [Используемые технологии](#ИспользуемыеТехнологии)
+ [Реализация проверок](#РеализацияПроверок)
+ [Запуск тестов](#ЗапускТестов)
  + [Запуск тестов локально из терминала](#ЗапускТестовЛокальноИзТерминала)
  + [Файлы с параметрами](#ФайлыСПараметрами)
  + [Запуск тестов из Jenkins](#ЗапускТестовИзJenkins)
+ [Оповещение в Telegram](#ОповещениеВTelegram)
+ [Отчет о результатах прохождения тестов в Allure Report](#ОтчетОРезультатахПрохожденияТестовВAllureReport)
+ [Интеграция с Allure TestOps](#ИнтеграцияСAllureTestOps)
  + [Список тестовых случаев в проекте](#СписокТестовыхСлучаевВПроекте)
  + [Запуск Jenkins задач из TestOps](#ЗапускJenkinsЗадачИзTestOps)
  + [Dashboards](#Dashboards)
+ [Интеграция с Jira](#ИнтеграцияСJira)
+ [Видео о прохождении тестов](#ВидеоОПрохожденииТестов)

# <a name="Описание">Описание</a>

# <a name="ИспользуемыеТехнологии">Используемые технологии</a>
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

# <a name="РеализацияПроверок">Реализация Проверок</a>

> Проверка  поиска в Wikipedia
> 
> Проверка вкладок на стартовой странице Wikipedia

# <a name="Запусктестов">Запуск тестов</a>

## <a name="ЗапускТестовЛокальноИзТерминала">Запуск тестов локально из терминала</a>

```bash
gradle clean android -DdeviceHost=browserstack
```

```bash
gradle clean android -DdeviceHost=emulation
```

```bash
gradle clean android -DdeviceHost=real
```

## <a name="ФайлыСПараметрами">Файлы с параметрами</a>
Browserstack параметры 
```bash
device_value=
os_version=
project_name=
build_value=
name_value=first_test
bs_URL=
```
## <a name="ЗапускТестовИзJenkins">Запуск тестов из Jenkins</a>


# <a name="ОповещениеВTelegram">Оповещение в Telegram</a>

# <a name="ОтчетОРезультатахПрохожденияТестовВAllureReport">Отчет о результатах прохождения тестов в Allure Report</a>

# <a name="ИнтеграцияСAllureTestOps">Интеграция с Allure TestOps</a>

## <a name="СписокТестовыхСлучаевВПроекте">Список тестовых случаев в проекте</a>
## <a name="ЗапускJenkinsЗадачИзTestOps">Запуск Jenkins задач из TestOps</a>
## <a name="Dashboards">Dashboards</a>

# <a name="ИнтеграцияСJira">Интеграция с Jira</a>

# <a name="ВидеоОПрохожденииТестов">Видео о прохождении тестов</a>





## :arrow_forward: _Команда запуска тестов удаленно в Jenkins_

```bash
clean android -DdeviceHost=${DEVICEHOST}
```