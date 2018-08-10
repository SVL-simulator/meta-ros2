SUMMARY = "The ROS client library in C++."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    ament_cmake_ros \
    rcl-lifecycle \
    rmw-implementation \
    rosidl-default-generators \
    std-msgs \
    lifecycle-msgs \
"

RDEPENDS_${PN} = " \
    rclcpp \
    rcl-lifecycle \
    rclpy \
    rmw-implementation \
    rosidl-default-runtime \
    std-msgs \
    lifecycle-msgs \
"

SRCREV = "1869b84a0ca60f758f63f6374b641a5bd93c3fca"
SRC_URI = "git://github.com/ros2/rclcpp.git;protocol=git;"

inherit ament pythonpath-insane
