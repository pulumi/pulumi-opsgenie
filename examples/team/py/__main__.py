"""A Python Pulumi program"""

import pulumi
import pulumi_opsgenie as opsgenie

team = opsgenie.Team("test")

pulumi.export("team-name", team.name)
