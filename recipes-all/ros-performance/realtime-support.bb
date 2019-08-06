# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "ROS 2 Realtime Performance Testing"
SECTION = "ros-performance"
PR = "r0"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"


PACKAGES = "${PN}"

SRCREV = "8aef3d6eadbf35e5e57ee724463f68c02b3037cc"
#PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/ros2/realtime_support.git;branch=crystal"
SRC_URI[md5sum] = "71e9e0b609dfa6720b58df52f090e328"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.



#RDEPENDS_${PN} += " pycycler python-pyparsing std-msgs rclcpp rclpy osrf-testing-tools-cpp python3-numpy "

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.

#DEPENDS += " rosidl-generator-c-native python-cmake-module rclpy osrf-testing-tools-cpp rosidl-adapter-native sensor-msgs std-msgs rosidl-default-generators-native \
# cmake python3 fastrtps fastrtps-cmake-module ament-cmake-native rclcpp"


inherit pkgconfig cmake
#inherit ros_distro_crystal

#do_install(){
#  install -d ${D}${base_prefix}/root/performance_test_ws/src/performance_test     
#  cp -r ${S}/* ${D}${base_prefix}/root/performance_test_ws/
#}


#INHIBIT_PACKAGE_STRIP = "1"
#INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
#FILES_${PN} += " /usr/* "
FILES_${PN} += " /usr/share/* /usr/include/* "

#FILES_${PN} += " ${base_prefix}/root/performance_test_ws/src/performance_test/* "
#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}/git/rttest"


BBCLASSEXTEND = "native"
