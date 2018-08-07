SUMMARY = "The parser for the manifest files in the ament buildsystem."
HOMEPAGE = "https://github.com/ament/ament_package"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "d449c8b76410a1382a3c7358369e286ecd9a9108"
SRC_URI = "git://github.com/ament/ament_package.git;protocol=git;"

S = "${WORKDIR}/git"

inherit setuptools3

BBCLASSEXTEND += "native"
