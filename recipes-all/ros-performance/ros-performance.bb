
inherit ros_superflore_generated
DESCRIPTION = "ROS 2 Performance Testing"
SECTION = "ros-performance"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"


PACKAGES = "${PN}"

SRCREV = "b54b730a397bc71d2c743847cd220d79a93465d5"
#PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/ros2/performance_test.git;branch=no_fastrtps"
SRC_URI[md5sum] = "71e9e0b609dfa6720b58df52f090e328"

ROS_BPN = "performance_test"
# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.



RDEPENDS_${PN} += " pycycler python-pyparsing std-msgs rclcpp rclpy osrf-testing-tools-cpp python3-numpy "

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.

DEPENDS += " rosidl-generator-c-native python-cmake-module rclpy osrf-testing-tools-cpp rosidl-adapter-native sensor-msgs std-msgs rosidl-default-generators-native \
  cmake python3 fastrtps fastrtps-cmake-module ament-cmake-native rclcpp"


inherit ros_ament_cmake
inherit ros2_component

#do_install(){
#  install -d ${D}${base_prefix}/root/performance_test_ws/src/performance_test     
#  cp -r ${S}/* ${D}${base_prefix}/root/performance_test_ws/
#}


INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

#FILES_${PN} += " ${base_prefix}/root/performance_test_ws/src/performance_test/* "
#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}/git/performance_test"


BBCLASSEXTEND = "native"
