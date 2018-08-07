SUMMARY = "The command line tools for the ament buildsystem."
HOMEPAGE = "https://github.com/ament/ament_tools"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
DEPENDS = "osrf-pycommon ament-package"

SRCREV = "d238e0ed4f0adf529a330ae01ce1132b19e45ba4"
SRC_URI = "git://github.com/ament/ament_tools.git;protocol=git;"

S = "${WORKDIR}/git"

inherit setuptools3

PACKAGES_append = " ${PN}-completion"
FILES_${PN}-completion_append = " ${datadir}/ament_tools/environment"

BBCLASSEXTEND += "native"
