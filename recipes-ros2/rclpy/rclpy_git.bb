SUMMARY = "Package containing the Python client."
HOMEPAGE = "https://github.com/ros2/rclpy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=6e6fd9f84c9a0ee41525c3a7e8ccdd9f"
DEPENDS = " \
        python-cmake-module \
        rcl \
"

SRCREV = "eb973791b3e9bb2d02f476c5351d5ac4d91d4492"
SRC_URI = "git://github.com/ros2/rclpy.git;protocol=git;"

RDEPENDS_${PN} += "${PYTHON_PN}-multiprocessing"

inherit ament
