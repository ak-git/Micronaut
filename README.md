# Simple Micronaut Application with Gradle and Docker support

## Run using Gradle

```shell
./gradlew run -t
```

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
docker run --rm a002k/micronaut
```

or in detach ```-d``` mode

```shell
docker run -d --name micronaut --rm a002k/micronaut
```

or via docker-compose

```shell
docker compose run -d --name micronaut --rm micronaut
```

and show logs

```shell
docker logs micronaut
```

to stop

```shell
docker stop micronaut
```

## Run docker image as docker-compose

```shell
docker compose up -d
```

and show logs

```shell
docker compose logs micronaut
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