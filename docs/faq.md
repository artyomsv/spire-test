# spire-test FAQ

## Where can I find repository documentation?

Start with the [documentation index](index.md) for links to the changelog,
contributor guidance, and land-related notes.

## How do I propose and validate a contribution?

Follow the [contributing guide](contributing.md): describe the problem, intended
result, and relevant tradeoffs, and keep each proposal focused on one purpose.
Discuss the scope of larger changes before implementation. Update relevant
documentation and record noteworthy changes in the changelog.

Report the validation you performed and its results in your proposal or pull
request, including any commands or manual checks. Explain what you could not
validate and why. For documentation, review rendered Markdown where possible,
check local links relative to the containing file, compare claims with repository
files, and inspect the final diff for unintended changes.

## What rules apply to Java changes?

Read the root [repository rules](../.codespire), also summarized in the
[contributing guide](contributing.md):

- Monetary amounts, including method parameters and return values, use `long`
  integer millicents. Never use `float`, `double`, or `BigDecimal` for money.
  Any monetary type other than `long` is a blocker and must stop the merge.
- Public methods reject null arguments with `IllegalArgumentException` before
  doing any other work. Public methods returning collections return empty
  collections rather than null.
- Types crossing a service boundary have names ending in `Dto`, `View`, or
  `Payload`; other suffixes are not allowed.

## Where can I find build and test guidance?

No build/test workflow is currently documented for this repository. Follow the
[contributing guide's validation guidance](contributing.md#validate-and-report-your-work)
to report your validation checks and results, along with any limitations and
their reasons.
