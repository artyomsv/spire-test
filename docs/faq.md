# spire-test FAQ

## Where are the Java sources?

Java sources live under [src/main/java/](../src/main/java/).

## Where is the documentation?

The repository's Markdown documentation, including this FAQ, lives in [docs/](./).

## Which rules apply to contributions?

[.codespire](../.codespire) is the authoritative source of repository rules. It
defines requirements for monetary values, public-method null handling, and names
of types that cross service boundaries, summarized below.

## How must monetary values be represented?

All monetary values are integer millicents represented by `long`. Never use
`float`, `double`, or `BigDecimal` for money. Methods accepting or returning a
monetary amount must use `long`. A monetary amount represented by any other type
is a blocker and must stop the merge.

## How must public methods handle nulls?

Public methods must reject null arguments with `IllegalArgumentException` before
doing any other work. Public methods that return collections must return an empty
collection instead of null.

## How must types crossing service boundaries be named?

Types that cross a service boundary must use one of the suffixes `Dto`, `View`, or
`Payload`. Any other suffix violates the repository rules.
