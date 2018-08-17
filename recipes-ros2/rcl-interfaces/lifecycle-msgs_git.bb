SUMMARY = "The ROS client library common interfaces."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    rosidl-default-generators \
    python3 \
"

RDEPENDS_${PN} = " \
    rosidl-default-runtime \
"


include rcl-interfaces.inc

