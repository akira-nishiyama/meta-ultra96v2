#
# This file is the tum dataset recipe.
#

SUMMARY = "Download tum dataset."
SECTION = "PETALINUX/apps"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://${THISDIR}/license/CC-BY-4.0;md5=0bc220f23336db2f1af1db16ff65b62e"

SRC_URI = "https://vision.in.tum.de/rgbd/dataset/freiburg1/rgbd_dataset_freiburg1_xyz.tgz \
    "

SRC_URI[md5sum] = "6ff22ca27c397385dde35009c60e3f6d"

S = "${WORKDIR}"

INHIBIT_DEFAULT_DEPS = "1"

do_install() {
    install -d ${D}/home/root/tum-dataset
#    tar xzvf ${WORKDIR}/rgbd_dataset_freiburg1_xyz.tgz -C ${D}$[datadir}/tum-dataset
    cp -r ${WORKDIR}/rgbd_dataset_freiburg1_xyz/* ${D}/home/root/tum-dataset
}

FILES_${PN} += "/home/root/tum-dataset/* \
"
