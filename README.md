# wr-ros-demo

## Overview

wr-ros-demo provides recipes for building ROS 2 nodes for performance testing, including realtime performance testing.

## Project License

The source code for this project is provided under the MIT license.
Text for any dependencies and other applicable license notices can be found in
the LICENSE-NOTICES.txt file in the project top level directory. Different
files may be under different licenses. Each source file should include a
license notice that designates the licensing terms for the respective file.


## Prerequisites

URI: git://github.com/ros/meta-ros.git

branch: thud-draft


URI: git://github.com/openembedded/bitbake.git

branch: master


URI: git://github.com/openembedded/meta-openembedded.git

branch: thud

## Installation

Clone this layer to your layers directory and add its path to your bblayers.conf file. The following recipes can then be appended to your image:

ros-performance: provides the performance_test node for testing latency of ROS communication protocols

realtime-support-examples: provides tests for ROS realtime performance

## More information

https://github.com/ApexAI/performance_test/blob/master/README.md

https://github.com/ros2/realtime_support/blob/master/rttest/README.md

## Legal Notices

All product names, logos, and brands are property of their respective owners. All company,
product and service names used in this software are for identification purposes only.
Wind River and VxWorks are registered trademarks of Wind River Systems, Inc. UNIX is a
registered trademark of The Open Group.

Disclaimer of Warranty / No Support: Wind River does not provide support
and maintenance services for this software, under Wind River’s standard
Software Support and Maintenance Agreement or otherwise. Unless required
by applicable law, Wind River provides the software (and each contributor
provides its contribution) on an “AS IS” BASIS, WITHOUT WARRANTIES OF ANY
KIND, either express or implied, including, without limitation, any warranties
of TITLE, NONINFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR
PURPOSE. You are solely responsible for determining the appropriateness of
using or redistributing the software and assume any risks associated with
your exercise of permissions under the license.
