DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
SRCNAME = "catkin_pkg"

SRC_URI = "https://pypi.python.org/packages/source/c/catkin_pkg/catkin_pkg-${PV}.tar.gz"
SRC_URI[md5sum] = "92ca21f8cbadc7164d47069f9bf18832"
#SRC_URI[md5sum] = "da93566c65dddfa9f821e18944c5ee5e"
SRC_URI[sha256sum] = "db0090c5c5d879899a68ce8f42684baceb78f52604d31aab48873941ff98ccf1"

S = "${WORKDIR}/${SRCNAME}-${PV}"

BBCLASSEXTEND = "native"
