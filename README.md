# meta-ros-performance

## Summary

meta-ros-performance provides recipes for building ROS 2 nodes for performance testing, including realtime performance testing.

## Dependencies

URI: git://github.com/ros/meta-ros.git

branch: thud-draft


URI: git://github.com/openembedded/bitbake.git

branch: master


URI: git://github.com/openembedded/meta-openembedded.git

branch: thud

## License

This project is provided under the terms of the MIT License. See LICENSE-NOTICES.txt for the license text.

## Installation

Clone this layer to your layers directory and add its path to your bblayers.conf file. The following recipes can then be appended to your image:

ros-performance: provides the performance_test node for testing latency of ROS communication protocols

realtime-support-examples: provides tests for ROS realtime performance

## More information

https://github.com/ApexAI/performance_test/blob/master/README.md

https://github.com/ros2/realtime_support/blob/master/rttest/README.md