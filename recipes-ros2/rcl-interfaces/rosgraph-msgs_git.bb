SUMMARY = "The ROS client library common interfaces."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=44ab9b48c919d2b057943bac3f0b8ed5"
DEPENDS = " \
    rosidl-default-generators \
    builtin-interfaces \
"

RDEPENDS_${PN} = " \
    rosidl-default-runtime \
"

include rcl-interfaces.inc

