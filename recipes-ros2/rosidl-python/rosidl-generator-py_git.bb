SUMMARY = "Generate the ROS interfaces in Python."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

include rosidl-python.inc

RDEPENDS_${PN} += "rmw-implementation rmw-implementation-cmake rosidl-generator-c rosidl-parser"

SRC_URI+= " \
    file://rosidl-python-byte-array-and-asserts.patch;patchdir=.. \
"
