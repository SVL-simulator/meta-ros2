SUMMARY = "colcon-common-extensions build tool package for ROS2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=d36ab912b8b544b7412f2d84c52072f1"

SRCNAME = "colcon-common-extensions"

SRC_URI = "https://pypi.python.org/packages/source/R/colcon-common-extensions/${SRCNAME}-${PV}.tar.gz"

inherit setuptools3

SRC_URI[sha256sum]="64b2c1e5f9f560fa9c3fe19048f72e1df78b873b1a4df65c5e2b266bd37df17f"

