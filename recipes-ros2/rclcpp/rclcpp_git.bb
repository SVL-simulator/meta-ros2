SUMMARY = "The ROS client library in C++."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rcl \
"

SRCREV = "1869b84a0ca60f758f63f6374b641a5bd93c3fca"
SRC_URI = "git://github.com/ros2/rclcpp.git;protocol=git;"

inherit ament pythonpath-insane
