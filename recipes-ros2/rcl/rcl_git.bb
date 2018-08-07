SUMMARY = "The ROS client library common implementation."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    ament-cmake-ros \
    rcl-interfaces \
    rmw-implementation \
"

SRCREV = "c643edcbab9659a18fd512588a9c2fab8dae22bd"
SRC_URI = "git://github.com/ros2/rcl.git;protocol=git;"

inherit ament
