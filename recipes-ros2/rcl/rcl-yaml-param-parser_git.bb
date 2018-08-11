SUMMARY = "The ROS client library common implementation."
HOMEPAGE = "https://github.com/ros2/rcl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=89107418266ec3939bf29fe09bf8a035"
DEPENDS = " \
    ament-cmake-ros \
    libyaml \
    rcutils \
    rcl \
"

include rcl.inc

SRC_URI += " \
    file://0001-drop-libyaml-vendor-dependency.patch;patchdir=.. \
"
