# Contributing to spire-test

## Propose a focused change

Describe the problem or improvement you want to address and the intended result
in your change proposal or pull request. Include enough context for a reviewer
to understand why the change is useful. For larger changes, discuss the scope
before implementation.

Keep each change focused on one purpose. Avoid unrelated refactoring or
formatting changes, and explain any tradeoffs that affect the proposed solution.
Update relevant documentation alongside behavior or contributor workflow
changes, and record noteworthy changes in the [changelog](changelog.md).

## Write changelog entries

Write one line per change in the imperative mood, and put the ticket number at
the end of each entry.

## Follow the repository rules

Read the root [repository rules](../.codespire) before changing Java code:

- **Money:** All monetary amounts use `long` integer millicents, including method
  parameters and return values. Never use `float`, `double`, or `BigDecimal` for
  money. A monetary amount represented by any type other than `long` is a
  blocker and must stop the merge.
- **Nulls:** Public methods reject null arguments with `IllegalArgumentException`
  before doing any other work. Public methods returning collections return an
  empty collection instead of null.
- **Service boundaries:** Types that cross a service boundary must have names
  ending in `Dto`, `View`, or `Payload`. Other suffixes are not allowed.

## Validate and report your work

No build/test workflow is currently documented for this repository. Describe
how you validated your changes in your proposal or pull request, including any
commands or manual checks you performed and their results. State what you could
not validate and why so reviewers can assess the remaining gaps.

For documentation changes, review the rendered Markdown where possible, check
that local links resolve relative to the containing document, and compare the
text with the repository's actual files and rules. Review the final diff to
confirm that it contains only the intended changes.
