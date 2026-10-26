# ADR 0001: Record architectural decisions

## Status

Proposed. Adoption of this practice is pending maintainer acceptance.

## Context

The repository has documentation for contributors and project changes, but no
existing architectural decision record (ADR) was found. A changelog describes
what changed; understanding a significant architectural choice also requires
knowing the constraints, alternatives, and tradeoffs behind it.

Keeping that reasoning in version-controlled documentation would give future
contributors a durable decision history to consult when evaluating changes.
This record proposes a documentation practice without asserting unverified
past decisions about the Java implementation.

## Decision

We propose recording significant architectural decisions as Markdown ADRs in
`docs/adr/`. Use a sequential number and descriptive filename, following this
record's example: `0001-record-architectural-decisions.md`.

Each record should have a descriptive title and the following sections:

- **Status:** State whether the decision is proposed, accepted, rejected, or
  superseded. Start as Proposed and record acceptance only after maintainers
  confirm it.
- **Context:** Explain the problem, relevant constraints, and why a decision is
  needed. Distinguish verified facts from assumptions.
- **Decision:** Describe the chosen or proposed approach and why it fits the
  context, including meaningful alternatives considered.
- **Consequences:** Describe the benefits, costs, and limitations contributors
  should account for when implementing or revisiting the decision.

Use ADRs for choices with lasting architectural impact or significant
tradeoffs, rather than routine implementation details. Review proposed records
as focused documentation changes under the [contributing guide](../contributing.md).
If an accepted decision is replaced, preserve its reasoning, mark it superseded,
and link to the replacement record so readers can follow the history.

Keeping rationale only in change discussions or changelog entries would avoid
maintaining a separate record, but would make the decision history harder to
find and follow. A Markdown record alongside the project offers a simple,
reviewable alternative without requiring a generator or additional dependencies.

ADRs supplement the existing [repository rules](../../.codespire); this proposal
does not change the rules for monetary representations, public-method null
handling, or service-boundary type naming.

## Consequences

Contributors would gain a consistent place to discover why significant choices
were made, evaluate their tradeoffs, and avoid repeating discussions without
their original context. This record also provides a complete example of the
structure and level of explanation expected for future ADRs.

Writing and reviewing records takes time. Maintainers would need to keep
statuses and links current and ensure that new records accurately describe
decisions. Limiting ADRs to significant choices keeps that effort proportionate;
there is no requirement to reconstruct every past design choice.

Records can become misleading if circumstances change without a corresponding
update or replacement. Preserving superseded records retains useful history,
but readers must check each record's status before treating it as current
guidance. Until this proposal is accepted, it documents a suggested practice,
not an established project requirement.
