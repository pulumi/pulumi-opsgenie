CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v0.6.6 of the OpsGenie Terraform Provider

---

## 1.1.0 (2021-11-11)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 1.0.2 (2021-08-12)
* Ensure that `opsgenie.scheduleRotation` allows both a `restriction` and a `restrictions` parameter. The presence of both and being lists
  meant that the `restriction` was mapping to `restrictions.

## 1.0.1 (2021-06-28)
* Upgrade to v0.6.5 of the OpsGenie Terraform Provider

## 1.0.0 (2021-04-19)
* Upgrade to v0.6.4 of the OpsGenie Terraform Provider
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 0.3.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 0.2.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 0.2.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 0.1.3 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider

## 0.1.2 (2021-02-15)
* Upgrade to v0.6.3 of the OpsGenie Terraform Provider

## 0.1.1 (2021-02-03)
* Updating project README to include missing package install commands

## 0.1.0 (2020-02-03)
* Initial creation of the provider against v0.6.2 of the OpsGenie Terraform Provider
