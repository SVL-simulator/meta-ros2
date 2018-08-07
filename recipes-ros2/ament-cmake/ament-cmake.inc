HOMEPAGE = "https://github.com/ament/ament_cmake"

SRCREV = "7ab62a83055f7a14de9f2e65f60e166a99752eeb"
SRC_URI = "git://github.com/ament/ament_cmake.git;protocol=git;"

inherit cmake python3native

ROS_BPN = "${@d.getVar('BPN', True).replace('-', '_')}"

S = "${WORKDIR}/git/${ROS_BPN}"

do_install_append() {
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
}

FILES_${PN} += "${datadir}"

BBCLASSEXTEND += "native"
