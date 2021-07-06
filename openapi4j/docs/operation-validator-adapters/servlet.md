---
layout: default
title: Servlet
parent: Operation validator adapters
---

# Servlet
{:.no_toc}

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Installation

Add the following to your `pom.xml` :

```xml
<dependency>
    <groupId>org.openapi4j</groupId>
    <artifactId>openapi-operation-servlet</artifactId>
</dependency>
```
[![Release version](https://img.shields.io/nexus/r/org.openapi4j/openapi-schema-validator?style=for-the-badge&color=blue&label=Release&server=https%3A%2F%2Foss.sonatype.org)](https://search.maven.org/search?q=g:org.openapi4j%20a:openapi-operation-servlet)
[![Snapshot version](https://img.shields.io/nexus/s/org.openapi4j/openapi-schema-validator?style=for-the-badge&color=blue&label=Snapshot&server=https%3A%2F%2Foss.sonatype.org)](https://oss.sonatype.org/content/repositories/snapshots/org/openapi4j/openapi-operation-servlet/)

## Usage

Requests and responses are wrapped with the specific adapter.
```java
// Servlet
Request request = ServletRequest.of(HttpServletRequest hsr);
// validate...
```

| Library         | Version     | Client | Server                  | Dependency                   |
|-----------------|-------------|--------|-------------------------|------------------------------|
| Servlet         | `>= 2.0`    | No     | ServletRequest          | The spec dependency you use  |

## License

[See main page](../index.md#license)
