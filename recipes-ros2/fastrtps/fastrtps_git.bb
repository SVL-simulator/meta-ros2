SUMMARY = "Implementation of RTPS Standard."
HOMEPAGE = "https://github.com/eProsima/Fast-RTPS"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
DEPENDS = "asio libtinyxml2 fastcdr"

SRCREV = "ea57f15aaf689144cb8e75aa8d23e7b6ed832b3a"
SRC_URI = "git://github.com/eProsima/Fast-RTPS.git;protocol=git; \
           file://0001-don-t-use-INSTALL_INTERFACE.patch \
           "

S = "${WORKDIR}/git"

inherit cmake

do_install_append() {
    rm -r ${D}/usr/examples
}
