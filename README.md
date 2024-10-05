# Simple Micronaut Application with Gradle and Docker support

## Run using Gradle

```shell
./gradlew run -t --args="-micronaut.application.name=Micronaut"
```

# docker run -i --rm -e APP_NAME=Micronaut2 a002k/micronaut:latest

## [Semantic versioning](https://zoltanaltfatter.com/2020/04/10/semantic-versioning-with-jgitver/)

### Plugin [fr.brouillard.oss.gradle.jgitver](https://github.com/jgitver/gradle-jgitver-plugin)

```shell
./gradlew version
```

```shell
./gradlew version | grep Version | awk '{ print $2 }'
```

### Update version and add git tag

```shell
git tag 2024.11.1
```

## Update dependencies

### Plugin [com.github.ben-manes.versions](https://github.com/ben-manes/gradle-versions-plugin)

```shell
./gradlew dependencyUpdates
```

## Check dependencies

### Plugin [dependency-analysis-gradle-plugin](https://github.com/autonomousapps/dependency-analysis-gradle-plugin)

```shell
./gradlew buildHealth
```

## Run docker image

```shell
docker run -i --rm -e APP_NAME=Micronaut --env-file ./.env a002k/micronaut
```

```shell
docker run -d --name micronaut --rm a002k/micronaut
```

- ```-i``` Keep STDIN open even if not attached
- ```--rm``` Remove container after stop
- ```-e``` [Set environment variables](https://docs.docker.com/reference/cli/docker/container/run/#env)
- ```--env-file``` set file name with environment variables
- ```-d``` Detach mode, Run container in background and print container ID

or via docker-compose

```shell
docker compose run -d --name micronaut --rm micronaut
```

and follow ```-f``` logs

```shell
docker logs -f micronaut
```

to stop

```shell
docker stop micronaut
```

## Run docker image as docker-compose

```shell
docker compose up -d
```

and follow ```-f``` logs

```shell
docker compose logs -f micronaut
```

to stop

```shell
docker compose down
```

[![Github Action Badge](https://github.com/ak-git/Micronaut/actions/workflows/actions.yml/badge.svg)](https://github.com/ak-git/Micronaut/actions/workflows/actions.yml/badge.svg)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Micronaut&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ak-git_Micronaut)