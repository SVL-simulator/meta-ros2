SUMMARY = "The ROS launch tool."
HOMEPAGE = "https://github.com/ros2/launch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRCREV = "64df20d35e96aea085aaf97e636419349be6d8a2"
SRC_URI = "git://github.com/ros2/launch.git;protocol=git;"

S = "${WORKDIR}/git/launch"

DEPENDS = "osrf-pycommon"

RDEPENDS_${PN} += "${PYTHON_PN}-asyncio osrf-pycommon"

inherit setuptools3
