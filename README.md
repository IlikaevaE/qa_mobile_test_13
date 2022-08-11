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