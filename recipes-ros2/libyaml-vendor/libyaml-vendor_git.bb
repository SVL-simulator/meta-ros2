SUMMARY = "Commonly needed Python modules, used by Python software developed at OSRF."
HOMEPAGE = "https://github.com/osrf/osrf_pycommon"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

SRCREV = "c69f385ebb8c971b9bdd2a87fc983c5a12b12811"
SRC_URI = "git://github.com/ros2/libyaml_vendor.git;protocol=git;"

inherit ament

S = "${WORKDIR}/git/"
