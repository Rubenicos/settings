<h1 align="center">Settings</h1>

<h4 align="center">Java library to interpret multiple data formats as flexible configuration.</h4>

<p align="center">
    <a href="https://www.codefactor.io/repository/github/saicone/settings">
        <img src="https://www.codefactor.io/repository/github/saicone/settings/badge?style=flat-square"/>
    </a>
    <a href="https://github.com/saicone/settings">
        <img src="https://img.shields.io/github/languages/code-size/saicone/settings?logo=github&logoColor=white&style=flat-square"/>
    </a>
    <a href="https://github.com/saicone/settings">
        <img src="https://img.shields.io/tokei/lines/github/saicone/settings?logo=github&logoColor=white&style=flat-square"/>
    </a>
    <a href="https://jitpack.io/#com.saicone/settings">
        <img src="https://jitpack.io/v/com.saicone/settings.svg?style=flat-square"/>
    </a>
    <a href="https://javadoc.saicone.com/settings/">
        <img src="https://img.shields.io/badge/JavaDoc-Online-green?style=flat-square"/>
    </a>
    <a href="https://docs.saicone.com/settings/">
        <img src="https://img.shields.io/badge/Saicone-Settings%20Wiki-3b3bb0?logo=github&logoColor=white&style=flat-square"/>
    </a>
</p>

Settings library handle multiple data formats as configuration in a flexible way:

* Node templates and transformation.
* Node value substitution in non-compatible formats (like json and yaml).
* Fallback format reader.
* Iterable nodes.
* Data update parameters.
* Comparable paths to get nodes.
* Multi-layer node values.

Currently supporting the formats:

* [HOCON](https://github.com/lightbend/config/blob/main/HOCON.md)
* [JSON](https://www.json.org/) (with [Gson](https://github.com/google/gson))
* [TOML](https://toml.io/en/v1.0.0)
* [YAML](http://yaml.org/spec/1.1/current.html)

Take in count this library is not focused as an object serializer, the main purpose is making flexible interactions with multiple data formats at the same time.

It also has simple methods to get nodes as multiple data types if you want to implement your own object serializer.